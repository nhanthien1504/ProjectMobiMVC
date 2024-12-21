package com.example.demo.repository;

import com.example.demo.model.DienThoaiIos;

import java.util.List;

public interface DienThoaiIosDAO {
    // Tạo mới điện thoại iOS
    void saveDienThoaiIos(DienThoaiIos dienThoaiIos);

    // Tìm điện thoại iOS theo mã
    DienThoaiIos findById(String maSp);

    // Lấy tất cả điện thoại iOS
    List<DienThoaiIos> findAll();

    // Cập nhật thông tin điện thoại iOS
    void updateDienThoaiIos(DienThoaiIos dienThoaiIos);

    // Xóa điện thoại iOS theo mã
    void deleteDienThoaiIos(String maSp);
}

