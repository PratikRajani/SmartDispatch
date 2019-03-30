package pratik.smartdispatch;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;


public class SOSRecyclerView extends MainActivity {

    private android.support.v7.widget.RecyclerView recyclerView;
    private SOSRequestAdapter requestAdapter;
    private android.support.v7.widget.RecyclerView.LayoutManager layoutManager;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    List<SOSRequest> requestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sos_recyclerview);

        requestList = new ArrayList<>();
        recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.sosrecyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        requestList.add(
                new SOSRequest(
                        "Road Accident",
                        "2",
                        "25.23",
                        "58.52",
                        "45",
                        "56",
                        "Pratik Rajani"
                )
        );

        requestList.add(
                new SOSRequest(
                        "Road Accident",
                        "2",
                        "25.23",
                        "58.52",
                        "45",
                        "56",
                        "Pratik Rajani"
                )
        );
        requestList.add(
                new SOSRequest(
                        "Road Accident",
                        "2",
                        "25.23",
                        "58.52",
                        "45",
                        "56",
                        "Pratik Rajani"
                )
        );
        requestList.add(
                new SOSRequest(
                        "Road Accident",
                        "2",
                        "25.23",
                        "58.52",
                        "45",
                        "56",
                        "Pratik Rajani"
                )
        );






        requestAdapter = new SOSRequestAdapter(this, requestList);
        recyclerView.setAdapter(requestAdapter);
    }
}
