package com.codewithpranjali.Paying_Guest_Accomdation.controller;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.Owner;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.PGPlace;
import com.codewithpranjali.Paying_Guest_Accomdation.repository.OwnerRepository;
import com.codewithpranjali.Paying_Guest_Accomdation.repository.PGPlaceRepository;

import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/owner")
public class OwnerController {
private final PGPlaceRepository pgRepo;
private final OwnerRepository ownerRepo;

public OwnerController(PGPlaceRepository pgRepo, OwnerRepository
ownerRepo) {
this.pgRepo = pgRepo;
this.ownerRepo = ownerRepo;
}

// add pg
@PostMapping("/{ownerId}/places")
public PGPlace addPlace(@PathVariable Long ownerId, @RequestBody PGPlace pg) {
Owner owner = ownerRepo.findById(ownerId).orElseThrow();
pg.setOwner(owner);
return pgRepo.save(pg);
}
@GetMapping("/{ownerId}/places")
public List<PGPlace> getPlacesByOwner(@PathVariable Long ownerId) {
Owner owner = ownerRepo.findById(ownerId).orElseThrow();
return owner.getPgPlaces();
}
@PutMapping("/places/{id}")
public PGPlace updatePG(@PathVariable Long id, @RequestBody PGPlace pg) {
PGPlace existing = pgRepo.findById(id).orElseThrow();
existing.setPgName(pg.getPgName());
existing.setCity(pg.getCity());
existing.setLocality(pg.getLocality());
existing.setRentAmount(pg.getRentAmount());
existing.setAvailable(pg.isAvailable());
return pgRepo.save(existing);
}
@PutMapping("/places/{id}/availability")
public PGPlace changeAvailability(@PathVariable Long id, @RequestParam
boolean available) {
PGPlace pg = pgRepo.findById(id).orElseThrow();
pg.setAvailable(available);
return pgRepo.save(pg);
}
@DeleteMapping("/places/{id}")
public void deletePG(@PathVariable Long id) {
pgRepo.deleteById(id);
}
}
