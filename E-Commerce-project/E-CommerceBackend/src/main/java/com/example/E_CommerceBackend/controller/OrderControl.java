package com.example.E_CommerceBackend.controller;

import com.example.E_CommerceBackend.model.dto.OrderRequest;
import com.example.E_CommerceBackend.model.dto.OrderResponse;
import com.example.E_CommerceBackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class OrderControl {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders/place")
    public ResponseEntity<OrderResponse>placeOrder(@RequestBody OrderRequest orderRequest) {
        OrderResponse orderResponse = orderService.placeOrder(orderRequest);
        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>>getAllOrders() {
        List<OrderResponse> orderResponses = orderService.getAllOrdersResponses();
        return new ResponseEntity<>(orderResponses, HttpStatus.OK);
    }
}
