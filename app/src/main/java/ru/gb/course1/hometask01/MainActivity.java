package ru.gb.course1.hometask01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView greetingsTextView;
    private Button buttonLogIn;
    private EditText editTextLogin;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingsTextView = findViewById(R.id.greetings_text_view);
        greetingsTextView.setText("Введите логин и пароль");

        buttonLogIn = findViewById(R.id.button_log_in);
        buttonLogIn.setOnClickListener(view -> {

        });
        editTextLogin = findViewById(R.id.edit_text_login);
        editTextPassword = findViewById(R.id.edit_text_password);
    }
}