package com.example.shop.impl;

import com.example.shop.model.Cart;
import com.example.shop.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        return cart.addItems(id);
    }

    @Override
    public List<Integer> get() {
        return cart.getItems();
    }
}
