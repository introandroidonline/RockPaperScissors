package com.learninghouse.rockpaperscissors;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class RockPaperScissiorsResultActivity extends ActionBarActivity {
    private RockPaperScissorsApplication mApp = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissiors_result);

        mApp = (RockPaperScissorsApplication)getApplication();

        RockPaperScissorType player1 = mApp.getPlayerSelection();
        RockPaperScissorType computer = mApp.getComputerSelection();

        TextView txtPlayer = (TextView)findViewById(R.id.txtPlayerChoice);
        txtPlayer.setText("Player: " + player1.toString() );

        TextView txtComputer = (TextView)findViewById(R.id.txtComputerChoice);
        txtComputer.setText("Computer: " + computer.toString() );

        TextView txtResults = (TextView)findViewById(R.id.txtResults);
        txtResults.setText(RockPaperScissorsUtil.eval(player1,computer));

        Button btnPlayAgain = (Button) findViewById(R.id.btnPlayAgain);
        btnPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rock_paper_scissiors_result, menu);
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
