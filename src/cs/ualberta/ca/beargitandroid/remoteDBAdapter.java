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

					/**
					 * @uml.property  name="dBAdapter"
					 * @uml.associationEnd  aggregation="composite" inverse="remoteDBAdapter:cs.ualberta.ca.beargitandroid.DBAdapter"
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
					 * @uml.associationEnd  inverse="remoteDBAdapter1:cs.ualberta.ca.beargitandroid.DBAdapter"
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

		
}
