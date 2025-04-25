package main.java.TugasPemdas2.PEMDAS.semester2;

import java.util.ArrayList;
import model.Tugas;

public class TugasController {
    private ArrayList<Tugas> list = new ArrayList<>();
    private int idCounter = 1;

    public void tambahTugas(String judul, String deskripsi) {
        list.add(new Tugas(idCounter++, judul, deskripsi));
    }

    public void tampilkan() {
        for (Tugas t : list) {
            System.out.println("ID: " + t.getId());
            System.out.println("Judul: " + t.getJudul());
            System.out.println("Deskripsi: " + t.getDeskripsi());
            System.out.println("Status: " + (t.isSelesai() ? "Selesai" : "Belum selesai"));
            System.out.println("---------------------------------");
        }
    }

    public void tandaiSelesai(int id) {
        for (Tugas t : list) {
            if (t.getId() == id) {
                t.setSelesai(true);
                return;
            }
        }
        System.out.println("Tugas tidak ditemukan.");
    }

    public void hapusTugas(int id) {
        list.removeIf(t -> t.getId() == id);
    }
}
