package cs.ualberta.ca.beargitandroid;

import android.app.Activity;


public class chapterEditer extends Activity {
	
	static long ID;
	private Story story[];
	private Chapter chapter[];
	
	public void chapter(){
		
	}
	public void chapterShow(){
		
	}
	public void editOption( ){
		
	}
	public void addMedia(){
		
	}
    public void save(){
    	
    }
    public void delete(){
    	
    	
    }
	/** 
	 * @uml.property name="editOption1"
	 * @uml.associationEnd aggregation="composite" inverse="chapterEditer:cs.ualberta.ca.beargitandroid.editOption"
	 */
	private editOption editOption1;

	/** 
	 * Getter of the property <tt>editOption1</tt>
	 * @return  Returns the editOption1.
	 * @uml.property  name="editOption1"
	 */
	public editOption getEditOption1() {
		return editOption1;
	}
	/** 
	 * Setter of the property <tt>editOption1</tt>
	 * @param editOption1  The editOption1 to set.
	 * @uml.property  name="editOption1"
	 */
	public void setEditOption1(editOption editOption1) {
		this.editOption1 = editOption1;
	}
	/**
	 * @uml.property  name="editorView"
	 * @uml.associationEnd  inverse="chapterEditer:cs.ualberta.ca.beargitandroid.EditorView"
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
    
}
