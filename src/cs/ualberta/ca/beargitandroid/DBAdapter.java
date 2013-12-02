package cs.ualberta.ca.beargitandroid;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


import java.text.SimpleDateFormat;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

// TODO: Auto-generated Javadoc
/**
 *  DB adapter, do all of the db operate in this class.
 *  @author Tianyi Wu < tywtyw2002@gail.com >
 *  @version 0.1 beta
 *
 */

public class DBAdapter implements Serializable{

    /** The Constant STORY_TABLE. */
    private static final String STORY_TABLE = "STORY_INFO";
    private static final String PROCESS_TABLE = "READ_PROCESS";
    
    /** The localdb. */
    private localDBAdapter localdb;
    
    /** The remotedb. */
    private remoteDBAdapter remotedb;
    
    /** The cxt. */
    private Context cxt;

    /**
     * create DB Adapter.
     * @param context android context, usually be this.
     */
    public DBAdapter(Context context){
        this.cxt = context;
        this.localdb = new localDBAdapter(this.cxt);
        this.remotedb = new remoteDBAdapter();
    }

//  I think we dont need this function in here, just remove it.
//  commit on Nov 12, by @author Tianyi Wu <tywtyw2002@gmail.com>
//    /**
//     * Query.
//     *
//     * @param sql the sql
//     */
//    public Cursor query(String sql){
//    	return localdb.query(sql);
//    }


    /**
     * create a store save in local database.
     *
     * @param cv The Story cv object.
     * @return return the id of insert row, if failed return -1.
     */
    public long create(ContentValues cv){

        return localdb.insert(STORY_TABLE , cv);

    }

    /**
     * Resturn the story info list.
     * @param sql sql
     * @return a list of hashmap by give sql.
     */
    public ArrayList< HashMap<String ,Object>> getStoryListwithHashMap(String sql){
        ArrayList < HashMap<String ,Object>> l = new ArrayList<HashMap<String, Object>>();

        Cursor c = getStoryList(sql);
        
        if (c == null)
            return null;
        Log.v("xxx", c.toString());
        do {
            l.add(Cursor2HashMap(c));
        }while (c.moveToNext());
        return l;
    }


    /**
     *  Return a cursor by given sql.
     * @param sql sql string
     * @return return a cursor, Return null if no row find.
     *
     */
    private Cursor getStoryList(String sql){

        return localdb.query(sql);
    }



    /**
     * Return a Story list with remote story(update remote Story).
     *
     * @return a list of hashmap of story
     */
    public List< HashMap<String ,Object>> getRemoteStoryListwithHashMap(){
        ArrayList < HashMap<String ,Object>> l = new ArrayList<HashMap<String, Object>>();

        Cursor c = getStoryListWithRemote();

        if (c == null)
            return null;
        

        while (c.moveToNext()) {
            l.add(Cursor2HashMap(c));
        }
        return l;
    }

    /**
     * Return a Story list with remote story(update remote Story).
     *
     * @return Cursor of story
     */
    private Cursor getStoryListWithRemote(){
        return null;
    }



    /**
     * modify story info.
     * @param id story id.
     * @param cv story cv object.
     */
    public	void modify(long id, ContentValues cv){

        String[] args = {String.valueOf(id)};
        this.localdb.update(STORY_TABLE, cv, "ID=?", args);

    }


    /**
     * convser cursor to String-object hashmap.
     *
     * @param c the c
     * @return hashmap
     */
    private HashMap<String, Object> Cursor2HashMap (Cursor c){

        if (c == null)
            return null;

        HashMap<String, Object> r = new HashMap<String, Object>() ;

        //map cursor to hashmap
        r.put("id",c.getLong(0));
        r.put("uuid",c.getString(1));
        r.put("title", c.getString(2));
        r.put("author", c.getString(3));
        r.put("filename", c.getString(4));
        r.put("description", c.getString(5));
        SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            r.put("date", datetime.parse(c.getString(6)));
        }catch(java.text.ParseException e){
            r.put("date", new Date());
        }

        r.put("status", c.getInt(7));

        return r;

    }


    /**
     * Read Story info from database.
     *
     * @param id the id
     * @return a hashmap of storyInfo.
     */
    public HashMap<String, Object> loadStoryInfo(long id){


        Cursor c = localdb.query("SELECT * from "+ STORY_TABLE + " where id = " +
                                    String.valueOf(id));


        return Cursor2HashMap(c);


    }

    /**
     * Query and return a list of resume list.
     * @param storyID
     * @return
     */
    public Cursor getResumeList(long storyID){
        String sql = "SELECT * FROM " + PROCESS_TABLE + " WHERE sid = " + storyID;
        return localdb.query(sql);
    }


    public void createNewResumeLog(String data, long id){
        ContentValues cv = new ContentValues();
        cv.put("Data", data);
        cv.put("sid",id);
        cv.put("Lasttime", date2String(new Date()));
        localdb.insert(PROCESS_TABLE, cv );
    }


    public void removeResumeLog(String s){
        localdb.delete(PROCESS_TABLE, "Data = ?", new String [] {s} );
    }



    /**
     * DELETE a row of story.
     *
     * @param id story id.
     */
    public void remove(long id){
        String sql = "DELETE from " + STORY_TABLE + " WHERE id = "
                    + String.valueOf(id);

        localdb.query(sql);
    }

    private String date2String(Date date){
        SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return datetime.format(date);
    }



//    /**
//     * fetch a story
//     * if story not exist in localdb
//     * download it from internet.
//     * @param id
//     * @return
//     */
//    public Entry fetch(long id){
//
//        return null;
//    }


    /**
 * download a story from internet
 * call remoteDBAdapter.fetchStory
 *
 * @param id the id
 */
    private void download(long id){

    }



    /**
     * load story from local file storage
     * if story not in the local storage,
     * then download it from internet (call download).
     *
     * @param id the id
     */

    public void loadStory(long id){


    }



//    /**
//     *  fetch all story information from local db
//     */
//    public List<Entry> fetchIndexLocal( ){
//
//        return null;
//    }
//
//    /**
//     * fetch all story information from remote db
//     * after fetch index, save these information to localdb
//     * @return
//     */
//    public List<Entry> fetchIndexRemote(){
//
//        return null;
//    }








}
