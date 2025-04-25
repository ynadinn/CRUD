package main.java.TugasPemdas2.PEMDAS.semester2;

import controller.TugasController;
import java.util.Scanner;

public class TugasView {
    private TugasController controller = new TugasController();
    private Scanner input = new Scanner(System.in);

    public void menu() {
        int pilih;
        do {
            System.out.println("=== To-Do List ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Tandai Selesai");
            System.out.println("4. Hapus Tugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Deskripsi: ");
                    String deskripsi = input.nextLine();
                    controller.tambahTugas(judul, deskripsi);
                }
                case 2 -> controller.tampilkan();
                case 3 -> {
                    System.out.print("ID tugas: ");
                    int id = input.nextInt();
                    controller.tandaiSelesai(id);
                }
                case 4 -> {
                    System.out.print("ID tugas: ");
                    int id = input.nextInt();
                    controller.hapusTugas(id);
                }
                case 0 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}
