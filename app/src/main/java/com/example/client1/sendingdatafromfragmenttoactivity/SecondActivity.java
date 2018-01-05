package com.example.client1.sendingdatafromfragmenttoactivity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by client1 on 1/5/2018.
 */

public class SecondActivity extends AppCompatActivity
{
    TextView f,l;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        f=(TextView)findViewById(R.id.firstName);
        l=(TextView)findViewById(R.id.lastName);

        CustModel custModel=getIntent().getExtras().getParcelable("data");
        f.setText(custModel.firstName);
        l.setText(custModel.lastName);
    }
}
