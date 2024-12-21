package com.example.demo.service;

import com.example.demo.config.DatabaseConfig;
import com.example.demo.model.DienThoaiAndroid;
import com.example.demo.repository.DienThoaiAndroidDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DienThoaiAndroidDAOImpl implements DienThoaiAndroidDAO {

    @Override
    public void saveDienThoaiAndroid(DienThoaiAndroid dienThoaiAndroid) {
        String sql = "INSERT INTO DienThoaiAndroid (maSp, tenSp, hangSx, ram, boNhoTrong, giaNhap, giaBan) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, dienThoaiAndroid.getMaSp());
            stmt.setString(2, dienThoaiAndroid.getTenSp());
            stmt.setString(3, dienThoaiAndroid.getHangSx());
            stmt.setInt(4, dienThoaiAndroid.getRam());
            stmt.setInt(5, dienThoaiAndroid.getBoNhoTrong());
            stmt.setDouble(6, dienThoaiAndroid.getGiaNhap());
            stmt.setDouble(7, dienThoaiAndroid.getGiaBan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public DienThoaiAndroid findById(String maSp) {
        String sql = "SELECT * FROM DienThoaiAndroid WHERE maSp = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, maSp);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new DienThoaiAndroid(
                        rs.getString("maSp"),
                        rs.getString("tenSp"),
                        rs.getString("hangSx"),
                        rs.getInt("ram"),
                        rs.getInt("boNhoTrong"),
                        rs.getDouble("giaNhap"),
                        rs.getDouble("giaBan")
                );
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<DienThoaiAndroid> findAll() {
        String sql = "SELECT * FROM DienThoaiAndroid";
        try (Connection connection = DatabaseConfig.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            List<DienThoaiAndroid> dienThoaiList = new ArrayList<>();
            while (rs.next()) {
                dienThoaiList.add(new DienThoaiAndroid(
                        rs.getString("maSp"),
                        rs.getString("tenSp"),
                        rs.getString("hangSx"),
                        rs.getInt("ram"),
                        rs.getInt("boNhoTrong"),
                        rs.getDouble("giaNhap"),
                        rs.getDouble("giaBan")
                ));
            }
            return dienThoaiList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateDienThoaiAndroid(DienThoaiAndroid dienThoaiAndroid) {
        String sql = "UPDATE DienThoaiAndroid SET tenSp = ?, hangSx = ?, ram = ?, boNhoTrong = ?, giaNhap = ?, giaBan = ? WHERE maSp = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, dienThoaiAndroid.getTenSp());
            stmt.setString(2, dienThoaiAndroid.getHangSx());
            stmt.setInt(3, dienThoaiAndroid.getRam());
            stmt.setInt(4, dienThoaiAndroid.getBoNhoTrong());
            stmt.setDouble(5, dienThoaiAndroid.getGiaNhap());
            stmt.setDouble(6, dienThoaiAndroid.getGiaBan());
            stmt.setString(7, dienThoaiAndroid.getMaSp());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteDienThoaiAndroid(String maSp) {
        String sql = "DELETE FROM DienThoaiAndroid WHERE maSp = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, maSp);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

