package cs.ualberta.ca.beargitandroid.controller;

import android.content.Context;
import android.widget.SimpleAdapter;
import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.View.R;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * The controller of Chapter
 * @author Tianyi Wu <tywtyw2002@gmail.com>
 */
public class ChapterController {

    private Chapter chapter;
    private Context cxt;

    public ChapterController(Context cxt, Chapter chapter){

        this.cxt = cxt;
        this.chapter = chapter;

    }

    public HashMap<String, String> getChapterInfo(){
        return chapter.getChapterToMap();
    }


    public ArrayList< HashMap<String, String>> getOptionList(){
        return chapter.getOptionList();
    }

    public Chapter getNextChapter(long id){
        return chapter.getNextChapter(id);
    }

    public SimpleAdapter clickOption(){

        ArrayList<HashMap< String , String >> l = chapter.getOptionList();

        if( l == null){

            return null;
        }

        String[] from = new String[] {"context"};
        int[] to = new int[] {R.id.option};

        return new SimpleAdapter(this.cxt,l, R.layout.chapter_option_row,from,to);


    }

    public void saveProcess(){

        this.chapter.saveReloadData();

    }
}
