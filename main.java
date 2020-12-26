import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int pilihan;
		Scanner inputt = new Scanner(System.in); 
		Scanner input = new Scanner(System.in);
		int status=0;
		System.out.println("=====================================");
		System.out.println("    SELAMAT DATANG DI RESTORAN ! ");
		System.out.println("=====================================");		
		
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
				if (pilihan==1) { //Pelayan
				
				}
				else if (pilihan ==2 && status == 1 ) { //Meja
				
				}
				else if (pilihan ==3 && status ==2) { // Makanan/ Minuman
				
				}
				else if (pilihan ==4 && status == 3 ) { // Konfirmasi
				
				}		
				else if (pilihan ==5 && status == 4 ) { // Pembayaran
				
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
