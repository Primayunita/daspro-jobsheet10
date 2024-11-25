import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom; 
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            break; 
                        } else {
                            System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Baris atau kolom tidak valid, silakan masukkan lagi.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton:"); 
                for (int i = 0; i < penonton.length; i++) { 
                    for (int j = 0; j < penonton[i].length; j++) { 
                        if (penonton[i][j] == null) { 
                            System.out.print("***\t");
                         } else {
                             System.out.print(penonton[i][j] + "\t");
                             } 
                            } 
                            System.out.println(); 
                            } 
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}