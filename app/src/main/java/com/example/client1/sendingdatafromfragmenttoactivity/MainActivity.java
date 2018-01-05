package com.example.client1.sendingdatafromfragmenttoactivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentOne fragmentOne = new FragmentOne();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentOne);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
