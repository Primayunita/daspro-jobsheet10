import java.util.Scanner;

public class Survey16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] surveyResults = new int[10][6];
        int totalKeseluruhan = 0;

        System.out.println("Masukkan hasil survei (nilai 1-5):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                surveyResults[i][j] = scanner.nextInt();
                totalKeseluruhan += surveyResults[i][j]; 
            }
        }

        System.out.println("\nRata-rata nilai per responden:");
        for (int i = 0; i < 10; i++) {
            int totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += surveyResults[i][j];
            }
            System.out.printf("Responden ke-%d: %.2f%n", (i + 1), totalResponden / 6.0);
        }

        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += surveyResults[i][j];
            }
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), totalPertanyaan / 10.0);
        }

        double rataRataKeseluruhan = totalKeseluruhan / 60.0; 
        System.out.printf("\nRata-rata keseluruhan: %.2f%n", rataRataKeseluruhan);

        scanner.close();
    }
}

