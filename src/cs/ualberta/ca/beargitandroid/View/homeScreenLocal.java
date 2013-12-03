package cs.ualberta.ca.beargitandroid.View;


import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.controller.HomeScreen;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TabHost;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TabHost.OnTabChangeListener;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class homeScreenLocal extends TabActivity implements OnTabChangeListener,SearchView.OnQueryTextListener {

	private TabHost myTabhost;
	protected int myMenuSettingTag=0;
	protected Menu myMenu;
	private HomeScreen HSC;
	private static final int myMenuResources[] = { R.menu.main,
		R.menu.main, R.menu.main};
	private ListView StoryList;
	private ListView CreateList;
	private SearchView searchView;
	ArrayAdapter<String> adapter;
	/* (non-Javadoc)
	 * @see android.app.ActivityGroup#onCreate(android.os.Bundle)
	 */
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.HSC = new HomeScreen(this);
		myTabhost=this.getTabHost();
		//get Tabhost
		LayoutInflater.from(this).inflate(R.layout.home_screen_local, myTabhost.getTabContentView(), true);
		SearchView searchView = (SearchView) findViewById(R.id.searchView1);
		Button createButton = (Button) findViewById(R.id.create);
		ListView StoryList = (ListView) findViewById(R.id.listView1);
		ListView CreateList = (ListView) findViewById(R.id.listView3);
		  getActionBar().setDisplayShowHomeEnabled(false);
		  getActionBar().setDisplayShowTitleEnabled(false);
		  getActionBar().setDisplayShowCustomEnabled(true);
		  LayoutInflater mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		  View mTitleView = mInflater.inflate(R.layout.home_screen_local,
		    null);
		  getActionBar().setCustomView(
		    mTitleView,
		    new ActionBar.LayoutParams(LayoutParams.MATCH_PARENT,
		      LayoutParams.WRAP_CONTENT));
		  searchView = (SearchView) mTitleView.findViewById(R.id.searchView1);
		StoryList.setTextFilterEnabled(true);
		CreateList.setTextFilterEnabled(true);
		searchView.setOnQueryTextListener(this);
		searchView.setSubmitButtonEnabled(false);
		myTabhost
				.addTab(myTabhost.newTabSpec("One")// make a new Tab
						.setIndicator("Local")
						// set the Title and Icon
						.setContent(R.id.widget_layout_Blue));
		// set the layout

		myTabhost
				.addTab(myTabhost.newTabSpec("Two")// make a new Tab
						.setIndicator("Remote")
						// set the Title and Icon
						.setContent(R.id.widget_layout_red));
		// set the layout

		myTabhost
				.addTab(myTabhost.newTabSpec("Three")// make a new Tab
						.setIndicator("My Story")
						// set the Title and Icon
						.setContent(R.id.widget_layout_green));
		// set the layout
	
		myTabhost.setOnTabChangedListener(this);
		
		
		final SimpleAdapter adp = HSC.showLocal();
		adp.notifyDataSetChanged();
        StoryList.setAdapter(adp);
		CreateList.setAdapter(adp);
		
		
		createButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent intent=new Intent(homeScreenLocal.this,CreateStory.class);
				Bundle bundle = new Bundle();
				bundle.putLong("id", 0);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		
		
		
		StoryList.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> l,View v, int pos, long id){
			//The place you add the code that get the story info from the database
				HashMap <String, Object> r = (HashMap<String, Object>) adp.getItem(pos);
				long Bid = (Long) r.get("id");
				Bundle bundle = new Bundle();
				bundle.putLong("id", Bid);
				Intent intent = new Intent(homeScreenLocal.this,ViewStory.class);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		
		CreateList.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> l,View v, int pos, long id){
			//The place you add the code that get the story info from the database
				HashMap <String, Object> r = (HashMap<String, Object>) adp.getItem(pos);
				long Bid = (Long) r.get("id");
				Bundle bundle = new Bundle();
				bundle.putLong("id", Bid);
				Intent intent = new Intent(homeScreenLocal.this,CreateStory.class);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});

		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		// Hold on to this
		myMenu = menu;
		myMenu.clear();
		// Inflate the currently selected menu XML resource.
		MenuInflater inflater = getMenuInflater();        
		switch (myMenuSettingTag) {
		case 1:
			inflater.inflate(myMenuResources[0], menu);
			break;
		case 2:
			inflater.inflate(myMenuResources[1], menu);
			break;
		case 3:
			inflater.inflate(myMenuResources[2], menu);
			break;
		default:
			inflater.inflate(myMenuResources[0], menu);
			break;
		}
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public void onTabChanged(String tagString) {
		// TODO Auto-generated method stub
		if (tagString.equals("One")) {
			myMenuSettingTag = 1;
		}
		if (tagString.equals("Two")) {
			myMenuSettingTag = 2;
		}
		if (tagString.equals("Three")) {
			myMenuSettingTag = 3;
		}
		if (myMenu != null) {
			onCreateOptionsMenu(myMenu);
		}
	}
	@Override
	public boolean onQueryTextChange(String newText) {
		// TODO Auto-generated method stub
		if (TextUtils.isEmpty(newText)) {
			   // Clear the text filter.
				StoryList.clearTextFilter();
				CreateList.clearTextFilter();
			  } else {
			   // Sets the initial value for the text filter.
			   StoryList.setFilterText(newText.toString());
			   CreateList.setFilterText(newText.toString());
			  }
			  return false;
	}
	@Override
	public boolean onQueryTextSubmit(String query) {
		// TODO Auto-generated method stub
		return false;
	}

}
