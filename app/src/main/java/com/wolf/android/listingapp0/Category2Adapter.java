package com.wolf.android.listingapp0;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Category2Adapter extends ArrayAdapter<Category2> {
    public Category2Adapter(@NonNull Context context, ArrayList<Category2> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category2_list_item, parent, false);
        Category2 currentCategory2Item = getItem(position);
        ImageView category2ImageView = convertView.findViewById(R.id.category2_image_view);
        category2ImageView.setImageResource(currentCategory2Item.getCategory2ImageId());
        TextView category2TextView = convertView.findViewById(R.id.category2_text_view);
        category2TextView.setText(currentCategory2Item.getCategory2Text());
        return convertView;
    }
}
