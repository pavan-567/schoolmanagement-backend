package com.school.managementsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class StudentPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "total_fee")
    private long totalFee;

    @Column(name = "standard")
    private String standard;

    @Column(name = "discount")
    private long discount;

    @Column(name = "date_of_payment")
    private LocalDateTime dateOfPayment = LocalDateTime.now();

    @Column(name = "paid_fee")
    private long paidFee;

    public StudentPayment(long totalFee, String standard, long discount, long paidFee) {
        System.out.println("INSIDE CONSTRUCTOR");
        this.totalFee = totalFee;
        this.standard = standard;
        this.discount = discount;
        this.dateOfPayment = LocalDateTime.now();
        this.paidFee = paidFee;
    }

    public StudentPayment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public long getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(long paidFee) {
        this.paidFee = paidFee;
    }

    @Override
    public String toString() {
        return "StudentPayment{" +
                "id=" + id +
                ", totalFee=" + totalFee +
                ", standard=" + standard +
                ", discount=" + discount +
                ", dateOfPayment=" + dateOfPayment +
                ", paidFee=" + paidFee +
                '}';
    }
}

