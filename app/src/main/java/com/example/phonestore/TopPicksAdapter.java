//Reference: used this video for implementing the OnClickListener
//           https://www.youtube.com/watch?v=69C1ljfDvl0

package com.example.phonestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//This adapter is used for determining the top 3 picks in the main activity
public class TopPicksAdapter extends RecyclerView.Adapter<TopPicksAdapter.ViewHolder> {

    private List<Phone> topPickList; //create list of phones for the TopPicks
    private Context context;
    private OnItemListener mOnItemListener;

    public TopPicksAdapter(List<Phone> topPickList, Context context, OnItemListener onItemListener) {
        this.topPickList = topPickList;
        this.context = context;
        this.mOnItemListener = onItemListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.top_picks, parent, false);
        return new ViewHolder(v, mOnItemListener);
    }

    @Override
    //Implements the TopPicks model image and name
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Phone topPick = topPickList.get(position);

        int i = context.getResources().getIdentifier(
                topPick.getImageName(), "drawable",
                context.getPackageName());

        //Setting the image for top pick phone
        holder.topImg.setImageResource(i);

        //Setting the text(model name) for top pick phone
        holder.topName.setText(topPick.getModelName());
    }

    @Override
    public int getItemCount() {
        return topPickList.size();
    }

    //implements the TopPicks onto a recycler view
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView topImg;
        public TextView topName;
        OnItemListener onItemListener;

        public ViewHolder(@NonNull View itemView, OnItemListener onItemListener) {
            super(itemView);

            topImg = (ImageView) itemView.findViewById(R.id.top_pick_img); //set the top pick model image
            topName = (TextView) itemView.findViewById(R.id.top_pick_name); //set the top pick model name
            this.onItemListener = onItemListener;

            itemView.setOnClickListener(this); //allow clicking ability for the model image
        }

        @Override
        public void onClick(View v) {
            onItemListener.onItemClick(getAdapterPosition());
        }
    }

    public interface OnItemListener {
        void onItemClick(int position);
    }
}
