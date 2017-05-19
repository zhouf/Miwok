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
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsFragment extends ParentFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.word_list,container,false);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","weṭeṭṭi",R.mipmap.color_red,R.raw.color_red));
        words.add(new Word("green","chokokki",R.mipmap.color_green,R.raw.color_green));
        words.add(new Word("brown","ṭakaakki",R.mipmap.color_brown,R.raw.color_brown));
        words.add(new Word("gray","ṭopoppi",R.mipmap.color_gray,R.raw.color_gray));
        words.add(new Word("black","kululli",R.mipmap.color_black,R.raw.color_black));
        words.add(new Word("white","kelelli",R.mipmap.color_white,R.raw.color_white));
        words.add(new Word("dusty yellow","ṭopiisə",R.mipmap.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("mustard yellow","chiwiiṭə",R.mipmap.color_mustard_yellow,R.raw.color_mustard_yellow));

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter adapter = new WordAdapter(getActivity(),words,R.color.category_colors);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        super.init();
        return view;
    }

}
