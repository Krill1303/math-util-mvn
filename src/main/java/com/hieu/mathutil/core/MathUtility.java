package com.hieu.mathutil.core;

import java.awt.BorderLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguye
 */
//chua các hàm statíc dùng chung cho m?i noi
//khi nào dùng static? khi ta làm các hàm chi xu lý xong ròi return 
//ko can luu tru lai thong tin vao instance variable-dac tinh cua object
public class MathUtility {

    public static final double PI = 3.14;

//    public static long getFactorial(int n) {
//        //ham tinh n!=1,2,3,...n
//        //ko tinh dc giai thua so am
//        // quy uoc 0! la 1
//        //vi giai thua tang rat nhanh kieu long chua ko noi(vuot 18 so 0)
//        //do do' ham` getF() chi co n=0-20
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException();
//        
//
//        if (n == 0 || n == 1) 
//            return 1;
//        
//
//        long result = 1; //n>=2-<=20
//        
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//
//        return result;
//    }
    //5!=1.2.3.4.5
    //5!=      4!.5=5.4!
    //4!=1.2.3.4
    //4!=   3!.4=4.3!
    //ĐỆ QUY -RECURSION
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException();
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);

        //tối ưu code,thay đổi ruột của ái hàm để chạy ngon hơn
        //nhanh hơn,hoặc code viết đẹp hơn
        //DÙ BẠN SỬA CODE VÌ LÍ DO GÌ ,THÌ CODE PHẢI ĐC TEST LẠI 
        //VÀ TEST LẠI ĐỂ ĐẢM BẢO RẰNG NÓ VẪN XANH
        //NẾU TA VIẾT CODE ĐI KÈM CÁI TEST SCRIPT THÌ VIỆC TEST LẠI CÁI HÀM SẼ CỰC NHANH 
        //KO CẦN MẮT ĐỂ DÒ TỪNG DÒNG LỆNH ĐÚNG SAI,MÀ CHỈ CẦN NHÌN MÀU XANH LÀ ĐÚNG
        //VÌ HÀM TRẢ VỀ NHƯ EXPECTED
        //TEST LẠI NHỮNG GÌ ĐÃ TỪNG TEST -> REGRESSION TEST 
        //                                  KIỂM THỬ HỒI QUY
        //KIỂM THỬ LẠI HÀM NÀY CỰC NHANH,VÌ GITHUB ACTION LO GIÙM 
        //TA CHỈ CẦN MÀU XANH,HOẶC NHẬN MAIL CHỬI VÌ CODE ĐỎ 
    }
}
