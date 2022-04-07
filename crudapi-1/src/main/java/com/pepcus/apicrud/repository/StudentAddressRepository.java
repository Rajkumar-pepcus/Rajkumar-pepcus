package com.pepcus.apicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pepcus.apicrud.model.StudentAddress;

public interface StudentAddressRepository extends JpaRepository<StudentAddress,Long> {

}
