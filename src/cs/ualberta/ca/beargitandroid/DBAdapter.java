package cs.ualberta.ca.beargitandroid;

import java.util.List;




public class DBAdapter {

		
		/**
		 *  create a store save in local database
		 */
		public void create(Entry entry){
		}

		
		/**
		 * upload a store to remote DB
		 * @param entry
		 */
		public	void upload(Entry entry){
			//story = load sotry
			//remotedbadapter.create(entry, sotry)
			

			//localDBAdaoter.finalize(id);
			
		}
		
		
		
		public void remove(long id){
	
		}
		
		
		/**
		 * fetch a story
		 * if story not exist in localdb
		 * download it from internet.
		 * @param id
		 * @return
		 */
		public Entry fetch(long id){
			
			return null;
		}
		
		
		/**
		 * download a story from internet
		 * call remoteDBAdapter.fetchStory
		 * @param id
		 */
		private void download(long id){
			
		}
		
		
		
		/**
		 * load story from local file storage
		 * if story not in the local storage, 
		 * then download it from internet (call download)
		 * @param id
		 */
		
		public void loadStory(long id){
			
			
		}
		
		
		
		/**	
		 *  fetch all story information from local db
		 */
		public List<Entry> fetchIndexLocal( ){
			
			return null;
		}
		
		/**
		 * fetch all story information from remote db
		 * after fetch index, save these information to localdb
		 * @return
		 */
		public List<Entry> fetchIndexRemote(){
			
			return null;
		}
		
		
		
		/**
		 * update local data when user modify story
		 * @param entry
		 */
		public void modify(Entry entry){
			
		}



		/** 
		 * @uml.property name="localDBAdapter"
		 * @uml.associationEnd aggregation="composite" inverse="dBAdapter:cs.ualberta.ca.beargitandroid.localDBAdapter"
		 */
		private localDBAdapter localDBAdapter;



		/** 
		 * Getter of the property <tt>localDBAdapter</tt>
		 * @return  Returns the localDBAdapter.
		 * @uml.property  name="localDBAdapter"
		 */
		public localDBAdapter getLocalDBAdapter() {
			return localDBAdapter;
		}


		/** 
		 * Setter of the property <tt>localDBAdapter</tt>
		 * @param localDBAdapter  The localDBAdapter to set.
		 * @uml.property  name="localDBAdapter"
		 */
		public void setLocalDBAdapter(localDBAdapter localDBAdapter) {
			this.localDBAdapter = localDBAdapter;
		}



		/**
		 * @uml.property  name="remoteDBAdapter"
		 * @uml.associationEnd  inverse="dBAdapter:cs.ualberta.ca.beargitandroid.remoteDBAdapter"
		 */
		private remoteDBAdapter remoteDBAdapter;



		/**
		 * Getter of the property <tt>remoteDBAdapter</tt>
		 * @return  Returns the remoteDBAdapter.
		 * @uml.property  name="remoteDBAdapter"
		 */
		public remoteDBAdapter getRemoteDBAdapter() {
			return remoteDBAdapter;
		}


		/**
		 * Setter of the property <tt>remoteDBAdapter</tt>
		 * @param remoteDBAdapter  The remoteDBAdapter to set.
		 * @uml.property  name="remoteDBAdapter"
		 */
		public void setRemoteDBAdapter(remoteDBAdapter remoteDBAdapter) {
			this.remoteDBAdapter = remoteDBAdapter;
		}



		/**
		 * @uml.property  name="remoteDBAdapter1"
		 * @uml.associationEnd  aggregation="composite" inverse="dBAdapter1:cs.ualberta.ca.beargitandroid.remoteDBAdapter"
		 */
		private remoteDBAdapter remoteDBAdapter1;



		/**
		 * Getter of the property <tt>remoteDBAdapter1</tt>
		 * @return  Returns the remoteDBAdapter1.
		 * @uml.property  name="remoteDBAdapter1"
		 */
		public remoteDBAdapter getRemoteDBAdapter1() {
			return remoteDBAdapter1;
		}


		/**
		 * Setter of the property <tt>remoteDBAdapter1</tt>
		 * @param remoteDBAdapter1  The remoteDBAdapter1 to set.
		 * @uml.property  name="remoteDBAdapter1"
		 */
		public void setRemoteDBAdapter1(remoteDBAdapter remoteDBAdapter1) {
			this.remoteDBAdapter1 = remoteDBAdapter1;
		}



		/**
		 * @uml.property  name="homeScreen"
		 * @uml.associationEnd  inverse="dBAdapter:cs.ualberta.ca.beargitandroid.HomeScreen"
		 */
		private HomeScreen homeScreen;



		/**
		 * Getter of the property <tt>homeScreen</tt>
		 * @return  Returns the homeScreen.
		 * @uml.property  name="homeScreen"
		 */
		public HomeScreen getHomeScreen() {
			return homeScreen;
		}


		/**
		 * Setter of the property <tt>homeScreen</tt>
		 * @param homeScreen  The homeScreen to set.
		 * @uml.property  name="homeScreen"
		 */
		public void setHomeScreen(HomeScreen homeScreen) {
			this.homeScreen = homeScreen;
		}



		/**
		 * @uml.property  name="gameVIew"
		 * @uml.associationEnd  inverse="dBAdapter:cs.ualberta.ca.beargitandroid.GameVIew"
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
		 * @uml.associationEnd  inverse="dBAdapter:cs.ualberta.ca.beargitandroid.EditorView"
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
