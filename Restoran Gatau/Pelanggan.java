
import java.io.PrintWriter;
import java.util.Scanner;
public class Pelanggan  {
	
	String nama;
	String kontak;
	Scanner scan = new Scanner(System.in);
	int j=0;
	Scanner input = new Scanner(System.in);
	

	public void pilihPelayan(Pelayan pelayan1) {
		System.out.print("\nSilahkan Pilih Pelayan : ");
		int pelayanPilihan = input.nextInt();
		try {
			if (pelayanPilihan == 1) {
			System.out.println("Anda memilih Pelayan Bernama " + pelayan1.namaPel[0]);
			}
			else if (pelayanPilihan == 2) {
			System.out.println("Anda memilih Pelayan Bernama " + pelayan1.namaPel[1]);
			}
			else if (pelayanPilihan == 3) {
			System.out.println("Anda memilih Pelayan Bernama " + pelayan1.namaPel[2]);
			}
			else if (pelayanPilihan == 4) {
			System.out.println("Anda memilih Pelayan Bernama " + pelayan1.namaPel[3]);
			}
			else if (pelayanPilihan == 5) {
			System.out.println("Anda memilih Pelayan Bernama " + pelayan1.namaPel[4]);
			}
		}
		catch (Exception e) {
			System.out.println("Pilih sesuai nomor !");
		}
	}
	
	
	public void pilihMeja(Kasir kasir1 ,Meja meja1 ) {
		System.out.print("\nPilih Meja : ");
		int mejaPilihan = input.nextInt();
		try {
			if (mejaPilihan == 1) {
			System.out.println("Anda memilih " + meja1.namaMeja[0]);
			kasir1.strukMeja[0]=meja1.namaMeja[0];
			}
			else if (mejaPilihan == 2) {
			System.out.println("Anda memilih " + meja1.namaMeja[1]);
			kasir1.strukMeja[0]=meja1.namaMeja[1];
			}
			else if (mejaPilihan == 3) {
			System.out.println("Anda memilih " + meja1.namaMeja[2]);
			kasir1.strukMeja[0]=meja1.namaMeja[2];
			}
			else if (mejaPilihan == 4) {
			System.out.println("Anda memilih " + meja1.namaMeja[3]);
			kasir1.strukMeja[0]=meja1.namaMeja[3];
			}
			else if (mejaPilihan == 5) {
			System.out.println("Anda memilih " + meja1.namaMeja[4]);
			kasir1.strukMeja[0]=meja1.namaMeja[4];
			}
		}
		catch (Exception e) {
			System.out.println("Pilih sesuai nomor !");
		}
	}
	
		
	public void pilihMenu(Kasir kasir1, Menu menu) {
		System.out.print("\nPilih Menu Makanan : ");
		int pesananMak = input.nextInt();	
		try {
			if (pesananMak == 1) {		
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j] = menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
				
			}
			
			else if (pesananMak == 2) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}
			
			else if (pesananMak == 3) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}
			
			else if (pesananMak == 4) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}
			
			else if (pesananMak == 5) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}

			else if (pesananMak == 6) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}
			else if (pesananMak == 7) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}

			else if (pesananMak == 8) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}

			else if (pesananMak == 9) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}

			else if (pesananMak == 10) {
				
				System.out.print("Jumlah pesanan     : " );
				int jumlah = input.nextInt();
				kasir1.strukNama[j]= menu.menuMakanan[pesananMak-1][0];
				kasir1.strukHarga[j]=Integer.parseInt(menu.menuMakanan[pesananMak-1][1]);
				kasir1.strukJumlah[j]= jumlah;
				j++;
			}
			}
		catch(Exception ex) {
			System.out.println("Pilih sesuai nomor !");
		}
		System.out.println("===========================================");
		System.out.print("Pilih Menu Minuman : ");
		int pesananMin = input.nextInt();
		try {
		if (pesananMin == 1) {
			System.out.print("Jumlah pesanan     : " );
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.strukJumlah[j]= jumlah;
			j++;
		}
		
		else if (pesananMin == 2) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 3) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 4) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 5) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 6) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 7) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 8) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 9) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}

		else if (pesananMin == 10) {
			System.out.print("Jumlah pesanan     : ");
			int jumlah = input.nextInt();
			System.out.print("\n");
			kasir1.strukNama[j]= menu.menuMinuman[pesananMin-1][0];
			kasir1.	strukHarga[j]=Integer.parseInt(menu.menuMinuman[pesananMin-1][1]);
			kasir1.	strukJumlah[j]= jumlah;
			j++;
		}
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println("===========================================");
				
	}
	
	
	public void pesanan(Kasir kasir1) {
			System.out.println("\n===========================================");
			System.out.println("|No.| Rincian Pesanan \t\t|  Jumlah |");
			System.out.println("===========================================");
			for ( int i=0 ; i<j ; i++) {
			System.out.println("| "+(i+1)+". |" + kasir1.strukNama[i] +"\t|  "+" x "+ kasir1.strukJumlah[i]+"   |");
			};
			System.out.println("===========================================");
			System.out.print("\n");
	}
	
	public void menungguPesanan() {
		System.out.println("Pesanan sedang di proses, silahkan menunggu\n\n");
	}


}
