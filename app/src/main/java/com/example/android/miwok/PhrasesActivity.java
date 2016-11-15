package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.rootView;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word("Where are you going?","minto wuksus"));
        word.add(new Word("What is your name?","tinnә oyaase'nә"));
        word.add(new Word("My name is...","oyaaset..."));
        word.add(new Word("How are you feeling?","michәksәs?"));
        word.add(new Word("I’m feeling good.","kuchi achit"));
        word.add(new Word("Are you coming?","әәnәs'aa?"));
        word.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        word.add(new Word("I’m coming.","әәnәm"));
        word.add(new Word("Let’s go.","yoowutis"));
        word.add(new Word("Come here.","әnni'nem"));

        WordAdapter wordAdapter = new WordAdapter(this, word, R.color.category_phrases);
        ListView rootView = (ListView) findViewById(R.id.rootView);
        rootView.setAdapter(wordAdapter);


    }
}
