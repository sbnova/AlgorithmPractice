package com.cyj.algorithmpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private android.widget.Button question01Btn;
    private Button question02Btn;
    private Button question03Btn;
    private Button question04Btn;
    private Button question05Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        question01Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        question02Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Question02Activity.class);
                startActivity(intent);
            }
        });

        question03Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Question03Activity.class);
                startActivity(intent);
            }
        });

        question04Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Question04Activity.class);
                startActivity(intent);
            }
        });

        question05Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Question05Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.question05Btn = (Button) findViewById(R.id.question05Btn);
        this.question04Btn = (Button) findViewById(R.id.question04Btn);
        this.question03Btn = (Button) findViewById(R.id.question03Btn);
        this.question02Btn = (Button) findViewById(R.id.question02Btn);
        this.question01Btn = (Button) findViewById(R.id.question01Btn);
    }
}
