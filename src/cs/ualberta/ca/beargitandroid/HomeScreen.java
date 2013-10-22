package cs.ualberta.ca.beargitandroid;

import android.app.Activity;


public class HomeScreen extends Activity {
	
	public void showLocal(){
		
	};
	
	public void showRemote(){
		
	};
	
	public void showCreate(){
		
	};
	
	public void search(){
		
	}

	/**
	 * @uml.property  name="gameVIew"
	 * @uml.associationEnd  inverse="homeScreen:cs.ualberta.ca.beargitandroid.GameVIew"
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

	/**
	 * @uml.property  name="editorView"
	 * @uml.associationEnd  inverse="homeScreen:cs.ualberta.ca.beargitandroid.EditorView"
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
	 * @uml.associationEnd  inverse="homeScreen:cs.ualberta.ca.beargitandroid.ViewStory"
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

	/**
	 * @uml.property  name="viewStory1"
	 * @uml.associationEnd  inverse="homeScreen1:cs.ualberta.ca.beargitandroid.ViewStory"
	 */
	private ViewStory viewStory1;

	/**
	 * Getter of the property <tt>viewStory1</tt>
	 * @return  Returns the viewStory1.
	 * @uml.property  name="viewStory1"
	 */
	public ViewStory getViewStory1() {
		return viewStory1;
	}

	/**
	 * Setter of the property <tt>viewStory1</tt>
	 * @param viewStory1  The viewStory1 to set.
	 * @uml.property  name="viewStory1"
	 */
	public void setViewStory1(ViewStory viewStory1) {
		this.viewStory1 = viewStory1;
	}

	/**
	 * @uml.property  name="dBAdapter"
	 * @uml.associationEnd  inverse="homeScreen:cs.ualberta.ca.beargitandroid.DBAdapter"
	 */
	private DBAdapter dbAdapter;

	/**
	 * Getter of the property <tt>dBAdapter</tt>
	 * @return  Returns the dbAdapter.
	 * @uml.property  name="dBAdapter"
	 */
	public DBAdapter getDBAdapter() {
		return dbAdapter;
	}

	/**
	 * Setter of the property <tt>dBAdapter</tt>
	 * @param dBAdapter  The dbAdapter to set.
	 * @uml.property  name="dBAdapter"
	 */
	public void setDBAdapter(DBAdapter dbAdapter) {
		this.dbAdapter = dbAdapter;
	};
	

}
