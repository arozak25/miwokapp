package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.miwok.R.id.rootView;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word("father","epa",R.drawable.family_father));
        word.add(new Word("mother","eta",R.drawable.family_mother));
        word.add(new Word("son","angsi",R.drawable.family_son));
        word.add(new Word("daughter","tune",R.drawable.family_daughter));
        word.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        word.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        word.add(new Word("older sister","tete",R.drawable.family_older_sister));
        word.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        word.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        word.add(new Word("grandfather","paapa",R.drawable.family_grandfather));

        WordAdapter wordAdapter = new WordAdapter(this, word, R.color.category_family);
        ListView rootView = (ListView) findViewById(R.id.rootView);
        rootView.setAdapter(wordAdapter);
    }
}
