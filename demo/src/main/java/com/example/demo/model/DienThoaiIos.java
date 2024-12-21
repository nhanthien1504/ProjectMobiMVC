package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIENTHOAI_IOS")
public class DienThoaiIos {

    @Id
    private String maSp;

    private String tenSp;

    private String phienBanOs;

    private int rom;

    @ManyToOne
    @JoinColumn(name = "maSp", referencedColumnName = "maSp", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "FK_DIENTHOAI_IOS"))
    private DienThoai dienThoai;

    // Getters and Setters
    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getPhienBanOs() {
        return phienBanOs;
    }

    public void setPhienBanOs(String phienBanOs) {
        this.phienBanOs = phienBanOs;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public DienThoai getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(DienThoai dienThoai) {
        this.dienThoai = dienThoai;
    }
}

