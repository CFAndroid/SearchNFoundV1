package com.example.chris.searchnfoundv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class EmailExists extends AppCompatActivity {

    private EditText mEmailcheckEdEmail;
    private Button mEmailcheckBtnNext;
    private ProgressBar mEmailcheckPbSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_exists);

        this.mEmailcheckPbSpinner = (ProgressBar)findViewById(R.id.progressBar);
        this.mEmailcheckPbSpinner.setVisibility(View.GONE);


        String current_email = PrefUtils.getFromPrefs(this, null, PrefUtils.CURRENT_USER_EMAIL, null);
        String password = PrefUtils.getFromPrefs(this, null, PrefUtils.USER_PASSWORD, null);


    }
}
