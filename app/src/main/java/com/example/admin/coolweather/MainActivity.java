package com.example.admin.coolweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private String[] data={"北京市","浙江省","天津市","重庆市","黑龙江省","辽宁省","吉林省","河北省","河南省","湖北省","湖南省",
            "山东省","山西省","陕西省", "安徽省","上海市","江苏省","福建省","广东省","海南省","四川省","云南省","贵州省","青海省",
            "甘肃省","江西省","台湾省内蒙古自治区","宁夏回族自治区","新疆维吾尔自治区","西藏自治区","广西壮族自治区","香港特别行政区",
            "澳门特别行政区"};

    private String[] bj={"东城区","西城区","朝阳区","丰台区","海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区",
            "怀柔区","平谷区","密云区","延庆区"};

    private String[] bjdc={"东华门街道","景山街道","交道口街道","安定门街道","北新桥街道","东四街道","朝阳门街道","建国门街道","东直门街道",
            "和平里街道","北京站地区管理处", "王府井建设管理办公室"};

    private String[] zj={"温州市","宁波市","杭州市","嘉兴市","湖州市","绍兴市","金华市","衢州市","舟山市","台州市","丽水市"};

    private String[] zjwz={"鹿城区","龙湾区","瓯海区","洞头区","瑞安市","乐清市","永嘉县","平阳县","苍南县","文成县","泰顺县"};
    private String[] City={};
    String[] city=null;
    private int level=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button= (Button) findViewById(R.id.button);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView= (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String result = parent.getItemAtPosition(position).toString(); //获取选择项的值if (result=="北京市")
               if(result=="北京市"){
                   city=bj;
                   level=2;
               }
                else if(result=="东城区"){
                   city=bjdc;
                   level=3;
               }
                else if (result=="浙江省"){
                   city=zj;
                   level=2;
               }
               else if (result=="温州市"){
                   city=zjwz;
                   level=3;
               }
                else{
                   city=City;
               }
                button.setVisibility(View.VISIBLE);
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                        MainActivity.this,android.R.layout.simple_list_item_1,city);
                ListView listView= (ListView) findViewById(R.id.list_view);
                listView.setAdapter(adapter);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(level==2){
                    city=data;
                    level=1;
                    button.setVisibility(View.GONE);
                }
                else if(level==3){
                    if(city==bjdc)
                        city=bj;
                    else if (city==zjwz)
                        city=zj;
                    level=2;
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                        MainActivity.this,android.R.layout.simple_list_item_1,city);
                ListView listView= (ListView) findViewById(R.id.list_view);
                listView.setAdapter(adapter);
            }
        });
    }
}
