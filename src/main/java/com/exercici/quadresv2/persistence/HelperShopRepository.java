package com.exercici.quadresv2.persistence;

import com.exercici.quadresv2.domain.Shop;
import org.springframework.data.repository.CrudRepository;

public interface HelperShopRepository extends CrudRepository<Shop, Integer> {
    public Shop findByName(String name);
}

