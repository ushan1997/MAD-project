package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CourierCreateAccount extends AppCompatActivity {

    private Button CreateRegisterButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_create_account);

        CreateRegisterButton =(Button)findViewById(R.id.register_button);
        CreateRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(CourierCreateAccount.this,CourierDashboardActivity.class);
                startActivity(intent);
            }
        });

        CreateRegisterButton  =(Button)findViewById(R.id.register_button);



    }

}