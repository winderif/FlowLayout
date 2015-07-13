package com.wefika.flowlayout.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wefika.flowlayout.FlowLayout;

import java.util.ArrayList;
import java.util.Random;


public class AdapterActivity extends Activity {

    private FlowLayout layout;
    private TagAdapter adapter;
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        data = new ArrayList<String>();
        layout = (FlowLayout) findViewById(R.id.flowlayout);
        adapter = new TagAdapter(this, data);
        layout.setAdapter(adapter);
    }

    private String getTag(int length) {
        String t = "a";
        for(int i=0; i<=length; i++) {
            t = t + "a";
        }
        return t;
    }

    public void onAddTag(View v) {
        data.add(getTag(new Random().nextInt() % 5 + 1));

        adapter.notifyDataSetChanged();
    }

    public void onDelTag(View v) {
        if(!data.isEmpty()) {
            data.remove(data.size()-1);
            adapter.notifyDataSetChanged();
        }
        else {
            Toast.makeText(this, "No tag", Toast.LENGTH_SHORT).show();
        }
    }
}
