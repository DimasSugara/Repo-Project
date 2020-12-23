import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kasir {
	String nama;
	String id;
	int harga,total,uang,kembalian;
	String[]strukNama = new String[6];
	String[]strukMeja = new String[1];
	int[]strukHarga = new int[6];
	int[]strukJumlah = new int[6];
	Scanner input = new Scanner(System.in);
	
	public void setKasir (String nama, String id) {
		this.nama= nama;
		this.id = id;
	};

	public String getNamaKasir(String nama) {
		return this.nama;
	}
	
	public String getIdKasir(String id) {
		return this.id;
	}
}