package com.example.formdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);

        btn1.setText("Hello Devu");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText("Devu Clicked");

                Intent i = new Intent(getApplicationContext(),SecondActivity.class);

                i.putExtra("text",btn1.getText().toString());
                startActivity(i);
            }
        });
    }
}