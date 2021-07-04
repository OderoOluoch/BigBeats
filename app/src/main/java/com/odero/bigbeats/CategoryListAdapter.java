package com.odero.bigbeats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CategoryListAdapter extends ArrayAdapter<Category> {
    public CategoryListAdapter(Context context, ArrayList<Category> categoryArrayList){
        super(context,R.layout.album_list_item,categoryArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       Category category = getItem(position);
       if(convertView == null){
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.album_list_item,parent,false);
       }
        ImageView imageView = convertView.findViewById(R.id.categoryImage);
        TextView categoryName = convertView.findViewById(R.id.categoryName);
        TextView categoryDescription = convertView.findViewById(R.id.categoryDescription);
        TextView numberOfSongs = convertView.findViewById(R.id.numberOfSongs);

        imageView.setImageResource(category.getImageId());
        categoryName.setText(category.getCategoryName());
        categoryDescription.setText(category.getCategoryDescription());
        numberOfSongs.setText(category.getNumberOfSongs());

        return convertView;
    }
}
