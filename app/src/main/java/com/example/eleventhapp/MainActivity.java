package com.example.eleventhapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static View v=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[]fruits=new String[]{"Apple","Banana","Grapes","Orange","Mango","Water Maleon"};
        ListAdapter list=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,fruits);
        ListView output=findViewById(R.id.ListView);
        final TextView textView=(TextView) findViewById(R.id.TextView);
        output.setAdapter(list);
        output.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String name=String.valueOf(parent.getItemAtPosition(position));
                        textView.setText(name);
                        if(v!=null) {
                            v.setBackgroundColor(500088);
                        }
                        view.setBackgroundResource(R.drawable.backborder);
                        v=view;
                        Toast.makeText(MainActivity.this,"You Select "+name,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}