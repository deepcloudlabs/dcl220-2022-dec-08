package com.example.order.service;

import java.util.List;

import com.example.order.domain.Order;
import com.example.order.domain.OrderItem;

public interface OrderService {
	List<OrderItem> receiveOrder(Order order);
	boolean purchase(Order order);
}
