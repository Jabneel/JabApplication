package com.example.themesmodules;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button simpleBtn, bigBtn;
    private TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.customText);
        text2 = (TextView) findViewById(R.id.bigText);

        simpleBtn = (Button) findViewById(R.id.simpleTextButton);
        simpleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (Build.VERSION.SDK_INT < 23) {
                    text1.setTextAppearance(getApplicationContext(), R.style.SimpleStyle);
                }
                else{
                    text1.setTextAppearance(R.style.SimpleStyle);
                }
            }
        });

        bigBtn = (Button) findViewById(R.id.bigTextButton);
        bigBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (Build.VERSION.SDK_INT < 23) {
                    text2.setTextAppearance(getApplicationContext(), R.style.SimpleStyle_BigPurple);
                }
                else{
                    text2.setTextAppearance( R.style.SimpleStyle_BigPurple);
                }
            }
        });
    }

}
