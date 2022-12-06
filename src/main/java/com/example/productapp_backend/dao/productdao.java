package com.example.productapp_backend.dao;

import com.example.productapp_backend.model.product;
import org.springframework.data.repository.CrudRepository;

public interface productdao extends CrudRepository<product,Integer> {
}
