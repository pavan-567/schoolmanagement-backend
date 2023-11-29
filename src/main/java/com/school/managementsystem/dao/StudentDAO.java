package com.school.managementsystem.dao;

import com.school.managementsystem.entity.Master;
import com.school.managementsystem.entity.Student;
import com.school.managementsystem.entity.StudentFee;
import com.school.managementsystem.entity.StudentPayment;
import com.school.managementsystem.entity.model.Stu_Stufee;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentDAO {
    List<Student> listStudents();
    Student insertStudent(Student student);

    Student getStudentById(int id);

    Student insertStudentPayment(Student student, StudentPayment studentPayment);

    Student insertStudentPaymentSimpl(StudentFee stuFee, MultipartFile file);

    List<Student> getStudentsByYearStandard(int year, String standard);

    StudentFee getStudentWithFeeById(int id);

    String deleteStudentById(int id);

    Student insertStudentWithFee(Student stu, StudentFee stuFee, MultipartFile file);

    Master insertMasterDetails(Master master);

    List<Master> getMasterDetails();
}
