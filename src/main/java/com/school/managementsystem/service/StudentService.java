package com.school.managementsystem.service;

import com.school.managementsystem.entity.Master;
import com.school.managementsystem.entity.Student;
import com.school.managementsystem.entity.StudentFee;
import com.school.managementsystem.entity.StudentPayment;
import com.school.managementsystem.entity.model.Stu_Stufee;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student insertStudent(Student student);

    Student getStudentById(int id);

    List<Student> getStudentsByYearStandard(int year, String standard);

    StudentFee getStudentFeeById(int id);

    String deleteStudentById(int id);

    Student insertStudentPayment(int id, StudentPayment studentPayment);

    Student insertStudentSimpl(StudentFee stuFee);
    
    Master insertMaster(Master master);

    List<Master> getMasters();
}
