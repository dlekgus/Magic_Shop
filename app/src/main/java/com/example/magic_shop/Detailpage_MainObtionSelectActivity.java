package com.example.magic_shop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Detailpage_MainObtionSelectActivity extends AppCompatActivity {
    private Button btnOption;
    private Button btnColor;
    private Button btnColorSelect;
    private Button btnSizeSelect;
    private Button btnSize_S;
    private Button btnSize_M;
    private Button btnSize_L;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailpage_main_obtion_select);

        btnOption = findViewById(R.id.btn_option);
        btnColor = findViewById(R.id.btn_color);
        btnColorSelect = findViewById(R.id.btn_color_select);
        btnSizeSelect = findViewById(R.id.btn_size_select);
        btnSize_S = findViewById(R.id.btn_size_S);
        btnSize_M = findViewById(R.id.btn_size_M);
        btnSize_L = findViewById(R.id.btn_size_L);
        btnBack = findViewById(R.id.back_btn);

        // 초기 상태에서는 btnBuy를 보이고 btnOption을 숨깁니다.
        btnOption.setVisibility(View.VISIBLE);
        btnColorSelect.setVisibility(View.VISIBLE);
        btnSizeSelect.setVisibility(View.VISIBLE);
        btnColor.setVisibility(View.GONE);
        btnSize_S.setVisibility(View.GONE);
        btnSize_M.setVisibility(View.GONE);
        btnSize_L.setVisibility(View.GONE);
        btnBack.setVisibility(View.VISIBLE);


        // btnBuy의 클릭 이벤트 처리
        btnColorSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnBuy를 숨기고 btnOption을 보이도록 변경
                btnColor.setVisibility(View.VISIBLE);
                btnSizeSelect.setVisibility(View.GONE);

            }
        });

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnBuy를 숨기고 btnOption을 보이도록 변경
                btnColor.setVisibility(View.GONE);
                btnColorSelect.setVisibility(View.VISIBLE);
                btnSizeSelect.setVisibility(View.VISIBLE);

            }
        });


        btnSizeSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnBuy를 숨기고 btnOption을 보이도록 변경
                btnSize_S.setVisibility(View.VISIBLE);
                btnSize_M.setVisibility(View.VISIBLE);
                btnSize_L.setVisibility(View.VISIBLE);
            }
        });

        btnSize_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnBuy를 숨기고 btnOption을 보이도록 변경

            }
        });

        btnSize_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnBuy를 숨기고 btnOption을 보이도록 변경

            }
        });

        btnSize_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnBuy를 숨기고 btnOption을 보이도록 변경

            }
        });

        btnOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detailpage_MainActivity.class);
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detailpage_MainActivity.class);
                startActivity(intent);
            }
        });
    }
}