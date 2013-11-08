package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;

import cs.ualberta.ca.beargitandroid.Story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddLink extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_link);
		
		Button saveButton = (Button) findViewById(R.id.save2);
		
		saveButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				//The place you add the code that save the link to the database
				finish();
			}
		});
		
	}
}

