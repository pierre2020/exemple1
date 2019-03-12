package com.example.ronald.exemple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ltsName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//je suis belle et bien la
    public void ChangeName(View view) {

       ltsName= (TextView) findViewById(R.id.ltsName);
        ltsName.setText("Deborah");
        
    }
}
