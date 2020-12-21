package com.spring.starbucks.repository;

import com.spring.starbucks.classes.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Integer> {
}
