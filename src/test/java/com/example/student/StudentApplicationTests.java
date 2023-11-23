package com.example.student;

import com.example.student.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentApplicationTests {

	@Test
	void testStudentDetails() {

		Student student = new Student();
		student.setName("Mani");
		student.setAge(23);
		student.setSalary(28000.0);

		assertEquals("mani", student.getName());
		assertEquals(23, student.getAge());
		assertEquals(28000.0, student.getSalary());
	}
}


