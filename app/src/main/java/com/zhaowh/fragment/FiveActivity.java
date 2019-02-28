package com.zhaowh.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FiveActivity extends AppCompatActivity {

    private TextView tv;
    private StringBuilder stringBuilder = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        tv = (TextView) findViewById(R.id.tv);
        Intent intent = getIntent();
        if(intent != null){
            stringBuilder.append(intent.getStringExtra("lemon"));
            tv.setText(stringBuilder.toString());
        }

    }
}
