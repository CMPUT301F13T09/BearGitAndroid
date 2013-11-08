package cs.ualberta.ca.beargitandroid;

import android.content.ContentValues;
import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.security.MessageDigest;

public class Story {

    private DBAdapter dbHelper;
    private ArrayList<Integer> gameInfo;
    //private HashMap<Integer, Chapter> chapterList;
    private Chapter[] chapterList;
    private long id;
    private String title;
    private String filename;
    private String describe;
    private Date date;
    private String author;
    private int status;



    /**
     * create a new story object by story id.
     * If id == 0, will create a new empty story, otherwise, load story by id.
     * @param context android context
     * @param id story id
     */
    public Story(Context context, long id) {

        this.dbHelper = new DBAdapter(context);

        //load exist story
        if (id != 0){
            this.id = id;
            //load story
            loadOldStory();
        }else{
            this.id = 0;
        }

    }

    /**
     * load story info from database.
     */
    private void loadOldStory(){
        HashMap<String, Object> c = this.dbHelper.loadStoryInfo(this.id);
        this.title = (String) c.get("title");
        this.filename = (String) c.get("filename");
        this.describe = (String) c.get("describe");
        this.date = (Date) c.get("date");
        this.status = (Integer) c.get("status");

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
     * Generate a new ContentValues.
     * @return new ContentValues.
     */
    private ContentValues generateCV(){
        SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ContentValues cv = new ContentValues();
        cv.put("title", this.title);
        cv.put("describe", this.describe);
        cv.put("author", this.author);
        cv.put("date", datetime.format(this.date));
        cv.put("filename",this.filename);
        cv.put("status",this.status);

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



    public long getStoryID(){
        return this.id;
    }


    public void toJson() {

    }

    public void getFromJson() {

    }


    public Chapter getChapter(long id) {
        return chapterList[(int) id];
    }

    /**
     *  upload Story to the internet
     */
    public void uploadStory(){

    }
}
