package com.cookandroid.finalexams2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Dice> mList;
    private DiceAdapter mDiceAdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInit();

        mDiceAdater = new DiceAdapter(mList);
        mRecyclerView.setAdapter(mDiceAdater);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        TextView dicetext = (TextView)findViewById(R.id.dice_text);


        Button button = (Button)findViewById(R.id.dice_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int diceNUM = 0;
                Random dicerandom = new Random();
                diceNUM = dicerandom.nextInt(6)+1;

                dicetext.setText(String.valueOf(diceNUM));

                addItem("->" + diceNUM, "주사위 눈");
                mDiceAdater.notifyItemChanged(0);


            }
        });


    }

    public void firstInit() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mList = new ArrayList<>();
    }

    public void addItem(String dicenum, String diceorder) {
        Dice item = new Dice();

        item.setDicenum(dicenum);
        item.setDiceorder(diceorder);

        mList.add(item);
    }
}