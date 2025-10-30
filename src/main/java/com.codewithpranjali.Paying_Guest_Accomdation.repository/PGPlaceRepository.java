package com.codewithpranjali.Paying_Guest_Accomdation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.PGPlace;

import java.util.List;
public interface PGPlaceRepository extends JpaRepository<PGPlace, Long> {
List<PGPlace> findByCity(String city);
List<PGPlace> findByLocality(String locality);
}

