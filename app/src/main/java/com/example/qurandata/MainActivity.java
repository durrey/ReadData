package com.example.qurandata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String []data =getResources().getStringArray(R.array.translation);
        ArrayList<String> arrayList = new ArrayList<String>(asList(data));
        ArrayAdapter adapter  = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList );
        ListView listView = (ListView)findViewById(R.id.simpleListView );
        listView.setAdapter((adapter));
    }
}