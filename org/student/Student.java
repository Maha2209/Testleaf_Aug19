package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName() from Student Sub Class.");
	}

	public void studentDept() {
		System.out.println("studentDept() from Student Sub Class.");
	}

	public void studentId() {
		System.out.println("studentId() from Student Sub Class.");
	}

	public static void main(String[] args) {
		Student dep = new Student();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();
		dep.deptName();
		dep.studentDept();
		dep.studentId();
		dep.studentName();

	}
}
