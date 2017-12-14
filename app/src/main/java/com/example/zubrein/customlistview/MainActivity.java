package com.example.zubrein.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    CustomAdapter adapter;

    String[] country = {"Bangladesh" , "Australia" , "Russia","Bangladesh" , "Australia" , "Russia","Bangladesh" , "Australia" , "Russia" };
    String[] codes = {"880" , "660" , "550","880" , "660" , "550","880" , "660" , "550" };
    int[] image = {R.drawable.bd,
            R.drawable.bd ,
            R.drawable.bd,
            R.drawable.bd,
            R.drawable.bd ,
            R.drawable.bd,
            R.drawable.bd,
            R.drawable.bd ,
            R.drawable.bd  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        adapter = new CustomAdapter(MainActivity.this, country, codes, image);
        list.setAdapter(adapter);

    }
}
