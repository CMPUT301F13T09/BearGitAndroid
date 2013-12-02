package cs.ualberta.ca.beargitandroid.controller;

import android.content.Context;
import android.widget.SimpleAdapter;
import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
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
    private Story story;
    private long id;

    public ChapterController(Context cxt, Story story, long id){

        this.cxt = cxt;
        this.story = story;
        if (id == -1){
            this.chapter = story.createNewChapter();
        }else{
            this.chapter = story.getChapter(id);
        }


    }

    public HashMap<String, String> getChapterInfo(){
        return chapter.getChapterToMap();
    }


    public ArrayList< HashMap<String, String>> getOptionList(){
        return chapter.getOptionList();
    }

    public Chapter getNextChapter(long id){

        return story.getChapter(id);
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
        this.story.saveResumeData();
        //this.chapter.saveReloadData();

    }

    public void modifyChapter(String title, String context){
        this.chapter.modifyContext(title, context);
        this.story.saveChapters();
        //this.chapter.saveChapter();
    }

    /**
     * return chapterList except self
     * @return
     */
    public SimpleAdapter chapterList(){
        ArrayList<HashMap< String , String >> l = this.story.getChapterList(this.id);

        if( l == null){

            return null;
        }

        String[] from = new String[] {"title"};
        int[] to = new int[] {R.id.option};

        return new SimpleAdapter(this.cxt,l, R.layout.chapter_option_row,from,to);

    }


    public void deleteChapter(){
        this.story.deleteChapter(this.id);
    }

    public void addoption(String title, long id){
        this.chapter.addOption(title, id);

    }

    public void modifyoption(long id, String context, long nextid){
        this.chapter.modifyOption( id, context, nextid);
    }


    public void removeiption(long id){
        this.chapter.removeOption(id);

    }

    public void randompick(){




    }

}
