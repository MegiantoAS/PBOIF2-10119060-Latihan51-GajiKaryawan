/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Gaji Karyawan
 */
public class PBOIF210119060Latihan51GajiKaryawan {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Manager objManager = new Manager();
        
        System.out.println("======Program Perhititungan Gaji Karyawan====");
        System.out.print("Masukan NIK               : ");objManager.setNik(input.nextLine());
        System.out.print("Masukan Nama              : ");objManager.setNama(input.nextLine());
        System.out.print("Masukan Golongan (1/2/3)   : ");objManager.setGolongan(input.nextInt());
        System.out.print("Masukan Jabatan (Manager/kabag) : ");objManager.setJabatan(input.next());
        System.out.print("Masukan Jumlah Kehadiran   :");objManager.setKehadiran(input.nextInt());
        System.out.println("");
    
               System.out.println("====Hasil Perhitungan=====");
               System.out.println("NIK : "+objManager.getNIK());
               System.out.println("NAMA : "+objManager.getNama());
               System.out.println("GOLONGAN : "+objManager.getGolongan());
               System.out.println("JABATAN : "+objManager.getJabatan());
               System.out.println("");
        
                    System.out.println("TUNJANGAN GOLONGAN : "+objManager.tunjanganGolongan(objManager.getGolongan()));
                    System.out.println("TUNJANGAN JABATAN  : "+objManager.tunjanganJabatan(objManager.getJabatan()));
                    System.out.println("TUNJANGAN KEHADIRAN : "+objManager.tunjanganKehadiran(objManager.getKehadiran()));
                    System.out.println("");
                    System.out.println("GAJI TOTAL : "+objManager.gajiTotal());
    }
    
}