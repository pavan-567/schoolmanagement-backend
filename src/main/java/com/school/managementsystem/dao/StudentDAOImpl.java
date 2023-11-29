package com.school.managementsystem.dao;

import com.school.managementsystem.entity.Master;
import com.school.managementsystem.entity.Student;
import com.school.managementsystem.entity.StudentFee;
import com.school.managementsystem.entity.StudentPayment;
import com.school.managementsystem.entity.model.Stu_Stufee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> listStudents() {
        return entityManager.createQuery("FROM Student", Student.class).getResultList();
    }

    @Override
    public Student insertStudent(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public Student getStudentById(int id) {
        Student foundStu = entityManager.find(Student.class, id);
        return foundStu;
    }

    @Override
    public Student insertStudentPayment(Student student, StudentPayment studentPayment) {
        student.add(studentPayment);
        entityManager.persist(student);
        return student;
    }

    @Override
    public Student insertStudentPaymentSimpl(StudentFee stuFee) {
        entityManager.merge(stuFee);
        return stuFee.getStudent();
    }

    @Override
    public List<Student> getStudentsByYearStandard(int year, String standard) {
        TypedQuery<Student> stu = entityManager.createQuery(
                "FROM Student s JOIN StudentFee sf ON s.id = sf.student.id WHERE sf.year =:year AND sf.standard =:standard", Student.class);
        stu.setParameter("year", year);
        stu.setParameter("standard", standard);
        List<Student> students = stu.getResultList();
        if (students == null || students.size() == 0)
            return null;
        return students;
    }


    @Override
    public StudentFee getStudentWithFeeById(int id) {
//        StudentFee s = entityManager.find(StudentFee.class, id);
//        System.out.println(s);
        TypedQuery<StudentFee> stuFee = entityManager.createQuery("FROM StudentFee sf WHERE sf.student.id = :id", StudentFee.class);
        stuFee.setParameter("id", id);

        if(stuFee.getResultList().size() == 0)
            return null;
        return stuFee.getSingleResult();
    }

    @Override
    public String deleteStudentById(int id) {
        TypedQuery<StudentFee> sfQuery = entityManager.createQuery("FROM StudentFee sf WHERE sf.student.id = :id", StudentFee.class);
        sfQuery.setParameter("id", id);

        StudentFee sf = sfQuery.getSingleResult();

        Student s = sf.getStudent();

        entityManager.remove(sf);
        return "Successfully Deleted!";
    }


    @Override
    public Master insertMasterDetails(Master master) {
        entityManager.merge(master);
        return master;
    }

    @Override
    public List<Master> getMasterDetails() {
        return entityManager.createQuery("FROM Master m ORDER BY m.id DESC", Master.class).getResultList();
    }
}
