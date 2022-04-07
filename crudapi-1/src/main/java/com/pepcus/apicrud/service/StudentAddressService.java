package com.pepcus.apicrud.service;

import com.pepcus.apicrud.model.Student;
import com.pepcus.apicrud.model.StudentAddress;

public interface StudentAddressService {
	 StudentAddress saveStudentAddress(StudentAddress studentAddress);
	 StudentAddress getStudentAddressById(long id);
	 
}
