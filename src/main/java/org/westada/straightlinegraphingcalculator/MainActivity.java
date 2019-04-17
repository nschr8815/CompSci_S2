package org.westada.straightlinegraphingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText X1 = (EditText) findViewById(R.id.X1);
                EditText X2 = (EditText) findViewById(R.id.X2);
                EditText Y1 = (EditText) findViewById(R.id.Y1);
                EditText Y2 = (EditText) findViewById(R.id.Y2);

                getSlope(X1, X2, Y1, Y2);
            }
        });

    }



    public void getSlope(EditText X1, EditText X2, EditText Y1, EditText Y2)
    {

        double X1Text = Double.parseDouble(X1.getText().toString());
        double X2Text = Double.parseDouble(X2.getText().toString());
        double Y1Text = Double.parseDouble(Y1.getText().toString());
        double Y2Text = Double.parseDouble(Y2.getText().toString());

        double slope = (Y2Text - Y1Text) / (X2Text - X1Text);
        TextView m = (TextView) findViewById(R.id.m);
        m.setText("m= " +slope + "");

        double yIntercept = (Y1Text - (slope * X1Text));
        TextView b = (TextView) findViewById(R.id.b);
        b.setText("b= " +yIntercept + "");
    };




}