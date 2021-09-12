package ru.gb.course1.hometask01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView greetingsTextView;
    private Button buttonLogIn;
    private EditText editTextLogin;
    private EditText editTextPassword;
    private CheckBox checkBoxRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingsTextView = findViewById(R.id.greetings_text_view);
        greetingsTextView.setText("Введите логин и пароль");


        editTextLogin = findViewById(R.id.edit_text_login);
        editTextPassword = findViewById(R.id.edit_text_password);

        buttonLogIn = findViewById(R.id.button_log_in);
        buttonLogIn.setOnClickListener(view -> {
        });

        checkBoxRemember =findViewById(R.id.checkbox_remember);
        checkBoxRemember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

    }
}