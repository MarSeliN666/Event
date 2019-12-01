package com.example.event.ui.products;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.event.R;

public class ProductCard extends Activity {

    TextView productName;
    TextView productDescription;
    ImageView productPhoto;
    TextView productPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.card_product);
        productName = (TextView)findViewById(R.id.product_titile);
        productDescription = (TextView)findViewById(R.id.product_description);
        productPhoto = (ImageView)findViewById(R.id.product_photo);
        productPrice = (TextView) findViewById(R.id.product_price);
    }
}

