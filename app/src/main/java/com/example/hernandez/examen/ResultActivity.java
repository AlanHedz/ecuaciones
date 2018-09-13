package com.example.hernandez.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.example.hernandez.examen.models.Ecuacion;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        showToolbar("Regresar", true);
        resultOnActivity();
    }

    public void resultOnActivity () {

        Ecuacion e = new Ecuacion();

        Intent intent = getIntent();

        double a = Double.parseDouble(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
        double b = Double.parseDouble(intent.getStringExtra(MainActivity.EXTRA_MESSAGE2));
        double c = Double.parseDouble(intent.getStringExtra(MainActivity.EXTRA_MESSAGE3));

        e.resolverEcuacion(a, b, c);

        TextView textView = (TextView) findViewById(R.id.resultx1);
        TextView textView2 = (TextView) findViewById(R.id.resultx2);

        textView.setText("X1 = " + String.valueOf(e.getX1()));
        textView2.setText("X2 = " + String.valueOf(e.getX2()));
    }

    public void showToolbar (String title, boolean upButton)
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
