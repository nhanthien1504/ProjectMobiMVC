package com.example.demo.repository;

import com.example.demo.model.DienThoaiAndroid;

import java.util.List;
public interface DienThoaiAndroidDAO {
    // Tạo mới điện thoại Android
    void saveDienThoaiAndroid(DienThoaiAndroid dienThoaiAndroid);

    // Tìm điện thoại Android theo mã
    DienThoaiAndroid findById(String maSp);

    // Lấy tất cả điện thoại Android
    List<DienThoaiAndroid> findAll();


    // Cập nhật thông tin điện thoại Android
    void updateDienThoaiAndroid(DienThoaiAndroid dienThoaiAndroid);

    // Xóa điện thoại Android theo mã
    void deleteDienThoaiAndroid(String maSp);
}

