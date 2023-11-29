package com.school.managementsystem.controller;

import com.school.managementsystem.entity.Master;
import com.school.managementsystem.entity.Student;
import com.school.managementsystem.entity.StudentFee;
import com.school.managementsystem.entity.StudentPayment;
import com.school.managementsystem.entity.model.Stu_Stufee;
import com.school.managementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/studentAPI")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // Server Verification
    @GetMapping("/serverVerify")
    private Map verifyServer() {
        return Collections.singletonMap("message", "success");
    }

    // JUST FOR TESTING PURPOSE
    @PostMapping("/students-postman")
    private Student insertStu(@RequestPart("data") Student student, @RequestPart("file")MultipartFile file) {
        student.setId(0);
        try {
            student.setImageData(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentService.insertStudent(student);
    }


    // Using This One To Create The Students
    @PostMapping("/student-simple")
    private Student insertStudentSimple(@RequestBody StudentFee stuFee) {
        return studentService.insertStudentSimpl(stuFee, file);
    }

    @GetMapping("/students")
    private List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    private Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/student/{year}/{standard}")
    private List<Student> getStudentByYear(@PathVariable int year,@PathVariable String standard) {
        return studentService.getStudentsByYearStandard(year, standard);
    }


    // This Method Doesn't Need To Be Frank [Not Used]
    @GetMapping("/student-fee/{id}")
    private Stu_Stufee getFullStudentWithFee(@PathVariable int id) {
        return studentService.getStudentWithFee(id);
    }

    @DeleteMapping("/student-delete/{id}")
    private String deleteStudentById(@PathVariable int id) {
        return studentService.deleteStudentById(id);
    }

    // Payment Related Handling
    @GetMapping("/student-fee-excl/{id}")
    private StudentFee getStudentFeeByID(@PathVariable int id) {
        return studentService.getStudentFeeById(id);
    }

    @PostMapping("/student-payment/{studentId}")
    private Student insertStudentPayment(@RequestBody StudentPayment studentPayment, @PathVariable int studentId) {
        return studentService.insertStudentPayment(studentId, studentPayment);
    }


    // Master
    @PostMapping("/master")
    private Master insertMasterDetails(@RequestBody Master master) {
        return studentService.insertMaster(master);
    }

    @GetMapping("/master")
    private List<Master> getMasterDetails() {
        return studentService.getMasters();
    }
}
