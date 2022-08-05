package com.example.hideout_chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import  com.example.hideout_chat.R;
public class PhotosVP extends ViewPager {
    public PhotosVP(@NonNull Context context){super(context);}
    public PhotosVP(@NonNull Context context, @Nullable AttributeSet attrs){
        super(context,attrs);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent){
        try{
            return super.onInterceptTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException e){
            return false;
        }
    }
}
