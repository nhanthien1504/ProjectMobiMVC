package com.example.demo.repository;

import com.example.demo.model.DienThoai;

import java.util.List;

public interface DienThoaiDAO {
    // Tạo mới điện thoại
    void saveDienThoai(DienThoai dienThoai);

    // Tìm điện thoại theo mã
    DienThoai findById(String maSp);

    // Lấy tất cả điện thoại
    List<DienThoai> findAll();

    // Cập nhật thông tin điện thoại
    void updateDienThoai(DienThoai dienThoai);

    // Xóa điện thoại theo mã
    void deleteDienThoai(String maSp);

    // Tìm tên điện thoại có số lượng đã bán nhiều nhất
    String findMostSoldPhone();

    // Tìm tên điện thoại đã bán với tổng số tiền bán lớn nhất trong năm
    String findPhoneWithHighestSalesInYear(int year);
}
