package com.example.shop.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
@Component
@SessionScope
public interface CartService {
    List<Integer> add(List<Integer> id);

    List<Integer> get();
}
