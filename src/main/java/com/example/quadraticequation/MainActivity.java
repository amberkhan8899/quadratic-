package com.example.quadraticequation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText E1,E2,E3;
    TextView Result1,Result2;
int a1,b1,c1;
    double x1 = 0;
    double x2 = 0;
    boolean imaginary = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void OnButtonClick(View v) {

        E1 = (EditText) findViewById(R.id.NumA);
        E2 = (EditText) findViewById(R.id.NumB);
        E3 = (EditText) findViewById(R.id.NumC);

        Result1 = (TextView) findViewById(R.id.TextView2);
        Result2 = (TextView) findViewById(R.id.TextView3);

        a1 = Integer.parseInt(E1.getText().toString());
        b1 = Integer.parseInt(E2.getText().toString());
        c1 = Integer.parseInt(E3.getText().toString());


        double R = (b1*b1)-(4*a1*c1);

        if(R<0){
                 Toast toast = Toast.makeText(getApplicationContext(), "Imaginary root", Toast.LENGTH_LONG);
                 toast.setMargin(50, 50);
                 toast.show();
        }
       else if (R >= 0) {
            R = Math.sqrt(R);
            x1 = (-b1 + R) / (2 * a1);
            x2 = (-b1 - R) / (2 * a1);
            Result1.setText(Double.toString(x1));
            if (x1 != x2) Result2.setText(Double.toString(x2));
            else Result2.setText("Only one root.");
        }




    }
}