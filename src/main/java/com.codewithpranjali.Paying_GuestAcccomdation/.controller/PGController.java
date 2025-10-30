package com.codewithpranjali.Paying_Guest_Accomdation.controller;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.PGPlace;
import com.codewithpranjali.Paying_Guest_Accomdation.repository.PGPlaceRepository;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pg")
public class PGController {
private final PGPlaceRepository repo;
public PGController(PGPlaceRepository repo) {
this.repo = repo;
}
@GetMapping("/city/{city}")
public List<PGPlace> getByCity(@PathVariable String city) {
return repo.findByCity(city);
}
@GetMapping("/locality/{locality}")
public List<PGPlace> getByLocality(@PathVariable String locality) {
return repo.findByLocality(locality);
}
@GetMapping("/{id}")
public PGPlace getById(@PathVariable Long id) {
return repo.findById(id).orElseThrow();
}
}
