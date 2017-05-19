/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersFragment extends ParentFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.word_list,container,false);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.mipmap.number_one,R.raw.number_one));
        words.add(new Word("two","otiiko",R.mipmap.number_two,R.raw.number_two));
        words.add(new Word("three","tolookosu",R.mipmap.number_three,R.raw.number_three));
        words.add(new Word("four","oyyisa",R.mipmap.number_four,R.raw.number_four));
        words.add(new Word("five","massokka",R.mipmap.number_five,R.raw.number_five));
        words.add(new Word("six","temmokka",R.mipmap.number_six,R.raw.number_six));
        words.add(new Word("seven","kenekaku",R.mipmap.number_seven,R.raw.number_seven));
        words.add(new Word("eight","kawinta",R.mipmap.number_eight,R.raw.number_eight));
        words.add(new Word("nine","wo'e",R.mipmap.number_nine,R.raw.number_nine));
        words.add(new Word("ten","na'aacha",R.mipmap.number_ten,R.raw.number_ten));

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter adapter = new WordAdapter(getActivity(),words,R.color.category_numbers);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        super.init();
        return view;
    }
}
