package pratik.smartdispatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn, loginbtn, vehicleloginbtn, adminloginbtn, hospitalloginbtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = (Button) findViewById(R.id.loginbtn);
        vehicleloginbtn = (Button) findViewById(R.id.vehicleloginbtn);
        hospitalloginbtn = (Button) findViewById(R.id.hospitalloginbtn);
        adminloginbtn = (Button) findViewById(R.id.adminloginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openLogIn();
            }
        });

        vehicleloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVehicleLogIn();
            }
        });

        hospitalloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHospitalLogIn();
            }
        });

        adminloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogIn();
            }
        });
    }

    public void openSignUp(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void openLogIn(){
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }

    public void openHospitalLogIn(){
        Intent intent = new Intent(this, HospitalLogin.class);
        startActivity(intent);
    }

    public void openVehicleLogIn(){
        Intent intent = new Intent(this, VehicleLogin.class);
        startActivity(intent);
    }
}


