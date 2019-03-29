package pratik.smartdispatch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VehicleLogin extends MainActivity {

    private Button vehicleloginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_vehicle);

        vehicleloginbtn = (Button) findViewById(R.id.vehicleloginbtn);

        vehicleloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}