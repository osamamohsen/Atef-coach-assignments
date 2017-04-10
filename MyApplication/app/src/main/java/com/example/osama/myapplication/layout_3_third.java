package com.example.osama.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class layout_3_third extends AppCompatActivity implements View.OnClickListener{

    Button btn,nextPage;
    ImageView imageView;
    EditText edtText;
    TextView textView;
    RoundImage roundImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_3_third);
        btn = (Button) findViewById(R.id.btnImage);
        nextPage = (Button) findViewById(R.id.nextPage);
        imageView = (ImageView) findViewById(R.id.imageView);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.festival1);
        circle_image(bitmap);


        edtText = (EditText) findViewById(R.id.textImage);
        textView = (TextView) findViewById(R.id.txtView);
        btn.setOnClickListener(this);
        nextPage.setOnClickListener(this);
    }

    void display(String text){
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }

    void circle_image(Bitmap bitmap){
        roundImage = new RoundImage(bitmap);
        imageView.setImageDrawable(roundImage);
    }

    void chageImage(){
        String text = textView.getText().toString();
        try {
            int myEditText = Integer.parseInt(edtText.getText().toString());
            if(myEditText == 2){
                textView.setText("Second Image");
                btn.setText("First Image");
                imageView.setImageResource(R.drawable.festival2);
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.festival2);
                circle_image(bitmap);
            }else{
                textView.setText("First Image");
                btn.setText("Second Image");
                imageView.setImageResource(R.drawable.festival1);
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.festival1);
                circle_image(bitmap);
            }
        } catch (NumberFormatException e) {
            display(" must write 1 or 2 ");
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnImage:
                chageImage();
                break;
            case R.id.nextPage:
                Intent intent = new Intent(this,layout_4_ImageLoader.class);
                startActivity(intent);
                break;
        }

    }//end onClick
}
