package de.fieben.codechallenge;

import android.os.Bundle;
import android.widget.TextView;

import com.google.example.games.basegameutils.BaseGameActivity;


public class MainActivity extends BaseGameActivity {

	private TextView mText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mText = (TextView) findViewById(R.id.text);
	}

	@Override
	public void onSignInFailed() {
		mText.setText("Failed. :(");
	}

	@Override
	public void onSignInSucceeded() {
		mText.setText("Succeeded! :D");
	}
}
