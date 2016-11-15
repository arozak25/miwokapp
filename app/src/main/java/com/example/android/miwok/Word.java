package com.example.android.miwok;

/**
 * Created by AbdRzk on 25/08/2016.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_VIEW;
    private static final int NO_IMAGE_VIEW = -1;

    public Word(String MiwokTranslation, String DefaultTranslation, int ImageResourceId) {
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
        mImageResourceId = ImageResourceId;
    }

    public Word(String MiwokTranslation, String DefaultTranslation){
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_VIEW;
    }


}
