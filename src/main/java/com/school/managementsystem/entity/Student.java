package com.school.managementsystem.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

@Entity
@Table(name= "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name= "father_name")
    private String fatherName;

    @Column(name= "mother_name")
    private String motherName;

    @Column(name= "phone_no")
    private Long phoneNo;

    @Column(name= "address")
    private String address;

    @Column(name= "prev_school")
    private String prevSchool;

    @Column(name = "cast")
    private String cast;

    @Column(name= "gender")
    private String gender;

    @Column(name= "dob")
    private LocalDate dob;

    @Column(name= "aadhar_no")
    private String aadharNo;

    @Column(name= "status")
    private int status = 1;

    @Column(name= "date_of_joining")
    private LocalDate dateOfJoining;

    @Column(name= "image")
    private byte[] imageData;

    @Column(name= "image_name")
    private String imageName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name= "student_id")
    private List<StudentPayment> payments;


    public Student(String name, String fatherName, String motherName, String phoneNo, String address, String prevSchool, String cast, String gender, String dob, String aadharNo, String dateOfJoining) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.phoneNo = Long.parseLong(phoneNo);
        this.address = address;
        this.prevSchool = prevSchool;
        this.cast = cast;
        this.gender = gender;
        this.dob = LocalDate.parse(dob);
        this.aadharNo = aadharNo;
        this.dateOfJoining = LocalDate.parse(dateOfJoining);
    }

    public Student(String id, String name, String fatherName, String motherName, String phoneNo, String address, String prevSchool, String cast, String gender, String dob, String aadharNo, String dateOfJoining) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.phoneNo = Long.parseLong(phoneNo);
        this.address = address;
        this.prevSchool = prevSchool;
        this.cast = cast;
        this.gender = gender;
        this.dob = LocalDate.parse(dob);
        this.aadharNo = aadharNo;
        this.dateOfJoining = LocalDate.parse(dateOfJoining);
    }

    public Student(String name, String fatherName, String motherName, Long phoneNo, String address, String prevSchool, String cast, String gender, LocalDate dob, String aadharNo, int status, LocalDate dateOfJoining) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.prevSchool = prevSchool;
        this.cast = cast;
        this.gender = gender;
        this.dob = dob;
        this.aadharNo = aadharNo;
        this.status = status;
        this.dateOfJoining = dateOfJoining;
    }

    public Student() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrevSchool() {
        return prevSchool;
    }

    public void setPrevSchool(String prevSchool) {
        this.prevSchool = prevSchool;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public List<StudentPayment> getPayments() {
        return payments;
    }

    public void setPayments(List<StudentPayment> payments) {
        this.payments = payments;
    }


    // Convinience Methods
    public void add(StudentPayment payment) {
        if(payments == null)
            payments = new ArrayList<StudentPayment>();
        payments.add(payment);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", phoneNo=" + phoneNo +
                ", address='" + address + '\'' +
                ", prevSchool='" + prevSchool + '\'' +
                ", cast='" + cast + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", aadharNo='" + aadharNo + '\'' +
                ", status=" + status +
                ", dateOfJoining=" + dateOfJoining +
                ", imageName='" + imageName + '\'' +
                ", payments=" + payments +
                '}';
    }
}
