package com.example.admin.coolweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private String[] bj={"东城区","西城区","朝阳区","丰台区","海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区",
            "怀柔区","平谷区","密云区","延庆区"};
    private String[] zj={"杭州市","宁波市","温州市","嘉兴市","湖州市","绍兴市","金华市","衢州市","舟山市","台州市","丽水市"};
    private String[] City={};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String data=getIntent().getStringExtra("a");
        String[] city=null;
        if("北京市".equals(data)){
            city=bj;
        }
       else if ("浙江省".equals(data)){
            city=zj;
        }
        else{
            city=City;
        }

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                Main2Activity.this,android.R.layout.simple_list_item_1,city);
        ListView listView= (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
