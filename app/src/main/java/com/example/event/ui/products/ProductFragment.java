package com.example.event.ui.products;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.List;

public class ProductFragment extends Fragment {

    private ProductViewModel productViewModel;
    private RecyclerView rv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        productViewModel = ViewModelProviders.of(this).get(ProductViewModel.class);
        View v = inflater.inflate(R.layout.fragment_products, container, false);

        rv= v.findViewById(R.id.rv_products);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        productViewModel.initializeData();
        initializeAdapter();


        return v;
    }

    private void initializeAdapter(){
        List<Products> productsList = productViewModel.productsList;
        ProductRVAdapter adapter = new ProductRVAdapter(productsList);
        rv.setAdapter(adapter);
    }


}