package com.wefika.flowlayout.example;

import android.app.Activity;
import android.os.Bundle;

import com.wefika.flowlayout.FlowLayout;

import java.util.ArrayList;


public class AdapterActivity extends Activity {

    private FlowLayout layout;
    private TagAdapter adapter;
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        data = new ArrayList<String>();
        for(int i=0; i<10; i++) {
            data.add(getTag(i));
        }
        for(int i=0; i<10; i++) {
            data.add(getTag(i));
        }

        layout = (FlowLayout) findViewById(R.id.flowlayout);
        adapter = new TagAdapter(this, data);
        layout.setAdapter(adapter);
    }

    private String getTag(int length) {
        String t = "";
        for(int i=0; i<=length; i++) {
            t = t + "a";
        }
        return t;
    }
}
