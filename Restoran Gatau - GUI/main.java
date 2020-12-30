import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int pilihan;
		int lagi = 0;
		Scanner inputt = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Pelayan pel1 = new Pelayan();
		Koki koki1 = new Koki();
		Kasir kasir1= new Kasir();
		int status=0;
		System.out.println("=====================================");
		System.out.println("    SELAMAT DATANG DI RESTORAN ! ");
		System.out.println("=====================================");
		Pelanggan p1 = new Pelanggan();
		System.out.print("Nama Pengunjung : ");
		p1.nama = input.nextLine();
		System.out.print("Nomor Telepon   : ");
		p1.kontak = input.nextLine();
		
		
		do {
		pel1.delay();
		System.out.println("================MENU=================");
		System.out.println("1. Panggil Pelayan");
		System.out.println("2. Pilih Meja");
		System.out.println("3. Pilih Makanan / Minuman");
		System.out.println("4. Konfirmasi");
		System.out.println("5. Pembayaran");
		System.out.println("6. Exit");
		System.out.println("=====================================");
		pilihan = inputt.nextInt();
		try {
		if (pilihan==1) {
			System.out.println("=====================================");
			status = 1;
			Pelayan pelayan1 = new Pelayan();
			pel1.daftarPelayan();
			p1.pilihPelayan(pel1);
			System.out.println("=====================================");
		}
		else if (pilihan ==2 && status == 1 ) {
			System.out.println("=====================================");
			Meja meja1 = new Meja();
			status = 2;
			meja1.daftarMeja();
			p1.pilihMeja(kasir1,meja1);
			System.out.println("=====================================");
		}
		else if (pilihan ==3 && status ==2) {
			System.out.println("=====================================");
			status = 3;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		status = 3;
			while(lagi != 2){
			Menu menu = new Menu();
			menu.panggilMenu();
			System.out.println("===========================================");
			p1.pilihMenu(kasir1, menu);
			p1.pesanan(kasir1);
			System.out.println("===========================================");
			System.out.println("Pesan Lagi?");
			System.out.println("1. YA");
			System.out.println("2. TIDAK");
			System.out.print("Masukan Pilihan :");
			lagi = input.nextInt();
			System.out.println("===========================================");
			}
		}
		else if (pilihan ==4 && status == 3 ) {
			System.out.println("=====================================");
			status=4;
			pel1.terimaPesanan(p1,kasir1);
			p1.menungguPesanan();
			pel1.delay();
			pel1.laporMenu();
			pel1.delay();
			koki1.memasakMakanan(p1,kasir1);
			System.out.println("=====================================");
			pel1.delayMasak();
			koki1.pesananSiap();//delay
			
			System.out.println("=====================================");
		}		
		else if (pilihan ==5 && status == 4 ) {
			System.out.println("=====================================");
			status=5;
			kasir1.setKasir("Maya", "021");
			kasir1.rincianBayar(kasir1,p1);
			kasir1.pembayaran();
			kasir1.cetakStruk(kasir1,p1);
			
			System.out.println("==========================================");
			break;
		}		
		else if(pilihan == 6) {
		System.in.close();
		}
		else {
			System.out.println("Lakukan secara berurut!");
		}
		}
		catch(Exception ex) {
			System.out.println("Silahkan Pilih sesuai nomor yang tersedia!");
		}
		}
		while (pilihan != 6);
}
}
