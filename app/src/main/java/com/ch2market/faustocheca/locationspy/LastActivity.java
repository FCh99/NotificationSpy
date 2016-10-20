package com.ch2market.faustocheca.locationspy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        String string = "null Intent";
        TextView textView;
        textView = (TextView) findViewById(R.id.tv_last);

        Intent intent = getIntent();
        String notification = (String) intent.getExtras().get("noti");
        if (notification!=null){
            textView.setText(notification);

        }
        textView.setText(string);




    }
}
