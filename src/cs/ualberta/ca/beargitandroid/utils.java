package cs.ualberta.ca.beargitandroid;

import android.content.Context;

import java.io.File;

/**
 * User: @author Tianyi Wu <tywtyw2002@gmail.com>
 * Date: 11/23/13
 * Time: 23:18
 */

public class utils {

    /**
     * Create a new Folder.
     */
    public static void createFolder(Context cxt, String name){
        File filepath = new File(cxt.getFilesDir() + "/" + name);
        if (! filepath.exists()){
            filepath.mkdirs();
        }
    }

}
