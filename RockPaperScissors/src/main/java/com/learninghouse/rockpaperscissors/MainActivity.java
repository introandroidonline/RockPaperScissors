package com.learninghouse.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private RockPaperScissorsApplication mApp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApp = (RockPaperScissorsApplication)getApplication();

        Button btnRock = (Button)findViewById(R.id.btnRock);
        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mApp.setPlayerSelection(RockPaperScissorType.ROCK);
                Toast.makeText(getApplicationContext(),"Rock Button clicked",Toast.LENGTH_LONG).show();
                Intent resultIntent = new Intent(MainActivity.this, RockPaperScissiorsResultActivity.class);
                startActivity(resultIntent);
            }
        });

        Button btnPaper = (Button) findViewById(R.id.btnPaper);
        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mApp.setPlayerSelection(RockPaperScissorType.PAPER);
                Toast.makeText(getApplicationContext(),"Paper Button clicked", Toast.LENGTH_LONG).show();
                Intent resultIntent = new Intent(MainActivity.this, RockPaperScissiorsResultActivity.class);
                startActivity(resultIntent);
            }
        });

        Button btnScissors = (Button) findViewById(R.id.btnScissors);
        btnScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mApp.setPlayerSelection(RockPaperScissorType.SCISSORS);
                Toast.makeText(getApplicationContext(),"Scissors Button was clicked", Toast.LENGTH_LONG).show();
                Intent resultIntent = new Intent(MainActivity.this, RockPaperScissiorsResultActivity.class);
                startActivity(resultIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
