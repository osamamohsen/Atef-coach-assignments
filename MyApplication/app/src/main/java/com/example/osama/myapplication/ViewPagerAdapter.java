package com.example.osama.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by osama on 08/04/17.
 */

public class ViewPagerAdapter extends PagerAdapter {

    Activity activity;
    String [] images;
    ImageLoader imageLoader;
    LayoutInflater layoutInflater;


    public ViewPagerAdapter(Activity activity,String [] images , ImageLoader imageLoader){
        this.activity = activity;
        this.images = images;
        this.imageLoader = imageLoader;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container , int position){
        layoutInflater = (LayoutInflater)activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.viewpager_item,container,false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageLoader.displayImage(images[position],imageView);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager)container).removeView((View)object);
    }
}
