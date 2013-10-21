package cs.ualberta.ca.beargitandroid;

import android.app.Activity;
/**
 * 
 * @author shuxiao
 *Have yet to figure it out
 */
public class Json extends Activity {
	public void JtoS(){
		
	}
	
	public void StoJ(){
		
	}

	/**
	 * @uml.property  name="editorView"
	 * @uml.associationEnd  inverse="json:cs.ualberta.ca.beargitandroid.EditorView"
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
	 * @uml.property  name="viewStory"
	 * @uml.associationEnd  inverse="json:cs.ualberta.ca.beargitandroid.ViewStory"
	 */
	private ViewStory viewStory;

	/**
	 * Getter of the property <tt>viewStory</tt>
	 * @return  Returns the viewStory.
	 * @uml.property  name="viewStory"
	 */
	public ViewStory getViewStory() {
		return viewStory;
	}

	/**
	 * Setter of the property <tt>viewStory</tt>
	 * @param viewStory  The viewStory to set.
	 * @uml.property  name="viewStory"
	 */
	public void setViewStory(ViewStory viewStory) {
		this.viewStory = viewStory;
	}
}
