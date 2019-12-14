package com.example.pooja_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Greeting extends AppCompatActivity {

    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        textView=(TextView)findViewById(R.id.textView);
        textView1=(TextView)findViewById(R.id.textView1);
    }
}
