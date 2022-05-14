/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiktra1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class Nguoi implements Serializable {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    public static Scanner sc = new Scanner(System.in);
    
    public Nguoi(){
        
    }
    
    public Nguoi(String hoTen, int tuoi, String gioiTinh) {
        
         this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
   
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh=gioiTinh;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public void setTuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public int getTuoi(){
        return tuoi;
    }
    
    public void nhap(){
        System.out.println("Nhap ho ten sinh vien:");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh sinh vien:");
        gioiTinh = sc.nextLine();
    }
}
