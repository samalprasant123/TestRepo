package com.epam.streams_problem1;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamsQuestion {

	public static void main(String[] args) {

		Student s1 = new Student("Student1", 17, List.of(
				new Subject("English", 70), 
				new Subject("Geography", 85), 
				new Subject("History", 75), 
				new Subject("Maths", 90)));
		Student s2 = new Student("Student2", 15, List.of(
				new Subject("English", 75), 
				new Subject("Geography", 80), 
				new Subject("History", 80)));
		Student s3 = new Student("Student3", 16, List.of(
				new Subject("English", 80), 
				new Subject("Geography", 80), 
				new Subject("History", 80)));
        
        System.out.println("Start...");

        // 1- Using Streams display the Students in ascending order of their age
		

        // 2- Using Streams display the distinct subjects
		

        System.out.println("End...");
		

	}
}

class Student {

	private String name;

	private int age;

	private int totalMarks;

	private List<Subject> subjects;

	public List<Subject> getSubjects() {
		if (this.subjects == null) {
			this.subjects = new ArrayList<>();
		}
		return this.subjects;
	}

	public Student(String name, int age, List<Subject> subjects) {
		this.name = name;
		this.age = age;
		if (subjects != null && !subjects.isEmpty()) {
			this.getSubjects().addAll(subjects);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", totalMarks=" + totalMarks + ", subjects="
				+ subjects + '}';
	}
}

class Subject {

	private String name;

	private int mark;

	public Subject(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Subject{" + "subject='" + name + '\'' + ", mark=" + mark + '}';
	}
}
