package com.example.magic_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Detailpage_OrderInquiryPageActivity extends AppCompatActivity {
    private Button btnBack;

    private Button btnEnroll;
    private Button btnCancellation;
    private Button btnBag;
    private Button btnHome;
    private Button btnSearch;
    private String productName;
    private String productPrice;
    private String sellerId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_inquiry_page);

        btnBack = findViewById(R.id.back_btn);
        btnEnroll = findViewById(R.id.btn_enroll);
        btnCancellation = findViewById(R.id.btn_Cancellation);
        btnHome = findViewById(R.id.home_btn);
        btnBag = findViewById(R.id.bag_btn);
        btnSearch = findViewById(R.id.search_btn);

        btnBack.setVisibility(View.VISIBLE);
        btnEnroll.setVisibility(View.VISIBLE);
        btnCancellation.setVisibility(View.VISIBLE);
        btnBag.setVisibility(View.VISIBLE);
        btnHome.setVisibility(View.VISIBLE);
        btnSearch.setVisibility(View.VISIBLE);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detailpage_MainAskActivity.class);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("product_name", productName);
                resultIntent.putExtra("seller_id", sellerId);
                resultIntent.putExtra("product_price", productPrice);

                // 결과를 설정하고 현재 활동을 종료합니다.
                setResult(RESULT_OK, resultIntent);
                finish();

            }
        });

        btnEnroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detailpage_MainAskActivity.class);
                startActivity(intent);
            }
        });

        btnCancellation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detailpage_MainAskActivity.class);
                startActivity(intent);
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SearchActivity.class);
                startActivity(intent);
            }
        });


        btnBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShoppingBasketActivity.class);
                startActivity(intent);
            }
        });

    }

}
