package com.example.shop.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> itemsList) {
        items.addAll(itemsList);
        return itemsList;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

}
