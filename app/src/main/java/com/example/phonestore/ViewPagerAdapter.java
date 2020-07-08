package com.example.phonestore;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

//Adapter used for the image slider in the Details Activity
public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private String ImgName;

    public ViewPagerAdapter(Context context, String ImgName) {
        this.context = context;
        this.ImgName = ImgName;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);

        String img1 = ImgName + "_1"; //get image name for the first phone picture
        String img2 = ImgName + "_2"; //get image name for the second phone picture
        String img3 = ImgName + "_3"; //get image name for the third phone picture

        //Convert the image names into their respective int IDs
        Integer Img1 = ((Activity) context).getResources().getIdentifier(img1 , "drawable", ((Activity) context).getPackageName());
        Integer Img2 = ((Activity) context).getResources().getIdentifier(img2 , "drawable", ((Activity) context).getPackageName());
        Integer Img3 = ((Activity) context).getResources().getIdentifier(img3 , "drawable", ((Activity) context).getPackageName());

        //initialise array of photo ids
        Integer[] images = {Img1, Img2, Img3};

        //display images in the ImageView item in the custom_layout xml
        ImageView imageView = (ImageView) view.findViewById(R.id.myImageView);

        //display all three images of the phone
        imageView.setImageResource(images[position]);

        ViewPager viewPager = (ViewPager)container;
        viewPager.addView(view);
        return view;

    }

    @Override
    //Clear the memory once the details activity page is left
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ViewPager viewPager = (ViewPager)container;
        View view = (View)object;
        viewPager.removeView(view);


    }
}
