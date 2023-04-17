package com.cookandroid.a10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("2021041086 김진구");

        RadioButton rdo2 = (RadioButton) findViewById(R.id.rdo2);
        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;

                if (rdo2.isChecked() == true)
                    intent = new Intent(getApplicationContext(),
                            SecondActivity.class);
                else
                    intent = new Intent(getApplicationContext(),
                            ThirdActivity.class);

                startActivity(intent);
            }
        });
    }
}