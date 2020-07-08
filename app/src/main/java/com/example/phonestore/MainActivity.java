package com.example.phonestore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.SearchView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TopPicksAdapter.OnItemListener {

    ListView listView;
    RecyclerView topListView;
    Button mainSearch;
    PhoneAdapter itemsAdapter;
    RecyclerView.Adapter topItemsAdapter;
    List<Brand> brandList;
    List<Phone> topList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataProvider.InitialiseList(); //iniitialise the list of phone models used in our phone app

        brandList = DataProvider.getBrands(); //initialise the list of brands in our phone app

        //using the PhoneAdapter for the list_view_item xml
        itemsAdapter = new PhoneAdapter(this,
                R.layout.list_view_item,
                brandList);

        //initialise ListView in the activity_main xml for the listview of brands
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //initialise recyclerview for the top picks section in the main activity
        topListView = (RecyclerView) findViewById(R.id.topList);
        topListView.setHasFixedSize(true);
        topListView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        topList = DataProvider.generateTopPicks(); //initialise the top picks models
        topItemsAdapter = new TopPicksAdapter(topList, this, this);

        topListView.setAdapter(topItemsAdapter);

        //initialise the search click button on the main activity
        mainSearch = (Button) findViewById(R.id.searchmain);

        setupPhoneSelectedListener();
        moveToSearchActivity();
    }

    //detects the click on the brands in the listview and transitions to the List Activity
    private void setupPhoneSelectedListener() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent listIntent = new Intent(getBaseContext(), ListActivity.class);
                String brandname = brandList.get(position).getName();
                listIntent.putExtra("BrandName", brandname);
                startActivity(listIntent); //Transitions to the List Activity
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // transition animation
            }
        });
    }

    //detects the click on the search bar and transitions to the Search Activity
    private void moveToSearchActivity() {

        mainSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(getBaseContext(), SearchActivity.class);
                startActivity(searchIntent); //transitions to the Search Activity
            }
        });
    }

    @Override
    //Detects click on the top picks and sends the phone model item's details to the details activity
    public void onItemClick(int position) {
        String ModelName = topList.get(position).getModelName();
        String BrandName = topList.get(position).getBrand();
        String Description = topList.get(position).getDescription();
        String ImageName = topList.get(position).getImageName();
        ImageName = ImageName.substring(0, ImageName.length() - 2);
        int price = topList.get(position).getPrice();
        String price_str = Integer.toString(price);

        Intent intent = new Intent(this, DetailsActivity.class);

        //Sends the respective phone model details to the details activity
        intent.putExtra("ModelName", ModelName);
        intent.putExtra("BrandName", BrandName);
        intent.putExtra("Description", Description);
        intent.putExtra("ImageName", ImageName);
        intent.putExtra("Price", price_str);

        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // transition animation
    }

    @Override
    protected void onResume() {
        super.onResume();
        topList = DataProvider.generateTopPicks();
        topItemsAdapter = new TopPicksAdapter(topList, this, this);
        topListView.setAdapter(topItemsAdapter);
    }
}

