package pratik.smartdispatch;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends MainActivity {

    private Button registerbtn, loginbtn;
    private TextView textView;
    String loginType;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_page);

        Intent intent = getIntent();
        loginType = intent.getStringExtra("loginType");

        registerbtn = (Button) findViewById(R.id.registerbtn);
        loginbtn = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.loginType);

        if (loginType.equals("Vehicle Login")|| loginType.equals("Hospital Login") || loginType.equals("Admin Login"))
            registerbtn.setVisibility(View.INVISIBLE);

        if (loginType.equals("Requester Login"))
            textView.setText("LOG IN AS A REQUESTER");
        else if (loginType.equals("Vehicle Login"))
            textView.setText("LOG IN AS A VEHICLE");
        else if (loginType.equals("Hospital Login"))
            textView.setText("LOG IN AS A HOSPITAL");
        else if (loginType.equals("Admin Login"))
            textView.setText("LOG IN AS A ADMIN");

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp("Requester");
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(loginType.equals("Requester Login"))
                    openActivityForm();
                else if(loginType.equals("Vehicle Login"))
                    openVehicleMainactivity();
                else if(loginType.equals("Hospital Login"))
                    openRecyclerView();
                else if(loginType.equals("Admin Login"))
                    openAdminMainactivity();
            }
        });
    }

    public void openRecyclerView(){

        Intent intent = new Intent(this, RecyclerView.class);
        startActivity(intent);
    }

    public void openActivityForm() {

        Intent intent = new Intent(this, ActivityForm.class);
        startActivity(intent);
    }

    public void openAdminMainactivity(){

        Intent intent = new Intent(this, AdminMainactivity.class);
        startActivity(intent);
    }

    public void openVehicleMainactivity(){

        Intent intent = new Intent(this, VehicleMainactivity.class);
        startActivity(intent);
    }
}
