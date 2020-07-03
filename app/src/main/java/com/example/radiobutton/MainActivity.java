package com.example.radiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radioG;
    private static RadioButton radioB;
    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
    }
    public void onClickListenerButton()
    {
        radioG = (RadioGroup)findViewById(R.id.rg);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButton= radioG.getCheckedRadioButtonId();
                radioB=(RadioButton)findViewById(selectedRadioButton);
                Toast.makeText(MainActivity.this,radioB.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });
    }
}