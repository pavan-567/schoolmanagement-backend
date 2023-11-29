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
    public Stu_Stufee getStudentWithFee(int id) {
        StudentFee tempStuFee = studentDAO.getStudentWithFeeById(id);
        if(tempStuFee == null) return null;
        Student tempStu = tempStuFee.getStudent();
        return new Stu_Stufee(
                tempStu.getId(),
                tempStu.getName(),
                tempStu.getFatherName(),
                tempStu.getMotherName(),
                tempStu.getPhoneNo(),
                tempStu.getAddress(),
                tempStu.getPrevSchool(),
                tempStu.getCast(),
                tempStu.getGender(),
                tempStu.getDob(),
                tempStu.getAadharNo(),
                tempStu.getStatus(),
                tempStu.getDateOfJoining(),
                tempStu.getImageData(),
                tempStu.getImageName(),
                tempStuFee.getId(),
                tempStuFee.getActualFee(),
                tempStuFee.getTransportFee(),
                tempStuFee.getBookFee(),
                tempStuFee.getTutionFee(),
                tempStuFee.getDiscount(),
                tempStuFee.getTotalFee(),
                tempStuFee.getStandard(),
                tempStuFee.getYear()
        );
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
    public Student insertStudentWithFee(HashMap<String, String> stuDetails, HashMap<String, String> feeDetails, MultipartFile file) {

        int feeId = 0;
        if(feeDetails.get("feeId") != null) {
            feeId = Integer.parseInt(feeDetails.get("feeId"));
        }

        String id = "0";
        if(stuDetails.get("id") != null) {
            id = stuDetails.get("id");
        }

        StudentFee stuFee = new StudentFee(
                feeId,
                Long.parseLong(feeDetails.get("actualFee")),
                Long.parseLong(feeDetails.get("transportFee")),
                Long.parseLong(feeDetails.get("bookFee")),
                Long.parseLong(feeDetails.get("tutionFee")),
                Long.parseLong(feeDetails.get("discount")),
                Long.parseLong(feeDetails.get("totalFee")), feeDetails.get("standard"),
                Year.now().getValue());


        Student stu = new Student(
                id,
                stuDetails.get("name"),
                stuDetails.get("fatherName"),
                stuDetails.get("motherName"),
                stuDetails.get("phoneNo"),
                stuDetails.get("address"),
                stuDetails.get("prevSchool"),
                stuDetails.get("cast"),
                stuDetails.get("gender"),
                stuDetails.get("dob"),
                stuDetails.get("aadharNo"),
                stuDetails.get("dateOfJoining")
        );

        return studentDAO.insertStudentWithFee(stu, stuFee, file);
    }

    @Override
    @Transactional
    public Student insertStudentSimpl(StudentFee studentFee, MultipartFile file) {
        return studentDAO.insertStudentPaymentSimpl(studentFee, file);
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
