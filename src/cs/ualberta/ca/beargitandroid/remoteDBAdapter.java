package cs.ualberta.ca.beargitandroid;


public class remoteDBAdapter {
	
		private final static String BSAR_URL = "http://cmput301.softwareprocess.es:8080/cmput301f13t09/";
		private final static String DATA_PATH = "data";
		
		/**
		 */
		public boolean update(Entry entry){
			return false;	
		}

			
			/**
			 * fetch one entry from website
			 */
			public Entry fetchEntry(long id){
				return null;
			}

			/**
			 * fetch story from internet
			 * @param id
			 */
			public void fetchSotry(long id){
				
			}
				
				/**
				 * create a new story to internet
				 * @param entry
				 */
				public void create(Entry entry){
				}

					/**
					 * remote story in the internet
					 * not use...... 
					 * only for development
					 * @param id
					 */
					public void remove(long id){
					}

				
}
