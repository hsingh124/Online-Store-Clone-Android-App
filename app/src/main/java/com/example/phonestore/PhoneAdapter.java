package com.example.phonestore;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.phonestore.Brand;

import java.util.List;


public class PhoneAdapter extends ArrayAdapter {

    int mLayoutID;
    List<Brand> mNumbers;
    Context mContext;

    public PhoneAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mLayoutID = resource;
        mContext = context;
        mNumbers = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get a reference to the current ListView item
        View currentListViewItem = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayoutID, parent, false);
        }
        //Get the Number object for the current position
        Brand currentNumber = mNumbers.get(position);

        //Set the attributed of list_view_number_item views
        ImageView iconImageView = (ImageView) currentListViewItem.findViewById(R.id.icon_image_view);
        int i = mContext.getResources().getIdentifier(
                currentNumber.getImgName(), "drawable",
                mContext.getPackageName());

        //Setting the icon
        iconImageView.setImageResource(i);

        TextView BrandName = (TextView) currentListViewItem.findViewById(R.id.BrandName);
        BrandName.setText(currentNumber.getName());


        return currentListViewItem;
    }
}
