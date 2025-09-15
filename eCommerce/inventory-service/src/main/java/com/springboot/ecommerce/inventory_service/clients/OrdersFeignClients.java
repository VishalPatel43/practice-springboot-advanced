package com.springboot.ecommerce.inventory_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service", path = "/api/v1/orders") // use the application name of the order service
public interface OrdersFeignClients {

    @GetMapping("core/helloOrders")
    String helloOrders();

}
