package com.school.managementsystem.entity;

import jakarta.persistence.*;

import java.time.Year;

@Entity
@Table(name= "student_fee")
public class StudentFee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "actual_fee")
    private long actualFee;

    @Column(name= "transport_fee")
    private long transportFee;

    @Column(name= "book_fee")
    private long bookFee;

    @Column(name= "tution_fee")
    private long tutionFee;

    @Column(name = "discount")
    private long discount;

    @Column(name= "total_fee")
    private long totalFee;

    @Column(name= "standard")
    private String standard;

    @Column(name= "year")
    private int year = Year.now().getValue();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    public StudentFee() {}

    public StudentFee(long actualFee, long transportFee, long bookFee, long tutionFee, long discount, long totalFee, String standard, int year) {
        this.actualFee = actualFee;
        this.transportFee = transportFee;
        this.bookFee = bookFee;
        this.tutionFee = tutionFee;
        this.discount = discount;
        this.totalFee = totalFee;
        this.standard = standard;
        this.year = Year.now().getValue();
    }

    public StudentFee(int id, long actualFee, long transportFee, long bookFee, long tutionFee, long discount, long totalFee, String standard, int year) {
        this.id = id;
        this.actualFee = actualFee;
        this.transportFee = transportFee;
        this.bookFee = bookFee;
        this.tutionFee = tutionFee;
        this.discount = discount;
        this.totalFee = totalFee;
        this.standard = standard;
        this.year = Year.now().getValue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentFee{" +
                "id=" + id +
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
