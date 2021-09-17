package ru.gb.course1.hometask01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewEnterLoginPassword;
    private Button buttonLogIn;
    private EditText editTextLogin;
    private EditText editTextPassword;
    private CheckBox checkBoxRemember;
    private Switch switchInvisibility;
    private ToggleButton toggleButtonHelp;
    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewEnterLoginPassword = findViewById(R.id.text_view_enter_log_pass);

        editTextLogin = findViewById(R.id.edit_text_login);
        editTextPassword = findViewById(R.id.edit_text_password);

        buttonLogIn = findViewById(R.id.button_log_in);
        buttonLogIn.setOnClickListener(this);

        checkBoxRemember = findViewById(R.id.checkbox_remember);
        checkBoxRemember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        switchInvisibility = findViewById(R.id.switch_invisibility);

        toggleButtonHelp = findViewById(R.id.toggle_button_help);

        calendarView = findViewById(R.id.calendar_view);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_log_in:
                Intent intent = new Intent(this, UserInfo.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}