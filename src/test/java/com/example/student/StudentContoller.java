package com.example.student;

import com.example.student.Repository.StudentRepository;
import com.example.student.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static sun.nio.cs.Surrogate.is;

@WebMvcTest
public class StudentContoller {

    @Autowired
    private MockMvc mockmvc;


    @MockBean
    private StudentRepository studentRepository;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void employeeAddTest() throws Exception {

        Student student=Student.builder()
                .id(1)
                .name("mani")
                .age(23)
                .salary(28000.0D)
                .build();

        Mockito.when(studentRepository.save(Mockito.any(Student.class))).thenReturn(student);
//		BDDMockito.given(employeeservice.adds(employee)).willAnswer((invocation)->invocation.getArgument(0));
//
        ResultActions response=mockmvc.perform(post("/add")
                MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                                .post("/students")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(new ObjectMapper().writeValueAsString(student)))
                        .andExpect(status().isCreated())
                        .andExpect(jsonPath("$.id").exists())
                        .andExpect(jsonPath("$.name").value("John Doe"))
                        .andExpect(jsonPath("$.age").value(25))
                        .andExpect(jsonPath("$.salary").value(50000.0))
                        .andReturn();

        // Assert additional conditions if needed
        // Example: assertThat(result.getResponse().getContentAsString()).contains("something");
    }
                        .
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(mapper.writeValueAsString(student)));
//
//
//        response.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.id", is(student.getId())))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name", is(student.getName())))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.age", is(student.getAge())))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.salary", is(student.getSalary())));
    }


}
