package com.example.osama.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout_2_second extends AppCompatActivity implements View.OnClickListener {

    Button next_page_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_2_second);
        next_page_button = (Button) findViewById(R.id.next_page_button);
    }

    @Override
    public void onClick(View v) {

    }
}
