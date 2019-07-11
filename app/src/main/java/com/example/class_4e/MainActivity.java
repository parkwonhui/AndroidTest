package com.example.class_4e;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "asasas";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for ( int i = 0; i < 5; ++i) {
            if(i % 2 == 0)
                list.remove(i);
        }

       System.out.println("result:"+list.toString());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
