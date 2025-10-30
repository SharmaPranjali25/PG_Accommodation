package com.codewithpranjali.Paying_Guest_Accomdation.service;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.Owner;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.Tenant;
import com.codewithpranjali.Paying_Guest_Accomdation.entites.User;

public interface AuthService {
User registerTenant(User user, Tenant tenant);
User registerOwner(User user, Owner owner);
User registerAdmin(User user);
User login(String email, String password);
}
