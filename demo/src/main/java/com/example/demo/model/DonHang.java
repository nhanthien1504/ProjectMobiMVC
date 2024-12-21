package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DONHANG")
public class DonHang {

    @Id
    private String maDh;

    private String maKh;

    private String maSp;

    private String ngayMua;

    private int soLuong;

    @ManyToOne
    private KhachHang khachHang;

    @ManyToOne
    private DienThoai dienThoai;

    // Getters and Setters
    public String getMaDh() {
        return maDh;
    }

    public void setMaDh(String maDh) {
        this.maDh = maDh;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DienThoai getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(DienThoai dienThoai) {
        this.dienThoai = dienThoai;
    }
}
