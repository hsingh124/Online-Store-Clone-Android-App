package com.example.phonestore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {


    ViewPager viewPager; //Hindi CODE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details); //Access the activity_details xml file
        TextView modelName = (TextView) findViewById(R.id.tvModelName); //access the TextView item for the model name
        TextView brandName = (TextView) findViewById(R.id.tvBrand); //access the TextView item for the brand name
        TextView modelDescription = (TextView) findViewById(R.id.tvModelDescription); //access the TexView item for the model description
        ImageView categoryimage = (ImageView) findViewById(R.id.categoryImage); //access the address of the ImageView item for the slider in the activity_details
        TextView price = (TextView) findViewById(R.id.price);

        Intent nameIntent = getIntent();
        String modelname_in = nameIntent.getStringExtra("ModelName"); //initialise the Model Name in the TextView item
        String brandname_in = nameIntent.getStringExtra("BrandName"); //initialise the Brand Name in the TextView item
        String description_in = nameIntent.getStringExtra("Description"); //initialise the Description in the TextView item
        String ImageName = nameIntent.getStringExtra("ImageName");
        String Price = nameIntent.getStringExtra("Price");
        String CategoryImage = brandname_in.toLowerCase(); //set the brand name string to lowercase

        modelName.setText(modelname_in); //change the model name text
        modelDescription.setText(description_in); //change the description text
        brandName.setText(brandname_in); //change the brand name text
        price.setText(Price);

        categoryimage.setImageResource(getResources().getIdentifier(CategoryImage , "drawable", getPackageName()));

        //set the viewPager to the id address of the viewPager in the activity_details xml
        viewPager = (ViewPager)findViewById(R.id.myViewPager);

        Log.d("ADebugTag", "ListActivity: " + ImageName);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, ImageName);

        //set the adapter of the viewpager in the activity_details xml
        viewPager.setAdapter(viewPagerAdapter);


    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); // transition animation
    }

}
