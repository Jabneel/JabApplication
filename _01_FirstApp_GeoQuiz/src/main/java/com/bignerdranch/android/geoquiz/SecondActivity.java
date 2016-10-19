package com.bignerdranch.android.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        TextView myText = (TextView) findViewById(R.id.myText);

        Intent intent = getIntent();;
        String str = intent.getExtras().getString("SomeStringData");
        myText.setText(str);
    }

    public void callIntent(View view){
        Intent intent = null;
        switch	(view.getId())	{
            case	R.id.true_button:
                intent	=	new	Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.ca"));
                startActivity(intent);
                break;
            case	R.id.false_button:
                intent	=	new	Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:555555555"));
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
