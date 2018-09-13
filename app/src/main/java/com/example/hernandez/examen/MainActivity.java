package com.example.hernandez.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.examen.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.examen.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.examen.MESSAGE3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getResult (View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        EditText a = (EditText) findViewById(R.id.txta);
        EditText b = (EditText) findViewById(R.id.txtb);
        EditText c = (EditText) findViewById(R.id.txtc);

        String a_string = a.getText().toString();
        String b_string = b.getText().toString();
        String c_string = c.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, a_string);
        intent.putExtra(EXTRA_MESSAGE2, b_string);
        intent.putExtra(EXTRA_MESSAGE3, c_string);

        startActivity(intent);

    }
}
