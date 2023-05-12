package com.quocnguyen.cruddemo;

import com.quocnguyen.cruddemo.dao.StudentDAO;
import com.quocnguyen.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//readStudent(studentDAO);
			//getStudentList(studentDAO);
			//updateAStudent(studentDAO);
		};
	}


	public void updateAStudent(StudentDAO studentDAO) {
		System.out.println("Getting a student with id 1");
		Student student = studentDAO.findById(1);
		System.out.println(student);
		System.out.println("Changing the first name of student");
		student.setFirstName("Lan");
		System.out.println("Update the object");
		studentDAO.update(student);
		System.out.println(studentDAO.findById(1));
	}

	public void getStudentList(StudentDAO studentDAO) {
		List<Student> list = studentDAO.findAll();
		list.forEach(System.out::println);
	}

	public void readStudent(StudentDAO studentDAO) {
		System.out.println("Reading a student with ID 1");
		Student student = studentDAO.findById(1);
		if(student != null) {
			System.out.println(student.toString());
		}
	}

	public void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating multiple students....");

		//create new students
		Student student1 = new Student("Hanh", "Tran", "hanhtran11@gmail.com");
		Student student2 = new Student("Long", "Nguyen", "lnguyen2000@gmail.com");
		Student student3 = new Student("Phuc", "Phan", "phucphan@gmail.com");

		//Saving students
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}

	public void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student student = new Student("Quoc", "Nguyen", "quocng777@gmail.com");

		//save the student object
		System.out.println("Saving the student");
		studentDAO.save(student);

		//display id of the saved student
		System.out.println("Saved student. Generated id: " + student.getId());
	}


}
