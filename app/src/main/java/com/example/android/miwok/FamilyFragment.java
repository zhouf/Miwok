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

public class FamilyFragment extends ParentFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.word_list,container,false);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","əpə",R.mipmap.family_father,R.raw.family_father));
        words.add(new Word("mother","əṭa",R.mipmap.family_mother,R.raw.family_mother));
        words.add(new Word("son","angsi",R.mipmap.family_son,R.raw.family_son));
        words.add(new Word("daughter","tune",R.mipmap.family_daughter,R.raw.family_daughter));
        words.add(new Word("older brother","taachi",R.mipmap.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("younger brother","chalitti",R.mipmap.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("older sister","teṭe",R.mipmap.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("younger sister","kolliti",R.mipmap.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("grandmother","ama",R.mipmap.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("grandfather","paapa",R.mipmap.family_grandfather,R.raw.family_grandfather));

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter adapter = new WordAdapter(getActivity(),words,R.color.category_family);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        super.init();
        return view;
    }
}
