package com.example.event.ui.products;

import androidx.lifecycle.ViewModel;

import com.example.event.R;

import java.util.ArrayList;
import java.util.List;

public class ProductViewModel extends ViewModel {

    public List<Products> productsList;

    public void initializeData() {
        productsList = new ArrayList<>();

        productsList.add(new Products
                ("Hoegaarden Brewery",
                        "A village called Hoegaarden, near Tienen in Flanders, is the modern birthplace of Belgian white beer.",
                        R.mipmap.ic_buddha_round,
                        "322" + " ₴"));
        productsList.add(new Products
                ("Vodka", "For homemade vodkas and distilled beverages referred to as moonshine, see moonshine and moonshine by country.", R.mipmap.ic_buddha_round, "228" + " ₴"));
        productsList.add(new Products
                ("Hoegaarden Brewery", "A village called Hoegaarden, near Tienen in Flanders, is the modern birthplace of Belgian white beer.", R.mipmap.ic_buddha_round, "322" + " ₴"));
        productsList.add(new Products
                ("Vodka", "For homemade vodkas and distilled beverages referred to as moonshine, see moonshine and moonshine by country.", R.mipmap.ic_buddha_round, "228" + " ₴"));
        productsList.add(new Products
                ("Hoegaarden Brewery", "A village called Hoegaarden, near Tienen in Flanders, is the modern birthplace of Belgian white beer.", R.mipmap.ic_buddha_round, "322" + " ₴"));
        productsList.add(new Products
                ("Vodka", "For homemade vodkas and distilled beverages referred to as moonshine, see moonshine and moonshine by country.", R.mipmap.ic_buddha_round, "228" + " ₴"));
        productsList.add(new Products
                ("Hoegaarden Brewery", "A village called Hoegaarden, near Tienen in Flanders, is the modern birthplace of Belgian white beer.", R.mipmap.ic_buddha_round, "322" + " ₴"));
        productsList.add(new Products
                ("Vodka", "For homemade vodkas and distilled beverages referred to as moonshine, see moonshine and moonshine by country.", R.mipmap.ic_buddha_round, "228" + " ₴"));
        productsList.add(new Products
                ("Hoegaarden Brewery", "A village called Hoegaarden, near Tienen in Flanders, is the modern birthplace of Belgian white beer.", R.mipmap.ic_buddha_round, "322" + " ₴"));
        productsList.add(new Products
                ("Vodka", "For homemade vodkas and distilled beverages referred to as moonshine, see moonshine and moonshine by country.", R.mipmap.ic_buddha_round, "228" + " ₴"));
        productsList.add(new Products
                ("Hoegaarden Brewery", "A village called Hoegaarden, near Tienen in Flanders, is the modern birthplace of Belgian white beer.", R.mipmap.ic_buddha_round, "322" + " ₴"));
        productsList.add(new Products
                ("Vodka", "For homemade vodkas and distilled beverages referred to as moonshine, see moonshine and moonshine by country.", R.mipmap.ic_buddha_round, "228" + " ₴"));
        productsList.add(new Products
                ("Hoegaarden Brewery", "A village called Hoegaarden, near Tienen in Flanders, is the modern birthplace of Belgian white beer.", R.mipmap.ic_buddha_round, "322" + " ₴"));
        productsList.add(new Products
                ("Vodka", "For homemade vodkas and distilled beverages referred to as moonshine, see moonshine and moonshine by country.", R.mipmap.ic_buddha_round, "228" + " ₴"));

    }
}