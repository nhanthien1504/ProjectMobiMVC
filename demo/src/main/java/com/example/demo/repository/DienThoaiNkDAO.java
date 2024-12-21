package com.example.demo.repository;
import com.example.demo.model.DienThoaiNk;
import java.util.List;

public interface DienThoaiNkDAO {
    // Tạo mới điện thoại nhập khẩu
    void saveDienThoaiNk(DienThoaiNk dienThoaiNk);

    // Tìm điện thoại nhập khẩu theo mã
    DienThoaiNk findById(String maSp);

    // Lấy tất cả điện thoại nhập khẩu
    List<DienThoaiNk> findAll();

    // Cập nhật thông tin điện thoại nhập khẩu
    void updateDienThoaiNk(DienThoaiNk dienThoaiNk);

    // Xóa điện thoại nhập khẩu theo mã
    void deleteDienThoaiNk(String maSp);
}
