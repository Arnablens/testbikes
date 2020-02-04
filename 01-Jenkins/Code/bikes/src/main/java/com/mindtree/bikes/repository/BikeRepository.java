package com.mindtree.bikes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bikes.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

}
