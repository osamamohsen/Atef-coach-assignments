package com.example.osama.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    TextView textView;
    EditText editText1,editText2;
    Button btnSubmit,btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.txtView);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        btnSubmit = (Button) findViewById(R.id.submit);
        btnNext = (Button) findViewById(R.id.nextPage);

        btnSubmit.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    } // end onCreate

    @Override
    public void onClick(View v) {
//        Toast.makeText(getBaseContext(), v.get, Toast.LENGTH_LONG).show();        // Perform action on click
        switch(v.getId()) {
            case R.id.submit:
                textView.setText(editText1.getText()+" "+editText2.getText());
                break;
            case R.id.nextPage:
                Intent next = new Intent(this,layout_2_second.class);
                startActivity(next);
                break;
        }
    }

}//end class
