package cs.ualberta.ca.beargitandroid;

import java.util.List;

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

        return localdb.insert("STORY_INFO", cv);

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
     * upload a store to remote DB
     * @param entry
     */
    public	void upload(Entry entry){
        //story = load sotry
        //remotedbadapter.create(entry, sotry)


        //localDBAdaoter.finalize(id);

    }



    public void remove(long id){

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
