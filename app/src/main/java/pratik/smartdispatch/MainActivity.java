package pratik.smartdispatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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



