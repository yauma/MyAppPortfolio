package com.example.jaimequeralt.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button buttonSpotify, buttonScores, buttonLibrary, buttonBuild, buttonXYZ, buttonCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSpotify = (Button) findViewById(R.id.buttonSpotify);
        buttonScores = (Button) findViewById(R.id.buttonScores);
        buttonLibrary = (Button) findViewById(R.id.buttonLibrary);
        buttonBuild = (Button) findViewById(R.id.buttonBuild);
        buttonXYZ = (Button) findViewById(R.id.buttonXYZ);
        buttonCapstone = (Button) findViewById(R.id.buttonCapstone);

        View.OnClickListener myHandler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idButton = view.getId();

                if (idButton == buttonSpotify.getId()) {
                    Toast.makeText(getApplicationContext(), "This button will launch " + buttonSpotify.getText() + " app"
                            , Toast.LENGTH_LONG).show();
                }
                if (idButton == buttonScores.getId()) {
                    Toast.makeText(getApplicationContext(), "This button will launch " + buttonScores.getText() + " app"
                            , Toast.LENGTH_LONG).show();
                }
                if (idButton == buttonLibrary.getId()) {
                    Toast.makeText(getApplicationContext(), "This button will launch " + buttonLibrary.getText() + " app"
                            , Toast.LENGTH_LONG).show();
                }
                if (idButton == buttonBuild.getId()) {
                    Toast.makeText(getApplicationContext(), "This button will launch " + buttonBuild.getText() + " app"
                            , Toast.LENGTH_LONG).show();
                }
                if (idButton == buttonXYZ.getId()) {
                    Toast.makeText(getApplicationContext(), "This button will launch " + buttonXYZ.getText() + " app"
                            , Toast.LENGTH_LONG).show();
                }
                if (idButton == buttonCapstone.getId()) {
                    Toast.makeText(getApplicationContext(), "This button will launch " + buttonCapstone.getText() + " app"
                            , Toast.LENGTH_LONG).show();
                }

            }
        };

        buttonSpotify.setOnClickListener(myHandler);
        buttonScores.setOnClickListener(myHandler);
        buttonLibrary.setOnClickListener(myHandler);
        buttonBuild.setOnClickListener(myHandler);
        buttonXYZ.setOnClickListener(myHandler);
        buttonCapstone.setOnClickListener(myHandler);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
