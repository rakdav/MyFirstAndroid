package com.example.myfirstandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText first,second;
    private TextView result;
    private Button add,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        result=findViewById(R.id.result);
        add=findViewById(R.id.add);
        clear=findViewById(R.id.clear);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Double.parseDouble(first.getText().toString());
                    double b = Double.parseDouble(second.getText().toString());
                    double S = a + b;
                    result.setText(a + "+" + b + "=" + S);
                }
                catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this,ex.getMessage().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("");
                second.setText("");
                result.setText("");
            }
        });
    }
}