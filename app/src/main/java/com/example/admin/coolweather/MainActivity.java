package com.example.admin.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    private String[] data={"北京市","上海市","天津市","重庆市","黑龙江省","辽宁省","吉林省","河北省","河南省","湖北省","湖南省",
            "山东省","山西省","陕西省", "安徽省","浙江省","江苏省","福建省","广东省","海南省","四川省","云南省","贵州省","青海省",
            "甘肃省","江西省","台湾省内蒙古自治区","宁夏回族自治区","新疆维吾尔自治区","西藏自治区","广西壮族自治区","香港特别行政区",
            "澳门特别行政区"};
    public class Fruit{
        private String name;
        private int imageId;
        public Fruit(String name,int imageId){
            this.name=name;
            this.imageId=imageId;
        }
        public String getName(){
            return name;
        }
        public int getImageId(){
            return imageId;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView= (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
