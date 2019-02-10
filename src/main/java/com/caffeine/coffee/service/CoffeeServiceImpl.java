package com.caffeine.coffee.service;

import com.caffeine.coffee.pojo.Coffee;
import com.caffeine.coffee.repository.CoffeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    private CoffeeRepo mRepo;

    @Autowired
    public CoffeeServiceImpl(CoffeeRepo mRepo) {
        this.mRepo = mRepo;
    }

    @Override
    public Coffee getCoffee(long id) {
        return mRepo.getOne(id);
    }

    @Override
    public List<Coffee> getAllCoffee() {
        return mRepo.findAll();
    }
}
