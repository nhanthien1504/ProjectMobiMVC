package com.example.demo.repository;

import com.example.demo.model.DonHang;

import java.util.List;

public interface DonHangDAO {
    // Tạo đơn hàng mới
    void saveDonHang(DonHang donHang);

    // Tìm đơn hàng theo mã
    DonHang findById(String maDh);

    // Lấy tất cả đơn hàng
    List<DonHang> findAll();

    // Cập nhật đơn hàng
    void updateDonHang(DonHang donHang);

    // Xóa đơn hàng theo mã
    void deleteDonHang(String maDh);

    // Tính tổng tiền của đơn hàng bao gồm VAT và khuyến mãi
    double calculateTotalOrderAmount(String maDh);
}
