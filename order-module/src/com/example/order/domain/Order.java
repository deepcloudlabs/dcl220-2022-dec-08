package com.example.order.domain;

import java.util.List;

public record Order(int orderId,List<OrderItem> items) {
	
}
