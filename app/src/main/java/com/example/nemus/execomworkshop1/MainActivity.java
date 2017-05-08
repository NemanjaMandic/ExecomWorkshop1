package com.example.nemus.execomworkshop1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by nemus on 08-May-17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView)
                findViewById(R.id.recycler_view);

        // recycler view can stack items vertically or horizontally
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        final UserAdapter adapter = new UserAdapter(this, UserDao.fetchUsers(), this);
        recyclerView.setAdapter(adapter);


    }
}
