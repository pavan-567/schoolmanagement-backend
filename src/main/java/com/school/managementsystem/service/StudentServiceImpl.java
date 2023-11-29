package com.school.managementsystem.service;

import com.school.managementsystem.dao.StudentDAO;
import com.school.managementsystem.entity.Master;
import com.school.managementsystem.entity.Student;
import com.school.managementsystem.entity.StudentFee;
import com.school.managementsystem.entity.StudentPayment;
import com.school.managementsystem.entity.model.Stu_Stufee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.time.Year;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentDAO.listStudents();
    }

    @Override
    @Transactional
    public Student insertStudent(Student student) {
        return studentDAO.insertStudent(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public List<Student> getStudentsByYearStandard(int year, String standard) {
        return studentDAO.getStudentsByYearStandard(year, standard);
    }


    @Override
    public StudentFee getStudentFeeById(int id) {
        return studentDAO.getStudentWithFeeById(id);
    }

    @Override
    @Transactional
    public String deleteStudentById(int id) {
        return studentDAO.deleteStudentById(id);
    }

    @Override
    @Transactional
    public Student insertStudentPayment(int id, StudentPayment studentPayment) {
        Student currStu = studentDAO.getStudentById(id);
        return studentDAO.insertStudentPayment(currStu, studentPayment);
    }


    @Override
    @Transactional
    public Student insertStudentSimpl(StudentFee studentFee) {
        return studentDAO.insertStudentPaymentSimpl(studentFee);
    }

    @Override
    @Transactional
    public Master insertMaster(Master master) {
        return studentDAO.insertMasterDetails(master);
    }

    @Override
    public List<Master> getMasters() {
        return studentDAO.getMasterDetails();
    }
}
