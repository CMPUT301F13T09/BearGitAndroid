package cs.ualberta.ca.beargitandroid;

import java.util.HashMap;

public abstract class Story extends Entry {

	public Entry entry;
	public HashMap<Integer, Chapter> chapterList;
	/**
	 * @uml.property  name="chapter"
	 * @uml.associationEnd  aggregation="composite" inverse="story:cs.ualberta.ca.beargitandroid.Chapter"
	 */
	private Chapter chapter;
	/**
	 * Getter of the property <tt>chapter</tt>
	 * @return  Returns the chapter.
	 * @uml.property  name="chapter"
	 */
	public Chapter getChapter() {
		return chapter;
	}
	/**
	 * Setter of the property <tt>chapter</tt>
	 * @param chapter  The chapter to set.
	 * @uml.property  name="chapter"
	 */
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	/** 
	 * @uml.property name="entry1"
	 * @uml.associationEnd aggregation="shared" inverse="story:cs.ualberta.ca.beargitandroid.Entry"
	 */
	private Entry entry1;
	/** 
	 * Getter of the property <tt>entry1</tt>
	 * @return  Returns the entry1.
	 * @uml.property  name="entry1"
	 */
	public Entry getEntry1() {
		return entry1;
	}
	/** 
	 * Setter of the property <tt>entry1</tt>
	 * @param entry1  The entry1 to set.
	 * @uml.property  name="entry1"
	 */
	public void setEntry1(Entry entry1) {
		this.entry1 = entry1;
	}
	/**
	 * @uml.property  name="editorView"
	 * @uml.associationEnd  inverse="story1:cs.ualberta.ca.beargitandroid.EditorView"
	 */
	private EditorView editorView;
	/**
	 * Getter of the property <tt>editorView</tt>
	 * @return  Returns the editorView.
	 * @uml.property  name="editorView"
	 */
	public EditorView getEditorView() {
		return editorView;
	}
	/**
	 * Setter of the property <tt>editorView</tt>
	 * @param editorView  The editorView to set.
	 * @uml.property  name="editorView"
	 */
	public void setEditorView(EditorView editorView) {
		this.editorView = editorView;
	}
	/**
	 * @uml.property  name="gameVIew"
	 * @uml.associationEnd  inverse="story1:cs.ualberta.ca.beargitandroid.GameVIew"
	 */
	private GameVIew gameVIew;
	/**
	 * Getter of the property <tt>gameVIew</tt>
	 * @return  Returns the gameVIew.
	 * @uml.property  name="gameVIew"
	 */
	public GameVIew getGameVIew() {
		return gameVIew;
	}
	/**
	 * Setter of the property <tt>gameVIew</tt>
	 * @param gameVIew  The gameVIew to set.
	 * @uml.property  name="gameVIew"
	 */
	public void setGameVIew(GameVIew gameVIew) {
		this.gameVIew = gameVIew;
	}
	
	
}
