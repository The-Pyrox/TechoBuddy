package com.msu.techobuddy;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by Poojan on 12/25/2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles = {"Techozine",
            "Faculties",
            "Placements",
            "Events",
            "Clubs",
            "Techomaterial.com",
            "Learning Hub"};


    /*private int[] images = { R.drawable.faculties_2,
            R.drawable.techozine,
            R.drawable.techozine,
            R.drawable.techozine,
            R.drawable.techozine,
            R.drawable.techozine,
            R.drawable.techozine

    };*/

    class ViewHolder extends RecyclerView.ViewHolder{


        public int currentItem;
        public ImageView imageView;
        public TextView itemTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            imageView = (ImageView)itemView.findViewById(R.id.home_image);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        //viewHolder.imageView.setImageResource(images[i]);
        if (i==0)
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#E53935"));
        else if (i==1)
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#9C27B0"));
        else if (i==2)
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#D4E157"));
        else if (i==3)
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#9E9E9E"));
        else if (i==4)
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#43A047"));
        else if (i==5)
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#43A047"));
        else if (i==6)
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#5E35B1"));






    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}