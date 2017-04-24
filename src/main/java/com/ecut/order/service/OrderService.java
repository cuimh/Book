package com.ecut.order.service;

import com.ecut.common.pojo.TaotaoResult;
import com.ecut.order.pojo.OrderInfo;

public interface OrderService {

	TaotaoResult createOrder(OrderInfo orderInfo);
}
