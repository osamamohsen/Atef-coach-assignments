package com.example.osama.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText1,editText2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.txtView);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.clickBtn);

        btn.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                String str = editText1.getText().toString()+" "+
                        editText2.getText().toString();
                textView.setText(str);
            }
        });
    }


}
