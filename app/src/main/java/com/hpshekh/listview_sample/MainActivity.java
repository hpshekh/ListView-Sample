package com.hpshekh.listview_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.hpshekh.listview_sample.adapter.CatalogueAdapter;
import com.hpshekh.listview_sample.model.Catalogue;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        ArrayList<Catalogue> catalogues = new ArrayList<>();
        catalogues.add(new Catalogue("Mangoes", 30));
        catalogues.add(new Catalogue("Apples", 50));
        catalogues.add(new Catalogue("Bananas", 80));
        catalogues.add(new Catalogue("Oranges", 75));

        CatalogueAdapter adapter = new CatalogueAdapter(this, catalogues);
        listView.setAdapter(adapter);
    }
}