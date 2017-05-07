package com.example.yoser.viewsimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateListView();
        registerClickCallBack();

    }
    private void populateListView() {
//create list of items
        String[] myItems = {"TUNISIE","FRANCE", "ITALIE","ESPAGNE","GRECE","EGYPTE","MAROC","CANADA"};
//build adapter
        ArrayAdapter <String> adapter= new ArrayAdapter<String>(this,R.layout.da_item,myItems
        );

        ListView list =(ListView)findViewById(R.id.item);
        list.setAdapter(adapter);
    }
    private void registerClickCallBack() {
        ListView list =(ListView)findViewById(R.id.item);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView text= (TextView)view;
                if
                        ((text.getText().toString().equals("TUNISIE")))
                {
                    Toast.makeText(MainActivity.this,"vous avez choisi : TUNISIE", Toast.LENGTH_LONG).show();
                }
                else if
                        ((text.getText().toString().equals("FRANCE")))
                {
                    Toast.makeText(MainActivity.this,"vous avez choisi : FRANCE",Toast.LENGTH_LONG).show();
                }
                else if

                        ((text.getText().toString().equals("ITALIE")))

                {
                    Toast.makeText(MainActivity.this,"vous avez choisi : ITALIE",Toast.LENGTH_LONG).show();
                }

                else if

                        ((text.getText().toString().equals("ESPAGNE")))

                {
                    Toast.makeText(MainActivity.this,"vous avez choisi : ESPAGNE ",Toast.LENGTH_LONG).show();
                }
                else if

                        ((text.getText().toString().equals("GRECE")))

                {
                    Toast.makeText(MainActivity.this," vous avez choisi : GRECE",Toast.LENGTH_LONG).show();
                }
                else if

                        ((text.getText().toString().equals("EGYPTE")))

                {
                    Toast.makeText(MainActivity.this," vous avez choisi : EGYPTE",Toast.LENGTH_LONG).show();
                }
                else if

                        ((text.getText().toString().equals("MAROC")))

                {
                    Toast.makeText(MainActivity.this," vous avez choisi : MAROC",Toast.LENGTH_LONG).show();
                }

                else if

                        ((text.getText().toString().equals("CANADA")))

                {
                    Toast.makeText(MainActivity.this," vous avez choisi : CANADA",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
