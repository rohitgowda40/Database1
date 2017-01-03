package com.example.rohith.database1;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Vivzhelper vivzhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vivzhelper=new Vivzhelper(this);
        SQLiteDatabase db= vivzhelper.getWritableDatabase();
    }
}
