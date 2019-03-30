package pratik.smartdispatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.*;
import java.lang.*;


public class CurrentReqRV extends MainActivity {

    private android.support.v7.widget.RecyclerView recyclerView;
    private CurrentRequestAdapter requestAdapter;
    private android.support.v7.widget.RecyclerView.LayoutManager layoutManager;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    String requestType;

    List<CurrentRequest> requestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currentreq_rv);

        Intent intent = getIntent();
        requestType = intent.getStringExtra("requestType");

        requestList = new ArrayList<>();

        recyclerView = findViewById(R.id.crrecyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        requestList.add(
                new CurrentRequest(
                        "fhcgvhbjnk",
                        "fcgvhbjnkm",
                        "Pratik",
                        "1546523542",
                        "GJ5 RG 4565"
                )
        );
        requestList.add(
                new CurrentRequest(
                        "fhcgvhbjnk",
                        "fcgvhbjnkm",
                        "Pratik",
                        "1546523542",
                        "GJ5 RG 4565"
                )
        );
        requestList.add(
                new CurrentRequest(
                        "fhcgvhbjnk",
                        "fcgvhbjnkm",
                        "Pratik",
                        "1546523542",
                        "GJ5 RG 4565"
                )
        );

        requestAdapter = new CurrentRequestAdapter(this, requestList);
        recyclerView.setAdapter(requestAdapter);
    }
}
