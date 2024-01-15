import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kapasitasLantai1 = 2000;
        int kapasitasLantai2 = 1800;
        int kapasitasLantai3 = 1500;

        int mobilCountLantai1 = 0;
        int mobilCountLantai2 = 0;
        int mobilCountLantai3 = 0;

        while (true) {
            System.out.println("Masukkan kapasitas mesin kendaraan (cc): ");
            int kapasitasMesin = scanner.nextInt();

            if (kapasitasMesin >= 1000 && kapasitasMesin <= 1200) {
                if (kapasitasLantai3 >= 0) {
                    kapasitasLantai3 -= kapasitasMesin;
                    mobilCountLantai3++;
                    System.out.println("Kendaraan ditempatkan di Lantai 3.");
                } else {
                    System.out.println("Maaf, lantai 3 penuh.");
                }
            } else if (kapasitasMesin >= 1500 && kapasitasMesin <= 2000) {
                if (kapasitasLantai2 >= 0) {
                    kapasitasLantai2 -= kapasitasMesin;
                    mobilCountLantai2++;
                    System.out.println("Kendaraan ditempatkan di Lantai 2.");
                } else {
                    System.out.println("Maaf, lantai 2 penuh.");
                }
            } else if (kapasitasMesin > 2000) {
                if (kapasitasLantai1 >= 0) {
                    kapasitasLantai1 -= kapasitasMesin;
                    mobilCountLantai1++;
                    System.out.println("Kendaraan ditempatkan di Lantai 1.");
                } else {
                    System.out.println("Maaf, lantai 1 penuh.");
                }
            } else {
                System.out.println("Kendaraan tidak memenuhi kriteria.");
            }

            System.out.println("Jumlah Kendaraan di Lantai 1: " + mobilCountLantai1);
            System.out.println("Jumlah Kendaraan di Lantai 2: " + mobilCountLantai2);
            System.out.println("Jumlah Kendaraan di Lantai 3: " + mobilCountLantai3);
        }
    }
}