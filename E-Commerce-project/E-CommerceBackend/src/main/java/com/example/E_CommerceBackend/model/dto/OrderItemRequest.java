package com.example.E_CommerceBackend.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
