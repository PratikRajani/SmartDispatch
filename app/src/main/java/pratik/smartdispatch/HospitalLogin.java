package pratik.smartdispatch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalLogin extends MainActivity {

    private Button hospitalloginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_hospital);

        hospitalloginbtn = (Button) findViewById(R.id.hospitalloginbtn);

        hospitalloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecyclerView();
            }
        });
    }

    public void openRecyclerView(){

        Intent intent = new Intent(this, RecyclerView.class);
        startActivity(intent);
    }
}
