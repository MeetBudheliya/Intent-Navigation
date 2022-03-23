package com.example.formdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        textView = findViewById(R.id.tv);

        btn1.setText("Hello Meet");
        Intent i = getIntent();
        String msg = i.getStringExtra("back_value");
        textView.setText(msg);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText("Meet Button Clicked");

                Intent i = new Intent(getApplicationContext(),SecondActivity.class);

                i.putExtra("text",btn1.getText().toString());
                startActivity(i);
            }
        });
    }
}