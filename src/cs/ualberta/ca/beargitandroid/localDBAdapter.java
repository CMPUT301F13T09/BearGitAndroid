package cs.ualberta.ca.beargitandroid;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class localDBAdapter extends SQLiteOpenHelper {

    private Context cxt;
    private static final String DATABASE_NAME = "Story_db";
    private static final int DATABASE_VERSION = 1;


    public localDBAdapter (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.cxt = context;
    }


    /**
     * First time run app
     *
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE STORY_INFO ( \n" +
                "    ID          INT          PRIMARY KEY\n" +
                "                             NOT NULL\n" +
                "                             UNIQUE,\n" +
                "    Title       CHAR( 128 )  NOT NULL,\n" +
                "    Author      CHAR( 128 )  NOT NULL,\n" +
                "    Filename    CHAR( 32 )   NOT NULL\n" +
                "                             UNIQUE,\n" +
                "    Description TEXT,\n" +
                "    Date        DATETIME     NOT NULL,\n" +
                "    Status      INT( 1 )     NOT NULL \n" +
                ");";

        sql += "CREATE TABLE READ_PROCESS ( \n" +
                "    sid      INT       NOT NULL\n" +
                "                       REFERENCES STORY_INFO ( ID ),\n" +
                "    Lasttime DATETIME  NOT NULL,\n" +
                "    Data     TEXT      NOT NULL,\n" +
                "    Finish   INT( 1 )  NOT NULL\n" +
                "                       DEFAULT ( 0 ) \n" +
                ");";

        db.execSQL(sql);

    }

    /**
     * For update app database at the version update.
     * Now we don't do any things in here.
     * @param db  The database.
     * @param oldVersion   The old database version.
     * @param newVersion   The new database version.
     */
    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){

    }


    /**
     * raw query and return a cursor.
     * @param sql sql
     * @return Cursor
     */
    public Cursor query(String sql){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor != null)
            cursor.moveToFirst();
        return cursor;
    }

    /**
     * Update a row by SQL Query.
     * @param sql
     */
    public void update(String sql){
        query(sql);
    }


    /**
     * Update rows use system method.
     * @param table   the table to update in
     * @param value   a map from column names to new column values. null is a valid value that will be translated to NULL.
     * @param whereClause  the optional WHERE clause to apply when updating. Passing null will update all rows.
     * @param whereArgs  You may include ?s in the where clause, which will be replaced by the values from whereArgs. The values will be bound as Strings.
     * @return  the number of rows affected
     */
    public int update(String table, ContentValues value, String whereClause, String[] whereArgs){
        SQLiteDatabase db = this.getReadableDatabase();
        return db.update(table, value, whereClause, whereArgs);
    }


    /**
     *  Insert a row by SQL Query.
     * @param sql
     */
    public void insert(String sql){
        query(sql);
    }


    /**
     * Insert a row by android method
     * @param table  table name
     * @param values  values
     * @return row id, if meet error return -1.
     */
    public long insert(String table, ContentValues values){

        SQLiteDatabase db = this.getReadableDatabase();
        return db.insert(table, null, values);

    }






}
