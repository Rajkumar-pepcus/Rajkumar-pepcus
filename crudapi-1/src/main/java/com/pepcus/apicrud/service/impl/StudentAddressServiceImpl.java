package com.pepcus.apicrud.service.impl;

import java.util.Optional;

import com.pepcus.apicrud.exception.ResourceNoteFoundException;
import com.pepcus.apicrud.model.Student;
import com.pepcus.apicrud.model.StudentAddress;
import com.pepcus.apicrud.repository.StudentAddressRepository;
import com.pepcus.apicrud.repository.StudentRepository;
import com.pepcus.apicrud.service.StudentAddressService;

public class StudentAddressServiceImpl implements StudentAddressService {
	 private StudentAddressRepository studentAddressRepository;
	 
	 public StudentAddressServiceImpl(StudentAddressRepository studentAddressRepository) {
			super();
			this.studentAddressRepository = studentAddressRepository;
		}

	@Override
	public StudentAddress saveStudentAddress(StudentAddress studentAddress) {
		// TODO Auto-generated method stub
		return studentAddressRepository.save(studentAddress);
	}

	@Override
	public StudentAddress getStudentAddressById(long id) {
		// TODO Auto-generated method stub
		Optional<StudentAddress> studentAddress=studentAddressRepository.findById(id);
		if(studentAddress.isPresent()) {
		return studentAddress.get();
	}
		else {
			throw new ResourceNoteFoundException("student","id",id);
		}
	}

	

}
