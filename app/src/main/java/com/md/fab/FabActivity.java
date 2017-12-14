package com.md.fab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.Toast;

import com.md.R;

import java.util.ArrayList;
import java.util.List;

public class FabActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        btn = (ImageButton) findViewById(R.id.btn);

        setSupportActionBar(toolbar);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 58; i++) {
            data.add("item" + i);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        MyAdapter adapter = new MyAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
