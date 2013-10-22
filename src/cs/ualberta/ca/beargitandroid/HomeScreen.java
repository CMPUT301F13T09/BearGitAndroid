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
	}

	/**
	 * @uml.property  name="dBAdapter1"
	 * @uml.associationEnd  inverse="homeScreen:cs.ualberta.ca.beargitandroid.DBAdapter"
	 */
	private DBAdapter dbAdapter1;

	/**
	 * Getter of the property <tt>dBAdapter1</tt>
	 * @return  Returns the dbAdapter1.
	 * @uml.property  name="dBAdapter1"
	 */
	public DBAdapter getDBAdapter1() {
		return dbAdapter1;
	}

	/**
	 * Setter of the property <tt>dBAdapter1</tt>
	 * @param dBAdapter1  The dbAdapter1 to set.
	 * @uml.property  name="dBAdapter1"
	 */
	public void setDBAdapter1(DBAdapter dbAdapter1) {
		this.dbAdapter1 = dbAdapter1;
	}

	/**
	 * @uml.property  name="viewStory2"
	 * @uml.associationEnd  inverse="homeScreen:cs.ualberta.ca.beargitandroid.ViewStory"
	 */
	private ViewStory viewStory2;

	/**
	 * Getter of the property <tt>viewStory2</tt>
	 * @return  Returns the viewStory2.
	 * @uml.property  name="viewStory2"
	 */
	public ViewStory getViewStory2() {
		return viewStory2;
	}

	/**
	 * Setter of the property <tt>viewStory2</tt>
	 * @param viewStory2  The viewStory2 to set.
	 * @uml.property  name="viewStory2"
	 */
	public void setViewStory2(ViewStory viewStory2) {
		this.viewStory2 = viewStory2;
	}

	/**
	 * @uml.property  name="viewStory3"
	 * @uml.associationEnd  inverse="homeScreen1:cs.ualberta.ca.beargitandroid.ViewStory"
	 */
	private ViewStory viewStory3;

	/**
	 * Getter of the property <tt>viewStory3</tt>
	 * @return  Returns the viewStory3.
	 * @uml.property  name="viewStory3"
	 */
	public ViewStory getViewStory3() {
		return viewStory3;
	}

	/**
	 * Setter of the property <tt>viewStory3</tt>
	 * @param viewStory3  The viewStory3 to set.
	 * @uml.property  name="viewStory3"
	 */
	public void setViewStory3(ViewStory viewStory3) {
		this.viewStory3 = viewStory3;
	}

	/**
	 * @uml.property  name="gameVIew1"
	 * @uml.associationEnd  inverse="homeScreen1:cs.ualberta.ca.beargitandroid.GameVIew"
	 */
	private GameVIew gameVIew1;

	/**
	 * Getter of the property <tt>gameVIew1</tt>
	 * @return  Returns the gameVIew1.
	 * @uml.property  name="gameVIew1"
	 */
	public GameVIew getGameVIew1() {
		return gameVIew1;
	}

	/**
	 * Setter of the property <tt>gameVIew1</tt>
	 * @param gameVIew1  The gameVIew1 to set.
	 * @uml.property  name="gameVIew1"
	 */
	public void setGameVIew1(GameVIew gameVIew1) {
		this.gameVIew1 = gameVIew1;
	};
	

}
