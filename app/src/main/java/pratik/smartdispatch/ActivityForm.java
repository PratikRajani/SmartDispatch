package pratik.smartdispatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class ActivityForm extends MainActivity {

    Button sentrequestButton;
    /*private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        sentrequestButton = (Button) findViewById(R.id.sentrequestButton);

        sentrequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserMapactivity();
            }
        });

       /* drawerLayout = findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

    }

    public void openUserMapactivity(){

        Intent intent = new Intent(this, UserMapactivity.class);
        startActivity(intent);
    }
   /* public boolean onOptionItemSelected(MenuItem item){

        if(toggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
