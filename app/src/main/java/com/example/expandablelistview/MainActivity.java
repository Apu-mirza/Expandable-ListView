package com.example.expandablelistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter adapter;
    private String[] itemList, itemList2;
//    private List<String> itemList, itemList2;
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        itemList = new ArrayList<>();
//        itemList.add("Item 1");
//        itemList.add("Item 2");
//        itemList.add("Item 3");
//        itemList.add("Item 4");
////         Add items to itemList
//
//        itemList2 = new ArrayList<>();
//        itemList.add("under itemlist1");
//        itemList.add("under itemlist2");
//        itemList.add("under itemlist3");
//        itemList.add("under itemlist4");

        itemList = getResources().getStringArray(R.array.abbreviations);
        itemList2 = getResources().getStringArray(R.array.acronyms);


        listView = findViewById(R.id.listView);
        adapter = new CustomAdapter(this, itemList, itemList2);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                adapter.setClickedItemPosition(position);
//            }
//        });
    }
}
