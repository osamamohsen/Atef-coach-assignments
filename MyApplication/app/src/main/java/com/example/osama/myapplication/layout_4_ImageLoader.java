package com.example.osama.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class layout_4_ImageLoader extends AppCompatActivity {

    ViewPager viewPager;
    ViewPagerAdapter adapter;

    private String[] images = {
            "http://media02.hongkiat.com/3d_street_art_more/3d-street-paint-art.jpg",
            "https://s-media-cache-ak0.pinimg.com/originals/fc/e5/6d/fce56d641daff519c55bb09ea017dae3.jpg",
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQmCIJbrGzpJkIRJbqn2k-1Qrw0nSg689uid-uhfdmjsSGFB-un",
            "http://worldtoptop.com/wp-content/uploads/2014/12/fusion_musical_street_art_eduardo_relero.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-WZ1rNC73KtZ_jdeYfegoUOq2qpa2yB4aXuWf_nzQW3PThdJR",
            "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSGz6XBy6TAe7ZO3EuHIC60c63f3gagyF5JZFEG2eQs4wZsRIlq"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_4_image_loader);

        // Create global configuration and initialize ImageLoader with this config
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
            .build();
            ImageLoader.getInstance().init(config);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(this,images,ImageLoader.getInstance());
        viewPager.setAdapter(adapter);
    }
}
