package com.school.managementsystem.entity.model;

import com.school.managementsystem.entity.StudentFee;

import java.time.LocalDate;

public class Stu_Stufee {
    private int id;
    private String name;
    private String fatherName;
    private String motherName;
    private long phoneNo;
    private String address;
    private String prevSchool;
    private String cast;
    private String gender;
    private LocalDate dob;
    private String aadharNo;
    private int status;
    private LocalDate dateOfJoining;
    private byte[] imageData;

    private String imageName;

    private int feeId;
    private long actualFee;
    private long transportFee;
    private long bookFee;
    private long tutionFee;
    private long discount;
    private long totalFee;
    private String standard;
    private int year;

    public Stu_Stufee(int id, String name, String fatherName, String motherName, long phoneNo, String address, String prevSchool, String cast, String gender, LocalDate dob, String aadharNo, int status, LocalDate dateOfJoining, byte[] imageData, String imageName,int fee_id, long actualFee, long transportFee, long bookFee, long tutionFee, long discount, long totalFee, String standard, int year) {
        this.id = id;
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
        this.imageData = imageData;
        this.imageName = imageName;
        this.actualFee = actualFee;
        this.transportFee = transportFee;
        this.bookFee = bookFee;
        this.tutionFee = tutionFee;
        this.discount = discount;
        this.totalFee = totalFee;
        this.standard = standard;
        this.year = year;
        this.feeId = fee_id;
    }


    public Stu_Stufee(int id, String name, String fatherName, String motherName, long phoneNo, String address, String prevSchool, String cast, String gender, LocalDate dob, String aadharNo, int status, LocalDate dateOfJoining, byte[] imageData, String imageName) {
        this.id = id;
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
        this.imageData = imageData;
        this.imageName = imageName;
    }

    public Stu_Stufee(int fee_id, long actualFee, long transportFee, long bookFee, long tutionFee, long discount, long totalFee, String standard, int year) {
        this.feeId = fee_id;
        this.actualFee = actualFee;
        this.transportFee = transportFee;
        this.bookFee = bookFee;
        this.tutionFee = tutionFee;
        this.discount = discount;
        this.totalFee = totalFee;
        this.standard = standard;
        this.year = year;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Stu_Stufee() {}

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

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
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


    public int getFeeId() {
        return feeId;
    }

    public void setFeeId(int feeId) {
        this.feeId = feeId;
    }

    public long getActualFee() {
        return actualFee;
    }

    public void setActualFee(long actualFee) {
        this.actualFee = actualFee;
    }

    public long getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(long transportFee) {
        this.transportFee = transportFee;
    }

    public long getBookFee() {
        return bookFee;
    }

    public void setBookFee(long bookFee) {
        this.bookFee = bookFee;
    }

    public long getTutionFee() {
        return tutionFee;
    }

    public void setTutionFee(long tutionFee) {
        this.tutionFee = tutionFee;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(long totalFee) {
        this.totalFee = totalFee;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Stu_Stufee{" +
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
                ", fee_id=" + feeId +
                ", actualFee=" + actualFee +
                ", transportFee=" + transportFee +
                ", bookFee=" + bookFee +
                ", tutionFee=" + tutionFee +
                ", discount=" + discount +
                ", totalFee=" + totalFee +
                ", standard='" + standard + '\'' +
                ", year=" + year +
                '}';
    }
}
