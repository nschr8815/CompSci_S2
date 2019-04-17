package org.westada.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);
    secondActivityBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
            //how to pass info to another activity
            startIntent.putExtra("org.westada.QuickLauncher.SOMETHING", "Hello WORLD, this is ANDROID NICHOLAS!");
            startActivity(startIntent);
        }
    });


    Button googleBtn = (Button)findViewById(R.id.googleBtn);
    googleBtn.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v) {
            String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
            if (gotoGoogle.resolveActivity(getPackageManager()) != null) {

                startActivity(gotoGoogle);
            }
            }

        });

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.westada.nicholasschroeder");
                if (launchIntent != null) {

                    startActivity(launchIntent);
                }

            }
        });

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.westada.straightlinegraphingcalculator");
                if (launchIntent != null) {

                    startActivity(launchIntent);
                }

            }
        });

    }





}
