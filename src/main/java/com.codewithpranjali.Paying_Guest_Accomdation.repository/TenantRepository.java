package com.codewithpranjali.Paying_Guest_Accomdation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.Tenant;
public interface TenantRepository extends JpaRepository<Tenant, Long> {}
