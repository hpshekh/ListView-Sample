package com.hpshekh.listview_sample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.hpshekh.listview_sample.R;
import com.hpshekh.listview_sample.model.Catalogue;

import java.util.ArrayList;

public class CatalogueAdapter extends ArrayAdapter<Catalogue> {

    public CatalogueAdapter(Context context, ArrayList<Catalogue> catalogues) {
        super(context, 0, catalogues);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.catalogue_item, parent, false);
        }

        Catalogue catalogue = getItem(position);

        TextView nameText = itemView.findViewById(R.id.nameText);
        TextView countText = itemView.findViewById(R.id.countText);

        nameText.setText(catalogue.getName());
        countText.setText(String.valueOf(catalogue.getCount()));

        return itemView;
    }
}
