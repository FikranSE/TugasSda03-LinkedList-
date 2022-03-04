import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        LinkedList<String> nama = new LinkedList<String>();
        LinkedList<Integer> nim = new LinkedList<Integer>();
        LinkedList<String> alamat = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("ADD   :");
        nim.add(2111521024);
        nim.add(2111521001);
        nim.add(2111521002);
        nama.add("Fikran ");
        nama.add("Shadiq ");
        nama.add("Elyafit ");
        alamat.add("Painan");
        alamat.add("Padang");
        alamat.add("Jl.Pisang");
        System.out.print(nim);
        System.out.print(nama);
        System.out.println(alamat);
        System.out.println("SIZE nama   :"+nim.size());
        System.out.println("SIZE nim    :"+nama.size());
        System.out.println("SIZE alamat :"+alamat.size());
        System.out.println("\n");
        System.out.println("\n");
        
        System.out.print("SET   :");
        nim.set(0,1900521024);
        nama.set(0,"Farhan");
        alamat.set(0,"Padang");
        System.out.print(nim);
        System.out.print(nama);
        System.out.println(alamat);
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("isEmpty   :");
        System.out.println("Nama is empty ?   :"+nim.isEmpty());
        System.out.println("Nim is empty ?    :"+nama.isEmpty());
        System.out.println("Alamat is empty ? :"+alamat.isEmpty());
        System.out.println("\n");
        System.out.println("\n");

        System.out.print("PUSH   :");
        nama.push("Elemen Baru");
        nim.push(000);
        alamat.push("Alamat Baru");
        System.out.println(nim);
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("POP   :");
        nama.pop();
        nim.pop();
        alamat.pop();
        System.out.println(nim);
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("REMOVE   :");
        nama.remove();
        nim.remove();
        alamat.remove();
        System.out.println(nim);
        System.out.println(nama);
        System.out.println(alamat);
        
    }
}
