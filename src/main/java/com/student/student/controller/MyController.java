package com.student.student.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.student.entity.Student;
import com.student.student.service.StudentData;

@RestController
public class MyController {
	
	@Autowired
	private StudentData st;

	@GetMapping("/")
	public ArrayList<Student> getData() {
		return this.st.getData();
	}
	
	@GetMapping("/{name}")
	public Student getData(@PathVariable String name) {
		return this.st.getData(name);
	}
	
	@PostMapping("/")
	public String sendData(@RequestBody Student s) {
		return this.st.addData(s);
	}
	
	@PutMapping("/{id}")
	public String updateData(@PathVariable int id,@RequestBody Student s) {
		return this.st.update(id, s);
	}
	
	@DeleteMapping("/{id}")
	public String deleteData(@PathVariable int id) {
		return this.st.delete(id);
	}
}
