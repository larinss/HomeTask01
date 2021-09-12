package ru.gb.course1.hometask01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {

    private TextView textViewUserInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textViewUserInfo =findViewById(R.id.text_view_user_info);
    }
}