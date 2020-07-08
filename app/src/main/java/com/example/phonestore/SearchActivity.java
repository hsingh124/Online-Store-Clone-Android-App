package com.example.phonestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

// Used for searching and filtering for the relevant model items
public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    SearchView editsearch;
    ListView searchListView;
    ListViewAdapter searchAdapter;
    public static ArrayList<Phone> searchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // gets a list of all phone models from the DataProvider
        searchList = new ArrayList<Phone>(DataProvider.getSearchList());
        searchListView = (ListView) findViewById(R.id.searchlistview);

        searchAdapter = new ListViewAdapter(this);

        searchListView.setAdapter(searchAdapter);

        // edit search access the Seach View item in the activity_search.xml
        editsearch = (SearchView) findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);

        // detects a click when a user clicks on a model inside the search activity List View
        // starts details activity and transfers the required information(phone model details)
        searchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SearchActivity.this, searchList.get(position).getModelName(), Toast.LENGTH_SHORT).show();

                searchList.get(position).incrementViews();

                String ModelName = searchList.get(position).getModelName();
                String BrandName = searchList.get(position).getBrand();
                String Description = searchList.get(position).getDescription();
                String ImageName = searchList.get(position).getImageName();
                ImageName = ImageName.substring(0, ImageName.length() - 2);
                int price = searchList.get(position).getPrice();
                String price_str = Integer.toString(price);

                Intent intent = new Intent(getBaseContext(), DetailsActivity.class);

                intent.putExtra("ModelName", ModelName);
                intent.putExtra("BrandName", BrandName);
                intent.putExtra("Description", Description);
                intent.putExtra("ImageName", ImageName);
                intent.putExtra("Price", price_str);

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }


    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        searchAdapter.filter(text);

        // if user's input does not match with any phone models,
        // displays "No Results Found" (set in activity_search.xml)
        if(searchAdapter.getCount() == 0) {
            searchListView.setVisibility(View.GONE);
        }
        else{
            searchListView.setVisibility(View.VISIBLE);
        }
        return false;
    }
}
