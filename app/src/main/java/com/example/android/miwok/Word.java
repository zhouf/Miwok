package com.example.android.miwok;

/**
 * Created by Leo on 2017-5-9.
 */

public class Word {

    private String mDefaultTranslateion;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String defaultTranslateion, String miwokTranslation,int audioResourceId) {
        this.mDefaultTranslateion = defaultTranslateion;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = -1;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslateion, String miwokTranslation, int imageResourceId,int audioResourceId) {
        this.mDefaultTranslateion = defaultTranslateion;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslateion() {
        return mDefaultTranslateion;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=-1;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
