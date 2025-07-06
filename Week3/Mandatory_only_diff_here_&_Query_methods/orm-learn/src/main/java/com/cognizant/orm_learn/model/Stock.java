package com.cognizant.orm_learn.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stId;
    private String stCode;
    private LocalDate stDate;
    private BigDecimal stOpen;
    private BigDecimal stClose;
    private long stVolume;
    public int getStId() {
        return stId;
    }
    public void setStId(int stId) {
        this.stId = stId;
    }
    public String getStCode() {
        return stCode;
    }
    public void setStCode(String stCode) {
        this.stCode = stCode;
    }
    public LocalDate getStDate() {
        return stDate;
    }
    public void setStDate(LocalDate stDate) {
        this.stDate = stDate;
    }
    public BigDecimal getStOpen() {
        return stOpen;
    }
    public void setStOpen(BigDecimal stOpen) {
        this.stOpen = stOpen;
    }
    public BigDecimal getStClose() {
        return stClose;
    }
    public void setStClose(BigDecimal stClose) {
        this.stClose = stClose;
    }
    public long getStVolume() {
        return stVolume;
    }
   public void setStVolume(long stVolume) {
        this.stVolume = stVolume;
    }
}
