package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Leo on 2017-5-9.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String TAG = "WordAdapter";
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words,int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }


        itemView.findViewById(R.id.text_container).setBackgroundColor(ContextCompat.getColor(getContext(),mColorResourceId));

        Word word = getItem(position);
        ((TextView)itemView.findViewById(R.id.default_text_view)).setText(word.getDefaultTranslateion());
        ((TextView)itemView.findViewById(R.id.miwok_text_view)).setText(word.getMiwokTranslation());

        ImageView image = (ImageView) itemView.findViewById(R.id.imageView);
        Log.i(TAG, "getView: " + word.getImageResourceId());
        if(word.hasImage()){
            image.setImageResource(word.getImageResourceId());
        }else{
            image.setVisibility(View.GONE);
        }

        return itemView;
    }
}
