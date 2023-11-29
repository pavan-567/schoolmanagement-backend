package com.school.managementsystem.entity;

import jakarta.persistence.*;

import java.time.Year;

@Entity
@Table(name = "master")
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "standard")
    private String standard;

    @Column(name = "year")
    private int year = Year.now().getValue();

    @Column(name = "totalFee")
    private long totalFee;

    @Column(name = "bookFee")
    private long bookFee;

    @Column(name = "transport_fee")
    private long transportFee;

    @Column(name = "tution_fee")
    private long tutionFee;

    public Master(String standard, int year, long totalFee, long bookFee, long transportFee, long tutionFee) {
        this.standard = standard;
        this.year = year;
        this.totalFee = totalFee;
        this.bookFee = bookFee;
        this.transportFee = transportFee;
        this.tutionFee = tutionFee;
        this.year = Year.now().getValue();;
    }

    public Master() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(long totalFee) {
        this.totalFee = totalFee;
    }

    public long getBookFee() {
        return bookFee;
    }

    public void setBookFee(long bookFee) {
        this.bookFee = bookFee;
    }

    public long getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(long transportFee) {
        this.transportFee = transportFee;
    }

    public long getTutionFee() {
        return tutionFee;
    }

    public void setTutionFee(long tutionFee) {
        this.tutionFee = tutionFee;
    }

    @Override
    public String toString() {
        return "Master{" +
                "id=" + id +
                ", standard='" + standard + '\'' +
                ", year=" + year +
                ", totalFee=" + totalFee +
                ", bookFee=" + bookFee +
                ", transportFee=" + transportFee +
                ", tutionFee=" + tutionFee +
                '}';
    }
}
