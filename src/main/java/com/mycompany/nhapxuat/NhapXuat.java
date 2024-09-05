
package com.mycompany.nhapxuat;

import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] args) {
        // Khai báo hằng số số lượng số cần nhập
        final int SO_LUONG_SO = 5;

        // Khai báo biến để lưu tổng và giá trị trung bình
        int tong = 0;
        double trungBinh;

        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập 5 số nguyên và tính tổng
        System.out.println("Nhap " + SO_LUONG_SO + " so nguyen:");
        for (int i = 0; i < SO_LUONG_SO; i++) {
            System.out.print("So Thu " + (i + 1) + ": ");
            int so = scanner.nextInt();
            tong += so;
        }

        // Tính giá trị trung bình
        trungBinh = (double) tong / SO_LUONG_SO;

        // In kết quả
        System.out.println("Gia tri trung binh la: " + trungBinh);

        scanner.close();
    }
}

