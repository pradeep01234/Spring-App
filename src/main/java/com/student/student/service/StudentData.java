package com.student.student.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.student.student.entity.Student;


@Service
public class StudentData {
	ArrayList<Student> list;
	StudentData(){
		list = new ArrayList<>();
		list.add(new Student(1,"Pradeep","CSE"));
		list.add(new Student(2,"Raj","EC"));
	}
	
	public ArrayList<Student> getData() {
		return list;
	}
	
	public Student getData(String name) {
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				return list.get(i);
			}
		}
		return null;
	}
	public String addData(Student s) {
		try {
		list.add(s);
		return "done";
		}
		catch(Exception e) {
			return "error occur";
		}
	}
	public String update(int id,Student s) {
		for(int i=0;i<list.size();i++) {
			if(id==list.get(i).getId()) {
				list.set(i, s);
				return "updated";
			}
		}
		return "somthing went wrong";
	}
	public String delete(int id) {
		for(int i=0;i<list.size();i++) {
			if(id==list.get(i).getId()) {
				list.remove(i);
				return "Deleted";
			}
		}
		return "somthing went wrong";
	}
}
