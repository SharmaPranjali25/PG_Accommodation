package com.codewithpranjali.Paying_Guest_Accomdation.service;

import org.springframework.stereotype.Service;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.Owner;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.Tenant;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.User;
import com.codewithpranjali.Paying_Guest_Accomdation.enums.UserRole;
import com.codewithpranjali.Paying_Guest_Accomdation.repository.OwnerRepository;
import com.codewithpranjali.Paying_Guest_Accomdation.repository.TenantRepository;
import com.codewithpranjali.Paying_Guest_Accomdation.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {
private final UserRepository userRepo;
private final TenantRepository tenantRepo;
private final OwnerRepository ownerRepo;
public AuthServiceImpl(UserRepository userRepo, TenantRepository
tenantRepo, OwnerRepository ownerRepo) {
this.userRepo = userRepo;
this.tenantRepo = tenantRepo;
this.ownerRepo = ownerRepo;
}
@Override
public User registerTenant(User user, Tenant tenant) {
if (tenant.getAge() < 18)
throw new IllegalArgumentException("Tenant must be at least 18 years old.");
user.setRole(UserRole.TENANT);
tenant.setUser(user);
user.setTenant(tenant);
return userRepo.save(user);
}
@Override
public User registerOwner(User user, Owner owner) {
if (owner.getAge() < 18)
throw new IllegalArgumentException("Owner must be at least 18 years old.");
user.setRole(UserRole.OWNER);
owner.setUser(user);
user.setOwner(owner);
return userRepo.save(user);
}
@Override
public User registerAdmin(User user) {
user.setRole(UserRole.ADMIN);
return userRepo.save(user);
}

//login function
@Override
public User login(String email, String password) {
User user = UserRepository.findByEmail(email).orElseThrow(() -> new
IllegalArgumentException("User not found"));
if (!user.getPassword().equals(password)) {
throw new IllegalArgumentException("Invalid credentials");
}
return user;
}
}
