package com.example.demo.repository;

import com.example.demo.model.KhachHang;

import java.util.List;

public interface KhachHangDAO {
    // Tạo mới khách hàng
    void saveKhachHang(KhachHang khachHang);

    // Tìm khách hàng theo mã
    KhachHang findById(String maKh);

    // Lấy tất cả khách hàng
    List<KhachHang> findAll();

    // Cập nhật thông tin khách hàng
    void updateKhachHang(KhachHang khachHang);

    // Xóa khách hàng theo mã
    void deleteKhachHang(String maKh);

    // Tìm khách hàng đã mua nhiều sản phẩm nhất
    KhachHang findKhachHangWithMostProducts();

    // Tìm khách hàng có tổng giá trị mua hàng lớn nhất trong năm
    KhachHang findKhachHangWithHighestPurchaseInYear(int year);
}

