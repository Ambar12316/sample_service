package com.ordersystem.inventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ordersystem.inventoryservice.model.*;
public interface InventoryRepository extends MongoRepository<InventoryItem, String> {

}
