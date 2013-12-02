package cs.ualberta.ca.beargitandroid.controller;

import android.content.Context;
import cs.ualberta.ca.beargitandroid.Chapter;

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


}
