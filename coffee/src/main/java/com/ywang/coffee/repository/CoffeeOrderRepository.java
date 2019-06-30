package com.ywang.coffee.repository;

import com.ywang.coffee.model.CoffeeOrder;

import java.util.List;

public interface CoffeeOrderRepository extends BaseRepository<CoffeeOrder, Long> {
    List<CoffeeOrder> findByCustomerById(String customer);
    List<CoffeeOrder> findByItems_Name(String name);
}
