/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiktra1;

import java.io.Serializable;

/**
 *
 * @author manht
 */
public class SinhVien extends Nguoi implements Serializable {
    private String masv;
    Diem diem =new Diem();

    public SinhVien(){
        
    }
    public SinhVien(String hoTen, int tuoi, String gioiTinh, String masv, Diem diem) {
        super(hoTen, tuoi, gioiTinh);
        this.masv = masv;
        this.diem=diem;
    }
    public void setMasv(String masv){
        this.masv=masv;
    }
    public String getMasv(){
        return masv;
    }
    public void nhap(){
        System.out.println("Nhap ma sinh vien:");
        masv = sc.nextLine();
        super.nhap();
        diem.nhap();   
    }
//    public static void inTieuDe(){
//        System.out.printf("%-15s %10s %10s %10s %10s %10s %10s %10s","Mã SV","Họ tên","Tuổi","Giới tính","Điểm 1","Điểm 2","Điểm 3","Điểm TB");
//    }
//    public void xuat(){
//        System.out.printf("%-15d %10s %10d %10s %10.2f %10.2f %10.2f %10.2f",masv,getHoTen(),getTuoi(),getGioiTinh(),diem.getDiem1(),diem.getDiem2(),diem.getDiem3(),diem.getDTB());
//        System.out.println("");
//    }
    
    @Override
    public String toString() {
        return "SinhVien{" + "Hoten= " + getHoTen() + ", Tuoi= " + getTuoi()+ ", Gioitinh= " + getGioiTinh() + ", MaSV= " + masv + ", Diem thu nhat= " + diem.getDiem1() + ", Diem thu hai= " + diem.getDiem2() + ", Diem thu ba= " + diem.getDiem3() + ", Diem TB= " + diem.getDTB() + '}';
    }
}
