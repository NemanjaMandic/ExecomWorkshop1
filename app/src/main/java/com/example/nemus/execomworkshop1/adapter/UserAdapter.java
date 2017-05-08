package com.example.nemus.execomworkshop1.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.nemus.execomworkshop1.generic.RecyclerViewAdapterBase;
import com.example.nemus.execomworkshop1.generic.ViewWrapper;
import com.example.nemus.execomworkshop1.model.User;
import com.example.nemus.execomworkshop1.protocol.UserSelectedListener;
import com.example.nemus.execomworkshop1.view.UserItemView;

import java.util.List;

/**
 * Created by nemus on 08-May-17.
 */

public class UserAdapter extends RecyclerViewAdapterBase<User, UserItemView> {

    private final UserSelectedListener userSelectedListener;

    public UserAdapter(Context context, List<User> items, UserSelectedListener userSelectedListener) {
        super(context, items);
        this.userSelectedListener = userSelectedListener;
    }



    @Override
    protected UserItemView onCreateItemView(ViewGroup parent, int viewType) {
        return new UserItemView(context, userSelectedListener);
    }

    @Override
    public void onBindViewHolder(ViewWrapper<UserItemView> holder, int position) {
       final UserItemView view = holder.getView();
        final User user = items.get(position);

        view.bind(user);
    }
}
