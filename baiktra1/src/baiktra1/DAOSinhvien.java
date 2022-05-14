/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiktra1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author manht
 */
public class DAOSinhvien {
   

    public void writeData(ArrayList<SinhVien> listSV) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Data.dat");
            oos = new ObjectOutputStream(fos);
            // create student
            
            // write student
            oos.writeObject(listSV);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
    }  
    public static ArrayList<SinhVien> readData() throws IOException, ClassNotFoundException{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        try {
            fis = new FileInputStream("Data.dat");
            ois = new ObjectInputStream(fis);

            dsSV = (ArrayList<SinhVien>) ois.readObject();

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
        return dsSV;
    }

   
      
    
}
