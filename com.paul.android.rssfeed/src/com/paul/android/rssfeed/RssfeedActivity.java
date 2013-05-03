package com.paul.android.rssfeed;

import android.app.Activity;
import android.os.Bundle;

public class RssfeedActivity extends Activity implements MyListFragment.OnItemSelectedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rssfeed);
	}

	@Override
	public void onRssItemSelected(String link) {
		DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
		if(fragment != null && fragment.isInLayout()) {
			fragment.SetText(link);
		}
	}

}
