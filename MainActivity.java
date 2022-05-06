package com.example.testview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);

        doubleLinked newList = new doubleLinked();

        newList.add("cool");
        newList.add("Eldin");
        newList.add("Ring");
        newList.add("GAMER");
        newList.add("WHO");
        newList.add("IS");
        newList.add("Bad");
        newList.add("At");
        newList.add("The");
        newList.add("Game");
        newList.add("epic");
        newList.add("Eldin");
        newList.add("Ring");
        newList.add("GAMER");
        newList.add("WHO");
        newList.add("IS");
        newList.add("Bad");
        newList.add("At");
        newList.add("The");

        String[] toNewArray = newList.toArray();

        ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, toNewArray);

        listView.setAdapter(arrayAdapter);

    }
}
