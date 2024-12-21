package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIENTHOAI_NK")
public class DienThoaiNk {

    @Id
    private String maSp;

    private String nuocSx;

    private Double thueNk;

    @ManyToOne
    @JoinColumn(name = "maSp", referencedColumnName = "maSp", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "FK_DIENTHOAI_NK"))
    private DienThoai dienThoai;

    // Getters and Setters
    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getNuocSx() {
        return nuocSx;
    }

    public void setNuocSx(String nuocSx) {
        this.nuocSx = nuocSx;
    }

    public Double getThueNk() {
        return thueNk;
    }

    public void setThueNk(Double thueNk) {
        this.thueNk = thueNk;
    }

    public DienThoai getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(DienThoai dienThoai) {
        this.dienThoai = dienThoai;
    }
}
