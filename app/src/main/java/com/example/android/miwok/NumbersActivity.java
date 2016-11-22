package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word ("one", "lutti",R.drawable.number_one));
        word.add(new Word ("two", "otiiko",R.drawable.number_two));
        word.add(new Word ("three", "tolookosu",R.drawable.number_three));
        word.add(new Word ("four", "oyyisa",R.drawable.number_four));
        word.add(new Word ("five", "massokka",R.drawable.number_five));
        word.add(new Word ("six", "temokka",R.drawable.number_six));
        word.add(new Word ("seven", "kenekaku",R.drawable.number_seven));
        word.add(new Word ("eight", "kawinta",R.drawable.number_eight));
        word.add(new Word ("nine", "wo'e",R.drawable.number_nine));
        word.add(new Word ("ten", "na'acha",R.drawable.number_ten));

        WordAdapter wordAdapter = new WordAdapter(this, word, R.color.category_numbers);


            ListView rootView = (ListView) findViewById(R.id.rootView);
            rootView.setAdapter(wordAdapter);

            rootView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    Toast.makeText(NumbersActivity.this, "List item clicked", Toast.LENGTH_SHORT).show();
                }
            });
        
    }


}
