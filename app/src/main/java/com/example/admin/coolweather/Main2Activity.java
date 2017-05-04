package com.example.admin.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    private String[] data={"东城区","西城区","朝阳区","丰台区","海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区",
            "怀柔区","平谷区","密云区","延庆区"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                Main2Activity.this,android.R.layout.simple_list_item_1,data);
        ListView listView= (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
