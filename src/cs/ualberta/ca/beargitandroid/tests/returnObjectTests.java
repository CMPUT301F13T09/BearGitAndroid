package cs.ualberta.ca.beargitandroid.tests;

import java.util.Observable;
import java.util.Observer;

public class returnObjectTests implements Observer{
	   private boolean status = false;
	   public void update(Observable obj, Object arg) {
		     this.status = true;
		   } 
	   public boolean getStatus(){
		   return this.status;
	   }
}
