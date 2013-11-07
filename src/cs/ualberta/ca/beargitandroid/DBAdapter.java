package cs.ualberta.ca.beargitandroid;


import java.util.Date;
import java.util.HashMap;
import java.util.List;


import java.text.SimpleDateFormat;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

/**
 *  DB adapter, do all of the db operate in this class.
 *  @author Tianyi Wu < tywtyw2002@gail.com >
 *  @version 0.1 beta
 *
 */

public class DBAdapter {

    private static final String STORY_TABLE = "STORY_INFO";
    private localDBAdapter localdb;
    private remoteDBAdapter remotedb;
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





    /**
     *  create a store save in local database
     *  @param cv The Story cv object.
     *  @return return the id of insert row, if failed return -1.
     */
    public long create(ContentValues cv){

        return localdb.insert(STORY_TABLE , cv);

    }



    /**
     *  Return a cursor by given sql.
     * @param sql sql string
     * @return return a cursor, Return null if no row find.
     */
    public Cursor getStoryList(String sql){

        return localdb.query(sql);
    }


    /**
     * Return a Story list with remote story(update remote Story)
     * @return Cursor of story
     */
    public Cursor getStoryListWithRemote(){
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
     * Read Story info from database
     * @param id
     * @return a hashmap of storyInfo.
     */
    public HashMap<String, Object> loadStoryInfo(long id){

        HashMap<String, Object> r = new HashMap<String, Object>() ;
        Cursor c = localdb.query("SELECT Title, Author, Filename, Date, Status from "+ STORY_TABLE + "where id = " +
                                    String.valueOf(id));

        //check cursor
        if (c == null)
            return null;

        //map cursor to hashmap
        r.put("title", c.getString(0));
        r.put("author", c.getString(1));
        r.put("filename", c.getString(2));
        SimpleDateFormat datetime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        try{
            r.put("date", datetime.parse(c.getString(3)));
        }catch(java.text.ParseException e){
            r.put("date", new Date());
        }

        r.put("status", c.getInt(4));

        return r;


    }


    /**
     * DELETE a row of story
     * @param id story id.
     */
    public void remove(long id){
        String sql = "DELETE from " + STORY_TABLE + "WHERE id = "
                    + String.valueOf(id);

        localdb.query(sql);
    }


    /**
     * fetch a story
     * if story not exist in localdb
     * download it from internet.
     * @param id
     * @return
     */
    public Entry fetch(long id){

        return null;
    }


    /**
     * download a story from internet
     * call remoteDBAdapter.fetchStory
     * @param id
     */
    private void download(long id){

    }



    /**
     * load story from local file storage
     * if story not in the local storage,
     * then download it from internet (call download)
     * @param id
     */

    public void loadStory(long id){


    }



    /**
     *  fetch all story information from local db
     */
    public List<Entry> fetchIndexLocal( ){

        return null;
    }

    /**
     * fetch all story information from remote db
     * after fetch index, save these information to localdb
     * @return
     */
    public List<Entry> fetchIndexRemote(){

        return null;
    }



    /**
     * update local data when user modify story
     * @param entry
     */
    public void modify(Entry entry){

    }




}
