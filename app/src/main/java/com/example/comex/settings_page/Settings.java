package com.example.comex.settings_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.comex.R;

import java.util.ArrayList;

public class Settings extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] settings_title;
    int[] img_res = {R.drawable.ic_schedule_24dp, R.drawable.ic_notifications_24dp,
            R.drawable.ic_lock_24dp, R.drawable.ic_verified_user_24dp,
            R.drawable.ic_system_update_alt_24dp
    };
    ArrayList<Settings_Provider> arrayList = new ArrayList<Settings_Provider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        Toolbar myToolbar;
        myToolbar = (Toolbar) findViewById(R.id.settings_toolbar);
        setSupportActionBar(myToolbar);
        recyclerView = (RecyclerView) findViewById(R.id.settings_recycler);
        settings_title = getResources().getStringArray(R.array.settings_titles);
        int i = 0;
        for (String name : settings_title) {
            Settings_Provider settings_provider = new Settings_Provider(img_res[i], name);
            arrayList.add(settings_provider);
            i++;
        }

        adapter = new Settings_Adapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
