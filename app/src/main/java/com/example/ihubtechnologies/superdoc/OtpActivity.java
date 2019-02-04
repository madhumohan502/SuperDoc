package com.example.ihubtechnologies.superdoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OtpActivity extends AppCompatActivity {
    @Bind(R.id.editText2)
    EditText editText2;
    @Bind(R.id.button)
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_layout);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        navigateToHomeActivity();
    }

    private void navigateToHomeActivity() {
        Intent i = new Intent(OtpActivity.this,HomeActivity.class);
        startActivity(i);
    }
}
