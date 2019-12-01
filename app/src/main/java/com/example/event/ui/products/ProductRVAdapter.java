package com.example.event.ui.products;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.List;

public class ProductRVAdapter extends RecyclerView.Adapter<ProductRVAdapter.ProductViewHolder> {

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView productName;
        TextView productDescription;
        TextView productPrice;
        ImageView productPhoto;

        ProductViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_product);
            productName = (TextView)itemView.findViewById(R.id.product_titile);
            productDescription = (TextView)itemView.findViewById(R.id.product_description);
            productPrice = (TextView)itemView.findViewById(R.id.product_price);
            productPhoto = (ImageView)itemView.findViewById(R.id.product_photo);
        }
    }

    List<Products> productsList;
    ProductRVAdapter(List<Products> products){
        this.productsList = products;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_product, viewGroup, false);
        ProductViewHolder pvh = new ProductViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder productViewHolder, int i) {
        productViewHolder.productName.setText(productsList.get(i).name);
        productViewHolder.productDescription.setText(productsList.get(i).description);
        productViewHolder.productPrice.setText(productsList.get(i).price);
        productViewHolder.productPhoto.setImageResource(productsList.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }
}

