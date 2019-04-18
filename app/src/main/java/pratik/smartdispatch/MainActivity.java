package pratik.smartdispatch;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn, loginbtn, vehicleloginbtn, adminloginbtn, hospitalloginbtn, aboutus;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = (Button) findViewById(R.id.user_login_button);
        vehicleloginbtn = (Button) findViewById(R.id.vehicle_login_button);
        hospitalloginbtn = (Button) findViewById(R.id.hospital_login_button);
        adminloginbtn = (Button) findViewById(R.id.admin_login_button);
        aboutus = (Button) findViewById( R.id.about_us );

        aboutus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AboutUs aboutUs = new AboutUs();
                aboutUs.show( getSupportFragmentManager(), "About Us" );
            }
        } );

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openLogIn("Requester Login");
            }
        });

        vehicleloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogIn("Vehicle Login");
            }
        });

        hospitalloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogIn("Hospital Login");
            }
        });

        adminloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogIn("Admin Login");
            }
        });
    }

    public void openSignUp(String userType){
        Intent intent = new Intent(this, SignUp.class);
        intent.putExtra("userType", userType);
        startActivity(intent);
    }

    public void openLogIn(String user_login){

        Intent intent = new Intent(this, LogIn.class);
        intent.putExtra("loginType", user_login);
        startActivity(intent);
    }

}



