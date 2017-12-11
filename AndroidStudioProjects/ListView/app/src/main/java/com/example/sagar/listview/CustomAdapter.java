package com.example.sagar.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

class CustomAdapter extends ArrayAdapter<String> {

    private int[] images;
    public CustomAdapter(@NonNull Context context, String[] name,int[] images) {
        super(context,R.layout.custom_view ,name);
        this.images=images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater sagarInflator = LayoutInflater.from(getContext());
        View customView = sagarInflator.inflate(R.layout.custom_view,parent,false);

        String single = getItem(position);
        TextView sagarText =(TextView) customView.findViewById(R.id.sagarText);
        ImageView sagarImage=(ImageView) customView.findViewById(R.id.sagarImage);

        sagarText.setText(single);
        sagarImage.setImageResource(images[position]);
        return customView;
    }
}
