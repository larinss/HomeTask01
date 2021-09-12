package ru.gb.course1.hometask01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {

    private TextView textViewUserInfo;
    private EditText nickName;
    private EditText name;
    private EditText age;
    private EditText phone;
    private EditText email;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textViewUserInfo = findViewById(R.id.text_view_user_info);
        nickName = findViewById(R.id.nick_name);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);


    }

}