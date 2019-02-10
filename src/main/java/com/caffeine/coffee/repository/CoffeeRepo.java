package com.caffeine.coffee.repository;

import com.caffeine.coffee.pojo.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepo extends JpaRepository<Coffee,Long> {

}
