package com.codewithpranjali.Paying_Guest_Accomdation.controller;
import org.springframework.web.bind.annotation.*;

import com.codewithpranjali.Paying_Guest_Accomdation.dto.OwnerRegisterRequest;
import com.codewithpranjali.Paying_Guest_Accomdation.dto.TenantRegisterRequest;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.Owner;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.Tenant;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.User;
import com.codewithpranjali.Paying_Guest_Accomdation.service.AuthService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
private final AuthService authService;
public AuthController(AuthService authService) {
this.authService = authService;
}
@PostMapping("/register/tenant")
public User registerTenant(@RequestBody TenantRegisterRequest request) {
User user = new User();
user.setFullName(request.getFullName());
user.setEmail(request.getEmail());
user.setPassword(request.getPassword());
Tenant tenant = new Tenant();
tenant.setAge(request.getAge());
tenant.setCity(request.getCity());
tenant.setPreferredLocality(request.getPreferredLocality());
return authService.registerTenant(user, tenant);
}
@PostMapping("/register/owner")
public User registerOwner(@RequestBody OwnerRegisterRequest request) {
User user = new User();
user.setFullName(request.getFullName());
user.setEmail(request.getEmail());
user.setPassword(request.getPassword());
Owner owner = new Owner();
owner.setAge(request.getAge());
owner.setContactNumber(request.getContactNumber());
return authService.registerOwner(user, owner);
}
@PostMapping("/register/admin")
public User registerAdmin(@RequestBody User user) {
return authService.registerAdmin(user);
}
@PostMapping("/login")
public User login(@RequestParam String email, @RequestParam String password) {
return authService.login(email, password);
}
}
