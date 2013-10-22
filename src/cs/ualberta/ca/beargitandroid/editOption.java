package cs.ualberta.ca.beargitandroid;


public class editOption {
	
	private void showLink(){
		
	}
    public void save(){
    	
    }
    public void delete(){
    	
    }
	/** 
	 * @uml.property name="chapterEditer"
	 * @uml.associationEnd inverse="editOption1:cs.ualberta.ca.beargitandroid.chapterEditer"
	 */
	private chapterEditer chapterEditer;
	/** 
	 * Getter of the property <tt>chapterEditer</tt>
	 * @return  Returns the chapterEditer.
	 * @uml.property  name="chapterEditer"
	 */
	public chapterEditer getChapterEditer() {
		return chapterEditer;
	}
	/** 
	 * Setter of the property <tt>chapterEditer</tt>
	 * @param chapterEditer  The chapterEditer to set.
	 * @uml.property  name="chapterEditer"
	 */
	public void setChapterEditer(chapterEditer chapterEditer) {
		this.chapterEditer = chapterEditer;
	}
}
