package com.example.gocorona;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class help1 extends AppCompatActivity {

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help1);
        context = this;
        ListView lstview = (ListView) findViewById(R.id.listv);
        lstview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context, "An item of the ListView is clicked.", Toast.LENGTH_LONG).show();
            }
        });

        String[] items = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chattisgarh","Delhi"," Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharastra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikhim","Tamil Nadu","Puducherry","Telungana","Tripura","Uttarkhand","Uttar Pradesh","West Bengal"};
        String[] it={"0866-2410978","9436055743","6913347770","104","104","01122307145","104","104","8558893911","104","104","104","04712552056","104","02026127394","3852411668","108","102","7005539653","9439994859","104","01412225624","104","04429510500","104","104","03812315879","104","18001805145","1800313444222"};
        listviewadapter adapter = new listviewadapter(this, R.layout.activity_mylist,R.id.txt,items,it);
        // Bind data to the ListView
        lstview.setAdapter(adapter);
    }

    /*public void clickMe(View view){
        Button bt=(Button)view;
        bt.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent calli = new Intent(Intent.ACTION_DIAL);
                                      calli.setData(Uri.parse("104"));
                                      startActivity(calli);
                                  }
                              }
        );

    }
*/


}
