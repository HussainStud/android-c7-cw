package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView nameTextView = findViewById(R.id.details_nameTextView);
        TextView priceTextView = findViewById(R.id.details_priceTextView);
        ImageView itemImageView = findViewById(R.id.details_itemImageView);

        Bundle bundle = getIntent().getExtras();

        final Items currentItem = (Items) bundle.getSerializable("ITEMS");

        nameTextView.setText(currentItem.getItemName());
        priceTextView.setText("Price: " + currentItem.getItemPrice());
        itemImageView.setImageResource(currentItem.getItemImage());
    }
}