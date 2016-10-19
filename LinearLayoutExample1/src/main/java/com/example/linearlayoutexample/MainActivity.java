package com.example.linearlayoutexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.linearlayoutexample.R.id.et1;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText et1 = (EditText) findViewById(R.id.et1);
		final EditText et2 = (EditText) findViewById(R.id.et2);
		final EditText et3 = (EditText) findViewById(R.id.et3);

		Button bSend;
		bSend = (Button) findViewById(R.id.bSend);
		bSend.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Context context = getApplicationContext();
				CharSequence text = et1.getText().append (" ").append(et2.getText()).append(" ")
						.append(et3.getText());
				int duration = Toast.LENGTH_LONG;
				Toast toast = Toast.makeText(context, text, duration);
				toast.show();

				et1.setText("");
				et2.setText("");
				et3.setText("");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}

}
