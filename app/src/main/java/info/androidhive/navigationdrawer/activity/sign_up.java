package info.androidhive.navigationdrawer.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import info.androidhive.navigationdrawer.R;

/**
 * Created by 100rabh on 11/13/2016.
 */

public class sign_up extends Activity {

    private Button button;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.signup);
        // Initialize the SDK before executing any other operations,
        /*FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);*/

        button = (Button) findViewById(R.id.submit_login_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_up.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
