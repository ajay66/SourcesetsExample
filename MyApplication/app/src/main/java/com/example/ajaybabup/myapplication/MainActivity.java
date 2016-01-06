package com.example.ajaybabup.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.my.SecondActivity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data={"hii","bye"};

        Button btn=(Button)findViewById(R.id.button);

        ListView lv=(ListView)findViewById(R.id.list);
//        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_2,data);
//        lv.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"u clicked the button",Toast.LENGTH_LONG).show();

                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

}
