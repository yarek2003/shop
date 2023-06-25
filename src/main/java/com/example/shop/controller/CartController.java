package com.example.shop.controller;

import com.example.shop.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> id) {
        return cartService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.get();
    }

}
