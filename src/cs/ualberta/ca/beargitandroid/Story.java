package cs.ualberta.ca.beargitandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.io.*;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.security.MessageDigest;

import android.os.Parcelable;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


/**
 * This is a Story Class
 * @author Tianyi Wu <tywtyw2002@gmail.com>
 */
public class Story implements Serializable{

    //private static final long serialVersionUID = 1L;

    private transient DBAdapter dbHelper;
    private ArrayList<Integer> gameInfo;
    //private HashMap<Integer, Chapter> chapterList;
    /** The chapter list. */
    private HashMap<Integer, Chapter> chapterList;
    private long id;
    private String title;
    private String filename;
    private String describe;
    private Date date;
    private String author;
    private int status;
    private HashMap<String, Object> dict;
    private int maxChapterID;
    private transient Context cxt;

    //this part for gson
    //private GsonBuilder builder;
    //private Gson gson;
    //private Type chapter_json;

    /**
     * create a new story object by story id.
     * If id == 0, will create a new empty story, otherwise, load story by id.
     * @param context android context
     * @param id story id
     */
    public Story(Context context, long id) {

        this.dbHelper = new DBAdapter(context);
        this.cxt = context;

        //initizal Gson library.
        //initGson();

        //load exist story
        if (id != 0){
            this.id = id;
            //load story
            loadOldStory();
            //load chapters list
            loadChapters();

        }else{
            this.id = 0;
            this.chapterList = new HashMap<Integer, Chapter>();
            this.maxChapterID = 1;
        }

    }

//    /**
//     * initizal Gson library.
//     */
//    private void initGson(){
//        GsonBuilder builder = new GsonBuilder();
//        Gson gson = builder.enableComplexMapKeySerialization().setPrettyPrinting().create();
//        Type chapter_json = new TypeToken<HashMap<Integer, Chapter>>(){}.getType();
//
//    }





    /**
     * create a new chapter
     * @return a empty new chapter object.
     */
    public Chapter createNewChapter(){
        //Chapter c = new Chapter(this, this.maxChapterID);
        Chapter c = new Chapter(this.maxChapterID);

        this.chapterList.put(this.maxChapterID, c);
        this.maxChapterID ++;
        return c;
    }

    /**
     * Get a list of exists game process,
     * @return a list of key (date, description, lastread) in object format. if no list, return null
     */
    public ArrayList<HashMap<String, Object>> getResumeList(){
        Cursor c = dbHelper.getResumeList(this.id);
        //check is empty or not
        if (c == null){
            return null;
        }

        SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat To = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<HashMap<String, Object>> l = new ArrayList<HashMap<String, Object>>();
        do{
            HashMap<String, Object> h = new HashMap<String, Object>();
            Date update;
            try{
                update = datetime.parse(c.getString(1));
            }catch (java.text.ParseException e){
                update = null;
            }

            String desc = "Resume "  + To.format(update) + "process";
            //do not need this.
//            if (c.getInt(0) == 1){
//                desc += " (FINISHED)";
//            }
            h.put("lastread",update);
            h.put("describe", desc);
            h.put("data", c.getString(2));
            l.add(h);
        }while(c.moveToNext());

        return l;

    }

    /**
     * save this resume Data
     */
    public void saveResumeData(){
        String s = dataToString(this.gameInfo);
        dbHelper.createNewResumeLog(s, this.id);

    }



    /**
     * load resume data of story.
     * @param data resume data.
     */
    public void reloadResumeData(String data){
        this.gameInfo = dataToArray(data);
        //after get resumedata, we delete this log in database
        dbHelper.removeResumeLog(data);
    }

    /**
     * converse resume String format data to ArrayList format.
     * @param data String format data
     * @return ArrayList format data.
     */
    private ArrayList<Integer> dataToArray(String data){
        ArrayList<Integer>  l = new ArrayList<Integer> ();
        String[] sarray = data.split(",");
        for (String x: sarray){
            l.add(Integer.parseInt(x));
        }
        return l;
    }


    /**
     * converse resume ArrayListing format data to String format.
     * @param data
     * @return
     */
    private String dataToString(ArrayList<Integer> data){
        String r = "";
        for (int x : data){
            r += x;
            r += ",";
        }
        //remove last ','
        return r.substring(0, r.length() - 1);

    }

    /**
     * load story info from database.
     */
    private void loadOldStory(){
        this.dict = this.dbHelper.loadStoryInfo(this.id);
        this.title = (String) dict.get("title");
        this.filename = (String) dict.get("filename");
        this.describe = (String) dict.get("describe");
        this.date = (Date) dict.get("date");
        this.status = (Integer) dict.get("status");
        this.author = (String) dict.get("author");
    }


    /**
     * create a new story
     *
     * @param title story title
     * @param describe story describe
     * @param author story author
     */
    public void createNewStory(String title, String describe, String author) {
        Date date = new Date();
        this.title = title;
        this.describe = describe;
        this.author = author;
        this.date = new Timestamp(date.getTime());
        this.filename = generateFilename();
        this.status = 3;

        //insert it in to db
        long id = this.dbHelper.create(generateCV());

        //get item id from insert, and set it to this.id
        if (id != -1)
            this.id = id;

    }

    /**
     * Modify story title, describe and author.
     * After call this function, story automatic update database.
     * @param title
     * @param describe
     * @param author
     */
    public void modifyStory(String title, String describe, String author){
        this.title = title;
        this.describe = describe;
        this.author = author;

        this.dbHelper.modify(this.id, generateCV());
    }



    /**
     * Generate a new ContentValues.
     * @return new ContentValues.
     */
    private ContentValues generateCV(){
        SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ContentValues cv = new ContentValues();
        cv.put("Title", this.title);
        cv.put("Description", this.describe);
        cv.put("Author", this.author);
        cv.put("Date", datetime.format(this.date));
        cv.put("Filename",this.filename);
        cv.put("Status",this.status);

        return cv;
    }
    /**
     * generate Filename of story
     *
     * @return story name = md5(author + Title + Description + timestamp)
     */
    private String generateFilename() {


        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }


        String inStr = this.author + this.title + this.describe + this.date.toString();

        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];

        byte[] md5Bytes = md5.digest(byteArray);
        StringBuilder hexValue = new StringBuilder();
        for (byte i : md5Bytes) {
            int val = ((int) i) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }

        return hexValue.toString();
    }

    /**
     * get chapter list with title and id, the result without the chapter which id equal give id.
     * @param id the chapter id that will exclude.
     * @return a chapter list without give chapter id.
     */
    public ArrayList<HashMap< String , String >> getChapterList(long id){
        ArrayList<HashMap< String ,String >> l = new ArrayList<HashMap<String, String>>();
        if (this.chapterList.isEmpty()){
            return null;
        }
        for (int x : this.chapterList.keySet()){
            if (x != (int) id){
                l.add(chapterList.get(x).getSummary());
            }
        }
        return l;
    }

    /**
     * Get All ChapterList  with title and id
     * @return a chapter list
     */
    public ArrayList<HashMap< String , String >> getAllChapterList(){
        return getChapterList(-1);
    }

    /**
     * return a dict of story info
     * @return ignore
     */
    public HashMap<String, Object> getStoryItem(){
        return this.dict;
    }



    public long getStoryID(){
        return this.id;
    }

    /**
     * converse Chapter List to json.
     * @return a json format Chapter List
     */
    public String ChapterstoJson() {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.enableComplexMapKeySerialization().setPrettyPrinting().create();
        Type chapter_json = new TypeToken<HashMap<Integer, Chapter>>(){}.getType();

        return gson.toJson(this.chapterList, chapter_json);
    }

    /**
     * Load Chapter List from json
     * @param data Json formate Chapter List
     */
    public void ChaptersFromJson(String data) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.enableComplexMapKeySerialization().setPrettyPrinting().create();
        Type chapter_json = new TypeToken<HashMap<Integer, Chapter>>(){}.getType();

        if (data.isEmpty()){
            this.chapterList = new HashMap<Integer, Chapter> ();
        }else{
            this.chapterList = gson.fromJson(data, chapter_json);
        }
    }


    /**
     * load Chapters from json.
     */
    private void loadChapters(){
        ChaptersFromJson(loadChapterFile());
    }



    private String loadChapterFile(){
        String path = "Story_" + this.filename + ".json";
        String json = "";
        try{
            utils.createFolder(this.cxt, "Story");

            File filePath = new File(this.cxt.getFilesDir() + "/Story/" + path);

            //if file not exists create a new file;
            if (! filePath.exists())
                filePath.createNewFile();

            BufferedReader fp = new BufferedReader(new FileReader(filePath));

            String c;
            while( (c = fp.readLine()) != null){
                json += c;
            }
            fp.close();

        } catch (Exception e){
            Log.w("IO", "CANNOT  READ FILE" + path);
            e.printStackTrace();
        }

        return json;
    }



    /**
     * Save Chapters list.
     */
    public void saveChapters(){

        saveChapterFile(ChapterstoJson());
    }


    /**
     * Save Chapters json file
     * @param data json format Chapter list
     */
    private void saveChapterFile(String data){
        String path = "Story_" + this.filename + ".json";

        try{
            utils.createFolder(this.cxt, "Story");

            File filePath = new File(this.cxt.getFilesDir() + "/Story/" + path);

            //if file not existe create a new file;
            if (! filePath.exists())
                filePath.createNewFile();

            BufferedWriter fp = new BufferedWriter(new FileWriter(filePath));

            fp.write(data);
            fp.close();

        } catch (Exception e){
            Log.v("IO", "CANNOT SAVE FILE" + path);
            e.printStackTrace();
        }
    }



    /**
     * get Chapter by id.
     * @param id chapter id
     * @return chapter object
     */
    public Chapter getChapter(long id) {
        this.gameInfo.add((int) id );
        return chapterList.get((int) id);
    }

    /**
     *  get the resume chapter.
     *  @return chapter object
     */
    public long getReloadChapterid(){
        int last = this.gameInfo.get(this.gameInfo.size() - 1);
        return (long) last;
    }



//    /**
//     *  upload Story to the internet
//     */
//    public void uploadStory(){
//
//    }

    /**
     * remove a chapter with give id.
     * @param id the chapter id, which you want to remove.
     */
    public void deleteChapter(long id){
        if (chapterList.containsKey(id)){
            chapterList.remove(id);
        }
    }


}
