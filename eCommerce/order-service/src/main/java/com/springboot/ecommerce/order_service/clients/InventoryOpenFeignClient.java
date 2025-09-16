package com.springboot.ecommerce.order_service.clients;

import com.springboot.ecommerce.order_service.dto.OrderRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "inventory-service", path = "/api/v1/inventory") // use the application name of the inventory service
public interface InventoryOpenFeignClient {

    @PutMapping("/products/reduce-stocks" )
    Double reduceStocks(@RequestBody OrderRequestDto orderRequestDto);

}
