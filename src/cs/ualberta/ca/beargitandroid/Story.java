package cs.ualberta.ca.beargitandroid;

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
    private Timestamp date;
    private String author;
    private int status;

    public Story(long id) {
        if (id != 0)
            this.id = id;
    }

    /**
     * create a new story
     *
     * @param title
     * @param describe
     * @param author
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

        //get item id from insert, and set it to this.id
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
