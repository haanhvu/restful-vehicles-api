package com.haanhvu.pricing.repository;

import org.springframework.data.repository.CrudRepository;

import com.haanhvu.pricing.entity.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {

}
