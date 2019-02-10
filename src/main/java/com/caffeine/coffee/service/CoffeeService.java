package com.caffeine.coffee.service;


import com.caffeine.coffee.pojo.Coffee;

import java.util.List;

public interface CoffeeService {
    Coffee getCoffee(long id);
    List<Coffee> getAllCoffee();


}
