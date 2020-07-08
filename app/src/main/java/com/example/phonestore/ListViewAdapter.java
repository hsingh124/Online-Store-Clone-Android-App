package com.example.phonestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    // Declare Variables

    Context mContext;
    LayoutInflater inflater;
    private ArrayList<Phone> arraylist;

    public ListViewAdapter(Context context ) {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<Phone>();
        this.arraylist.addAll(SearchActivity.searchList);
    }

    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return SearchActivity.searchList.size();
    }

    @Override
    public Phone getItem(int position) {
        return SearchActivity.searchList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.search_view_item, null);

            // Locate the TextViews in listview_item.xml
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews in the search_view_item xml
        holder.name.setText(SearchActivity.searchList.get(position).getModelName());
        return view;
    }

    // Filter Class: Filters the text and the search list from the search bar with list of models
    // that matches the characters typed
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        SearchActivity.searchList.clear();

        //Show all models if no text is typed
        if (charText.length() == 0) {
            SearchActivity.searchList.addAll(arraylist);
        } else {

            //Show the models which have the characters typed in the model name
            for (Phone wp : arraylist) {
                if (wp.getModelName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    SearchActivity.searchList.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}

