/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiktra1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class QLSV {
    static ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
    static int chon ;
    public static Scanner sc = new Scanner(System.in);
    public static DAOSinhvien dao = new DAOSinhvien();
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        do{
        System.out.println("1.Nhập thông tin sinh viên và lưu xuống tệp");
        System.out.println("2.Đọc dữ liệu từ tệp và hiển thị");
        System.out.println("3.Tìm kiếm và hiển thị tất cả sinh viên có DTB >=5.0");
        System.out.println("Lựa chọn");
        chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                  SinhVien sv = new SinhVien();
                  sv.nhap();
                  listSV.add(sv);
                  dao.writeData(listSV);        
                break;
                 case 2:
                  for(var obj : dao.readData()){    
                    System.out.println(obj);
                   } 
                break;
                case 3:
                 System.out.println("DS sinh viên có DTB >=5.0");
                    for(var obj : dao.readData()){
                        if(obj.diem.getDTB() >= 5.0){
                            System.out.println(obj);
                        }
                     } 
                break;     
            }
        }while (chon !=0);
    }
}
