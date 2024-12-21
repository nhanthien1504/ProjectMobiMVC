package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIENTHOAI_ANDROID")
public class DienThoaiAndroid {
    @Id
    private String maSp;
    private String hangSx;
    private int ram;
    private int rom;
    private String tenSp;  // Tên sản phẩm

    private int boNhoTrong;
    private double giaNhap;
    private double giaBan;

    // Constructor không tham số
    public DienThoaiAndroid() {
    }

    // Constructor có tham số để khởi tạo đối tượng
    public DienThoaiAndroid(String maSp, String hangSx, int ram, int rom, String tenSp) {
        this.maSp = maSp;
        this.hangSx = hangSx;
        this.ram = ram;
        this.rom = rom;
        this.tenSp = tenSp;
    }

    public DienThoaiAndroid(String maSp, String tenSp, String hangSx, int ram, int boNhoTrong, double giaNhap, double giaBan) {
        this.maSp = maSp;  // Gán giá trị cho maSp
        this.tenSp = tenSp;  // Gán giá trị cho tenSp
        this.hangSx = hangSx;  // Gán giá trị cho hangSx
        this.ram = ram;  // Gán giá trị cho ram
        this.boNhoTrong = boNhoTrong;  // Gán giá trị cho boNhoTrong
        this.giaNhap = giaNhap;  // Gán giá trị cho giaNhap
        this.giaBan = giaBan;  // Gán giá trị cho giaBan
    }

    public int getBoNhoTrong() {
        return boNhoTrong;
    }

    public void setBoNhoTrong(int boNhoTrong) {
        this.boNhoTrong = boNhoTrong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    // Getter và Setter cho các thuộc tính

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
}