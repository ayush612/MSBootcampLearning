package com.example.orderms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.orderms.entity.GroceryOrder;

@Component
@Transactional
public interface OrderJPARepository extends JpaRepository<GroceryOrder, Integer>{

}
