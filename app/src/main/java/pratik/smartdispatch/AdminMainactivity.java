package pratik.smartdispatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AdminMainactivity extends MainActivity  {

    //private DrawerLayout drawerLayout;
    Button crtextView, rhtextView, rvtextView, rhostextView, sosButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_mainactivity);

        crtextView = findViewById(R.id.cr_textView);
        rhtextView = findViewById(R.id.rh_textView);
        rvtextView = findViewById(R.id.rv_textView);
        rhostextView = findViewById(R.id.rhos_textView);
        sosButton = findViewById(R.id.sosButton);

        crtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencrRecyclerView("Current Request");
            }
        });

        rhtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhrRecyclerView("End Request");
            }
        });

        sosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSOSRequest();
            }
        });

        rvtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister("Vehicle");
            }
        });

        rhostextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister("Hospital");
            }
        });

        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout =  findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_open_drawer, R.string.navigation_close_drawer);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        if (savedInstanceState == null){

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new CurrentReqFragment()).commit();

            navigationView.setCheckedItem(R.id.currentrequest);
        }*/
    }

    public void opencrRecyclerView(String requestType){

        Intent intent = new Intent(this, CurrentReqRV.class);
        intent.putExtra("requestType", requestType);
        startActivity(intent);
    }

    public void openhrRecyclerView(String requestType){

        Intent intent = new Intent(this, HistoryReqRV.class);
        intent.putExtra("requestType", requestType);
        startActivity(intent);
    }

    public void openSOSRequest(){

        Intent intent = new Intent(this, SOSRecyclerView .class);
        startActivity(intent);
    }
    /*public void openrhRecyclerView(){

        Intent intent = new Intent(this, RecyclerView.class);
        startActivity(intent);
    }*/
   /* public void openrdvRecyclerView(){

        Intent intent = new Intent(this, RecyclerView.class);
        startActivity(intent);
    }
    public void openrdhosRecyclerView(){

        Intent intent = new Intent(this, RecyclerView.class);
        startActivity(intent);
    }*/

   public void openRegister(String userType){

       Intent intent = new Intent(this, SignUp.class);
       intent.putExtra("userType", userType);
       startActivity(intent);
   }

   /* @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


        //Log.d("menuItem", Integer.toString(menuItem.getItemId()));
        switch (menuItem.getItemId()){
            case R.id.currentrequest:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CurrentReqFragment()).commit();
                break;
            case R.id.requesthistory:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ReqHistoryFragment()).commit();
                break;
            case R.id.regedVehicles:
                Toast.makeText(this, "Registered Vehicles", Toast.LENGTH_SHORT).show();
                break;
            case R.id.regedHospitals:
                Toast.makeText(this, "Registered Hospitals", Toast.LENGTH_SHORT).show();
                break;
            case R.id.regVehicle:
                Toast.makeText(this, "Register Vehicle", Toast.LENGTH_SHORT).show();
                break;
            case R.id.regHospital:
                Toast.makeText(this, "Register Hospital", Toast.LENGTH_LONG).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }*/

    /*@Override
    public void onBackPressed(){

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }*/
}
