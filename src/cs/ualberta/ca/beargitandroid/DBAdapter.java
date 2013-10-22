package cs.ualberta.ca.beargitandroid;

import java.util.List;

import android.content.Context;




public class DBAdapter {

		private localDBAdapter localdb;
		private remoteDBAdapter remotedb;
		private Context cxt;
		
		public DBAdapter(Context context){
			this.cxt = context;
			this.localdb = new localDBAdapter(this.cxt);
			this.remotedb = new remoteDBAdapter();
		}
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
		 * @uml.property  name="entry"
		 * @uml.associationEnd  inverse="dBAdapter:cs.ualberta.ca.beargitandroid.Entry"
		 */
		private Entry entry;

		/**
		 * Getter of the property <tt>entry</tt>
		 * @return  Returns the entry.
		 * @uml.property  name="entry"
		 */
		public Entry getEntry() {
			return entry;
		}
		/**
		 * Setter of the property <tt>entry</tt>
		 * @param entry  The entry to set.
		 * @uml.property  name="entry"
		 */
		public void setEntry(Entry entry) {
			this.entry = entry;
		}



		/**
		 * @uml.property  name="homeScreen"
		 * @uml.associationEnd  inverse="dBAdapter1:cs.ualberta.ca.beargitandroid.HomeScreen"
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
		 * @uml.associationEnd  inverse="dBAdapter1:cs.ualberta.ca.beargitandroid.GameVIew"
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
