package pratik.smartdispatch;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class SignUp extends MainActivity  {

    String userType;
    EditText name, age, aadhaarno, licenceno;
    TextView registerTexView, sex;
    Button registerButton;
    RadioGroup radioGroup;
    View divider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_page);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        sex = findViewById(R.id.sex);
        aadhaarno = findViewById(R.id.aadhaarno);
        registerButton = findViewById(R.id.registerButton);
        registerTexView = findViewById(R.id.registerTextView);
        radioGroup = findViewById(R.id.radioGroup);
        divider = findViewById(R.id.divider);
        licenceno = findViewById(R.id.licenceno);

        Intent intent = getIntent();
        userType = intent.getStringExtra("userType");

        if (userType.equals("Vehicle")){

            registerTexView.setText("Register Vehicle");
            name.setHint("Driver Name");
            age.setHint("Driver Age");
            sex.setText("Driver Sex");
            aadhaarno.setHint("Vehicle Number");
            aadhaarno.setInputType(InputType.TYPE_CLASS_TEXT);
            registerButton.setText("REGISTER VEHICLE");
        }
        else if (userType.equals("Hospital")){

            registerTexView.setText("Register Hospital");
            name.setHint("Hospital Name");
            name.setInputType(InputType.TYPE_CLASS_TEXT);
            age.setHint("Hospital Address");
            age.setInputType(InputType.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
            sex.setVisibility(View.GONE);
            divider.setVisibility(View.GONE);
            radioGroup.setVisibility(View.GONE);
            aadhaarno.setVisibility(View.GONE);
            licenceno.setVisibility(View.GONE);
            registerButton.setText("REGISTER HOSPITAL");
        }
        else if (userType.equals("Requester")){

            licenceno.setVisibility(View.GONE);
        }

    }


}
