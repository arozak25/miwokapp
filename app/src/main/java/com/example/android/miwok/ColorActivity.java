package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word("red","wetetti",R.drawable.color_red));
        word.add(new Word("mustard yellow","chiwiita",R.drawable.color_mustard_yellow));
        word.add(new Word("dust yellow","topiise",R.drawable.color_dusty_yellow));
        word.add(new Word("green","chokokki",R.drawable.color_green));
        word.add(new Word("brown","takaakki",R.drawable.color_brown));
        word.add(new Word("gray","topoppi",R.drawable.color_gray));
        word.add(new Word("black","kululli",R.drawable.color_black));
        word.add(new Word("white","kelelli",R.drawable.color_white));

        WordAdapter wordAdapter = new WordAdapter(this, word, R.color.category_colors);
        ListView rootView = (ListView) findViewById(R.id.rootView);
        rootView.setAdapter(wordAdapter);
    }
}
