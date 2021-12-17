package com.example.myapplication_gimal_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication_gimal_app.R;

public class LoginActivity extends AppCompatActivity {
    EditText userid;
    EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userid = findViewById(R.id.userid);
        userpass = findViewById(R.id.userpass);
        Button loginBtn = findViewById(R.id.LoginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginProcess(view);
            }
        });
    }
    public void loginProcess(View v){
        String uid= userid.getText().toString();
        String upass = userpass.getText().toString();
        if(uid.equals("njs") && upass.equals("2625")){
            Toast.makeText(this," " + uid,Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"로그인 정보가 없습니다",Toast.LENGTH_LONG).show();
            userpass.setText("");
        }
    }
}
