
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kasir {
	String nama;
	String id;
	int harga,total,uang,kembalian;
	String[]strukNama = new String[20];
	String[]strukMeja = new String[20];
	int[]strukHarga = new int[20];
	int[]strukJumlah = new int[20];
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
	
public void cetakStruk(Kasir kasir1 ,Pelanggan p1) {
		
		try{
			   File data = new File("struk.txt");
			   PrintWriter pr = new PrintWriter(new FileWriter(data,false));
			   
			  System.out.println("==========================================");
			  System.out.println("\t     RESTORAN GATAU");
			  System.out.println("==========================================");
			  System.out.println("Nama Kasir\t: "+getNamaKasir(nama));
			  System.out.println("ID Kasir\t: "+getIdKasir(id));
			  System.out.println("==========================================");
			  System.out.println("Nama\t\t: "+p1.nama);
			  System.out.println("Nomor Meja\t: " +kasir1.strukMeja[0]);
			  System.out.println("==========================================");
			  System.out.println("\nDaftar Pesanan : " );	   
				for ( int i=0 ; i<p1.j ; i++) {
					System.out.println(i+1+". "+ kasir1.strukNama[i] +" x "+ kasir1.strukJumlah[i]+"  Rp."+ kasir1.strukHarga[i]);
				};
			  System.out.println("\nTotal Harga \t: Rp." + kasir1.total );
			  System.out.println("\nUang Anda \t: Rp." + kasir1.uang );
			   if (kembalian >0) {
			  System.out.println("\nKembalian \t: Rp." + kasir1.kembalian );
			   }
			  System.out.println("==========================================");
			  System.out.println("\t     TERIMA KASIH !");
			  System.out.println("==========================================");
			  System.out.println("\tStruk Berhasil di Cetak!");
			   
			  }catch(Exception e) 
			  {
			   System.out.println("\tData Error, Struk Tidak Dapat Dicetak");
			  }
	}
	
	public void rincianBayar(Kasir kasir1, Pelanggan p1) {
		System.out.println("\n============================================================================");
		System.out.println("|No.| Rincian Pesanan \t\t|  Jumlah  |\t |  Harga  |\t |  Total  |");
		System.out.println("============================================================================");
		for ( int i=0 ; i<p1.j ; i++) {
			System.out.println("| "+(i+1)+" |"+ kasir1.strukNama[i] +"\t| "+"   x "+ kasir1.strukJumlah[i] +"  |\t |"+"Rp."+ kasir1.strukHarga[i]+" |\t |"+"Rp."+kasir1.strukHarga[i]*kasir1.strukJumlah[i] + " |");
			harga =kasir1.strukHarga[i]*kasir1.strukJumlah[i];
			total+=harga;
		};
		System.out.println("============================================================================");
	}
	
	public void pembayaran() {
		System.out.println("\n\n====================================");
		System.out.println("\tRINCIAN PEMBAYARAN \n");
		System.out.println("Total harga         : Rp." + total + "\n");
		System.out.print("Masukan jumlah uang : Rp.");	
		uang = input.nextInt();
		System.out.println("=====================================");
		kembalian = uang-total;
		if (uang < total) {
			System.out.println("Uang anda kurang !, Silahkan masukan sesuai total");
			pembayaran();
		}
		else if (uang == total) {
			System.out.println("\tPembayaran sukses!\n");
		}
		else {
			System.out.print("\tPembayaran sukses!\n");
			System.out.println("Total harga : Rp."+total);
			System.out.println("Uang Anda   : Rp."+uang);
			System.out.println("kembalian   : Rp."+kembalian);
			System.out.println("\n");
		}
		
	}
	
}
