package com.example.phonestore;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Shows a list of all Phone Models(products)
// Users can select a particular phone model to display it'd details
public class ListActivity extends AppCompatActivity {

    ListView listView;
    ModelsAdapter itemsAdapter;
    List<Phone> phoneList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent nameIntent = getIntent();
        String brandname = nameIntent.getStringExtra("BrandName");
        Log.d("ADebugTag", "ListActivity: " + brandname);

        // gets a list of Phone Models from the DataProvider which have the specified brand name
        phoneList = DataProvider.generateModels(brandname);

        itemsAdapter = new ModelsAdapter(this,
                R.layout.list_view_item_models,
                phoneList);
        listView = (ListView) findViewById(R.id.modelsList);
        listView.setAdapter(itemsAdapter);
        setupPhoneSelectedListener();
    }

    private void setupPhoneSelectedListener() {

        // Detects a click when the user clicks on a specific phone model.
        // When clicked, changes the activity to Details Activity and transfers
        // the required information for it.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent listIntent = new Intent(getBaseContext(), DetailsActivity.class);

                phoneList.get(position).incrementViews();

                String ModelName = phoneList.get(position).getModelName();
                String BrandName = phoneList.get(position).getBrand();
                String Description = phoneList.get(position).getDescription();
                String ImageName = phoneList.get(position).getImageName();
                int price = phoneList.get(position).getPrice();
                String price_str = Integer.toString(price);
                ImageName = ImageName.substring(0, ImageName.length() - 2);
                Log.d("ADebugTag", "IMAGE: " + phoneList.get(position).getViews());
                listIntent.putExtra("ModelName", ModelName);
                listIntent.putExtra("BrandName", BrandName);
                listIntent.putExtra("Description", Description);
                listIntent.putExtra("ImageName", ImageName);
                listIntent.putExtra("Price", price_str);

                startActivity(listIntent);

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // transition animation
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); // transition animation
    }
}
