package com.example.magic_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Manager_ProductReviseListActivity extends AppCompatActivity {

    public List<ProductReviseItem> getProductReviseList() {
        List<ProductReviseItem> productReviseList = new ArrayList<>();

        // 예시 데이터를 추가합니다. 실제 데이터는 여기서 가져와야 합니다.
        productReviseList.add(new ProductReviseItem("2023-11-27", "브랜드 A", "상품 A", "S", "1"));
        productReviseList.add(new ProductReviseItem("2023-11-27", "브랜드 A", "상품 B", "M", "2"));
        productReviseList.add(new ProductReviseItem("2023-11-27", "브랜드 A", "상품 C", "L", "3"));
        productReviseList.add(new ProductReviseItem("2023-11-27", "브랜드 A", "상품 D", "S", "4"));
        productReviseList.add(new ProductReviseItem("2023-11-27", "브랜드 A", "상품 E", "M", "5"));
        // ... 추가적인 데이터

        return productReviseList;
    }

    public Context context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_product_revise);
        getWindow().setWindowAnimations(0);

        Button btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.product_revise_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ProductReviseItem> productReviseList = getProductReviseList(); // 여러 배송지 정보를 가져오는 메서드
        ProductReviseAdapter adapter = new ProductReviseAdapter(productReviseList, this);
        recyclerView.setAdapter(adapter);
    }

    public class ProductReviseItem {
        String date;
        String sellerName;
        String productName;
        String productSize;
        String productQuantity;

        public ProductReviseItem(String date, String sellerName, String productName, String productSize, String productQuantity) {
            this.date = date;
            this.sellerName = sellerName;
            this.productName = productName;
            this.productSize = productSize;
            this.productQuantity = productQuantity;
        }
    }

    public class ProductReviseAdapter extends RecyclerView.Adapter<ProductReviseAdapter.ProductReviseViewHolder> {
        private List<ProductReviseItem> productReviseList;
        private Context context;

        ProductReviseAdapter(List<ProductReviseItem> productReviseList, Context context) {
            this.productReviseList = productReviseList;
            this.context = context;
        }

        @NonNull
        @Override
        public ProductReviseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            Context context = parent.getContext(); // Context 설정
            View view = LayoutInflater.from(context).inflate(R.layout.manager_item_product_revise, parent, false);
            return new ProductReviseViewHolder(view, context);
        }

        @Override
        public void onBindViewHolder(@NonNull ProductReviseViewHolder holder, int position) {
            ProductReviseItem productReviseItem = productReviseList.get(position);
            holder.bind(productReviseItem);
        }

        @Override
        public int getItemCount() { return productReviseList.size(); }

        public class ProductReviseViewHolder extends RecyclerView.ViewHolder {
            private final TextView dateTextView;
            private final TextView sellerNameTextView;
            private final TextView productNameTextView;
            private final TextView productSizeTextView;
            private final TextView productQuantityTextView;
            private final Button productReviseButton;
            private final Context context;

            public ProductReviseViewHolder(View itemView, Context context) {
                super(itemView);
                this.context = context;
                dateTextView = itemView.findViewById(R.id.date);
                sellerNameTextView = itemView.findViewById(R.id.sellerName);
                productNameTextView = itemView.findViewById(R.id.productName);
                productSizeTextView = itemView.findViewById(R.id.productSize);
                productQuantityTextView = itemView.findViewById(R.id.productQuantity);
                productReviseButton = itemView.findViewById(R.id.btn_product_revise);

            }

            void bind(ProductReviseItem productUnregisteredItem) {
                dateTextView.setText(productUnregisteredItem.date);
                sellerNameTextView.setText(productUnregisteredItem.sellerName);
                productNameTextView.setText(productUnregisteredItem.productName);
                productSizeTextView.setText(productUnregisteredItem.productSize);
                productQuantityTextView.setText(productUnregisteredItem.productQuantity);
            }
        }
    }
}

