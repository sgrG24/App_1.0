package com.example.sagar.listview;


import android.app.ListActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] images={R.drawable.draco,R.drawable.ginny,R.drawable.harry,R.drawable.hermione,R.drawable.ron};
        String[] name = {"Draco","Ginny","Harry","Hermione","Ron"};
        ListAdapter sagarAdapter = new CustomAdapter(this, name,images);
        ListView sagarListView = (ListView) findViewById(R.id.sagarListView);
        sagarListView.setAdapter(sagarAdapter);

        sagarListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String na=String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this,na,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
