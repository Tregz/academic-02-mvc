package com.tregz.mvc.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import com.tregz.mvc.R;

public class MainActivity extends AppCompatActivity {

    private String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String nameLabel = getString(R.string.label_username);
        final AppCompatTextView username = findViewById(R.id.username);

        findViewById(R.id.image_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(!view.isSelected());
            }
        });

        ((TextView)findViewById(R.id.input_editor)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String sequence = charSequence.toString();
                if (!sequence.isEmpty()) input = sequence;
                else input = nameLabel;
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // do nothing
            }
        });

        findViewById(R.id.negative_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText(nameLabel);
            }
        });

        findViewById(R.id.positive_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText(input);
            }
        });
    }
}
