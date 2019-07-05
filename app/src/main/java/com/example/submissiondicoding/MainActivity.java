package com.example.submissiondicoding;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;
    private ArrayList<Gadget> list = new ArrayList<>();
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Tabloid Gadget");

        rvList = findViewById(R.id.rv_post);
        rvList.setHasFixedSize(true);

        list.addAll(GadgetsData.getListData());
        showRecyclerView();

    }

    private void showRecyclerView() {
        rvList.setLayoutManager(new LinearLayoutManager(this));
        final ListGadgetAdapter listGadgetAdapter = new ListGadgetAdapter(list);
        rvList.setAdapter(listGadgetAdapter);

        listGadgetAdapter.setOnItemClickCallback(new ListGadgetAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Gadget data) {
                showSelectedGadget(data);

                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("data1", data.getProname());
                intent.putExtra("data2", data.getProby());
                intent.putExtra("data3", data.getProdate());
                intent.putExtra("data4", data.getProdes());
                intent.putExtra("data5", data.getProphoto());
                intent.putExtra("data6", data.getProharga());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }

    private void showSelectedGadget(Gadget data) {
        Toast.makeText(this, "Kamu memilih " +data.getProname(), Toast.LENGTH_SHORT).show();

        }
    }

