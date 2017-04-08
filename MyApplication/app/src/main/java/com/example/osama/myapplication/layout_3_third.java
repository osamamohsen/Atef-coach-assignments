package com.example.osama.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class layout_3_third extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    ImageView imageView;
    EditText edtText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_3_third);
        btn = (Button) findViewById(R.id.btnImage);
        imageView = (ImageView) findViewById(R.id.imageView);
        edtText = (EditText) findViewById(R.id.textImage);
        textView = (TextView) findViewById(R.id.txtView);
        btn.setOnClickListener(this);
    }

    void display(String text){
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {
        String text = textView.getText().toString();
        try {
            int myEditText = Integer.parseInt(edtText.getText().toString());
            if(myEditText == 2){
                textView.setText("Second Image");
                imageView.setImageResource(R.drawable.festival2);
            }else{
                textView.setText("First Image");
                imageView.setImageResource(R.drawable.festival1);
            }
        } catch (NumberFormatException e) {
            display(" must write 1 or 2 ");
        }

    }
}
