package com.example.capchungchi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_CapChungChi;
    private EditText tv_userName;

    private TextView tv_taskName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_CapChungChi = findViewById(R.id.btn_CapChungChi);
        tv_userName =findViewById(R.id.tv_tenUser);
        tv_taskName =findViewById(R.id.tv_KhoaHoc);
        btn_CapChungChi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userName = tv_userName.getText().toString();
                String taskName = tv_taskName.getText().toString();
                Intent intent=new Intent(MainActivity.this,CertificateActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("taskName", taskName);
                startActivity(intent);
            }
        });
    }
}