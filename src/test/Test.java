package test;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri hang a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap gia tri hang b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap gia tri cot c: ");
        int c = scanner.nextInt();
        int [][][]B = new int[a][b][c];
        for (int d = 0; d < B.length; d++) {
            for (int e = 0; e < B[d].length; e++) {
                for (int f = 0; f < B[d][e].length; f++) {
                    B[d][e][f]= f;
                }
            }
        }

    }
}
