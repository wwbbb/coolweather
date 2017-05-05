package com.example.admin.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
    private String[] zj={"杭州市","宁波市","温州市","嘉兴市","湖州市","绍兴市","金华市","衢州市","舟山市","台州市","丽水市"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                Main3Activity.this,android.R.layout.simple_list_item_1,zj);
        ListView listView= (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
