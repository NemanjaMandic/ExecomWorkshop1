package com.example.nemus.execomworkshop1.generic;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by nemus on 08-May-17.
 */

public class ViewWrapper<V extends View> extends RecyclerView.ViewHolder{

    private V view;

    public ViewWrapper(V itemView){
        super(itemView);
        view = itemView;
    }

    public V getView(){
        return view;
    }
}
