package com.example.tanwa.exp18tictaktogame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buClick(View view) {
        Button buSelect = (Button) view;
//        buSelect.setBackgroundColor(Color.RED);
        int cellID = 0;
        switch ((buSelect.getId())){
            case R.id.bu1:
                cellID=1;
                break;

            case R.id.bu2:
                cellID=2;
                break;

            case R.id.bu3:
                cellID=3;
                break;


            case R.id.bu4:
                cellID=4;
                break;

            case R.id.bu5:
                cellID=5;
                break;


            case R.id.bu6:
                cellID=6;
                break;

            case R.id.bu7:
                cellID=7;
                break;


            case R.id.bu8:
                cellID=8;
                break;


            case R.id.bu9:
                cellID=9;
                break;


        }
        PlayGame(cellID,buSelect);

    }
    int  ActivePlayer=1;  // 1 for first , 2 for second
    ArrayList<Integer> Player1= new ArrayList <Integer>();// hold player 1 data
    ArrayList<Integer> Player2= new ArrayList <Integer>();// hold player 2 data

    void  PlayGame(int cellID,Button buSelect){
        buSelect.setBackgroundColor(Color.RED);
        Log.d("Player",String.valueOf(cellID));

        if (ActivePlayer == 1){
            buSelect.setText("X");
            buSelect.setBackgroundColor(Color.GREEN);
            Player1.add(cellID);
            ActivePlayer = 2;
        }
        else if (ActivePlayer == 2){
            buSelect.setText("0");
            buSelect.setBackgroundColor(Color.RED);
            Player2.add(cellID);
            ActivePlayer=1;
        }
        buSelect.setEnabled(false);
        CheckWiner();

//        Log.d("Button Text",String.valueOf(button.getText()));
    }

    void  CheckWiner(){
        int Winer = -1;
        int count = 0;

        //raw1
        if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3)){
            Winer = 1;
        }
        //raw1 p2
        if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3)){
            Winer = 2;
        }
        //raw2 p1
        if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6)){
            Winer = 1;
        }
        //raw2 p2
        if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6)){
            Winer = 2;
        }
        //raw3 p1
        if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9)){
            Winer = 1;
        }
        //raw3 p2
        if(Player2.contains(7) && Player2.contains(8) && Player1.contains(9)){
            Winer = 2;
        }

        //col 1 p1
        if(Player1.contains(1) && Player1.contains(4) && Player1.contains(7)){
            Winer = 1;
        }
        //col 1 p2
        if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7)){
            Winer = 2;
        }
        //col 2 p1
        if(Player1.contains(2) && Player1.contains(5) && Player1.contains(8)){
            Winer = 1;
        }
        //col 2 p2
        if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8)){
            Winer = 2;
        }
        //col 3 p1
        if(Player1.contains(3) && Player1.contains(6) && Player1.contains(9)){
            Winer = 1;
        }
        //col 3 p2
        if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9)){
            Winer = 2;
        }
        //dignal
        if(Player1.contains(1) && Player1.contains(5) && Player1.contains(9)){
            Winer = 1;
        }
        //col 3 p2
        if(Player2.contains(1) && Player2.contains(5) && Player2.contains(9)){
            Winer = 2;
        }

        if(Player1.contains(3) && Player1.contains(5) && Player1.contains(7)){
            Winer = 1;
        }
        //col 3 p2
        if(Player2.contains(3) && Player2.contains(5) && Player2.contains(7)){
            Winer = 2;
        }

        if (Winer !=-1){
            //we have a winer
            if (Winer == 1){
                Toast.makeText(this,"Player 1 is Winner" ,Toast.LENGTH_LONG).show();
                count++;
            }
            if (Winer == 2){
                Toast.makeText(this,"Player 2 is Winner" ,Toast.LENGTH_LONG).show();
            }


        }





    }

}































