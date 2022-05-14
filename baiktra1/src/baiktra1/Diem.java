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
public class Diem implements Serializable {
    private double diem1;
    private double diem2;
    private double diem3;
    private double DTB;
    public static Scanner sc = new Scanner(System.in);
    
    public Diem(){
        
    }
    
    public Diem(double diem1,double diem2,double diem3){
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
        
    }
    
    public void setDiem1 (double diem1){
        this.diem1=diem1;
    }
    public double getDiem1(){
        return diem1;
    }
    
    public void setDiem2 (double diem2){
        this.diem2=diem2;
    }
    
    public double getDiem2(){
        return diem2;
    }
    
    public void setDiem3 (double diem3){
        this.diem3=diem3;
    }
    public double getDiem3(){
        return diem3;
    }
    
    public double getDTB(){
        return (diem1+diem2+diem3)/3;
    }
    
    public void nhap(){
        System.out.println("Nhap diem mon thu nhat:");
        diem1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem mon thu hai:");
        diem2 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem mon thu ba:");
        diem3 = Double.parseDouble(sc.nextLine());
    }
    
    
}
