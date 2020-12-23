import java.io.PrintWriter;
import java.util.Scanner;

public class Pelanggan {
	String nama;
	String kontak;
	Scanner scan = new Scanner(System.in);
	int j=0;
	Scanner input = new Scanner(System.in);
	
	public void panggilPelayan() {
		System.out.println("Pelayan akan datang :");
	}
	
	public void pilihMeja(Kasir kasir1 ,Meja meja1 ) {
		System.out.print("\nPilih Meja : ");
		int mejaPilihan = input.nextInt();
		try {
			if (mejaPilihan == 1) {
			System.out.println("Anda memilih " + meja1.namaMeja[0]);
			kasir1.strukMeja[0]=meja1.namaMeja[0];
			}else if (mejaPilihan == 2) {
			System.out.println("Anda memilih " + meja1.namaMeja[1]);
			kasir1.strukMeja[0]=meja1.namaMeja[1];
			}else if (mejaPilihan == 3) {
			System.out.println("Anda memilih " + meja1.namaMeja[2]);
			kasir1.strukMeja[0]=meja1.namaMeja[2];
			}else if (mejaPilihan == 4) {
			System.out.println("Anda memilih " + meja1.namaMeja[3]);
			kasir1.strukMeja[0]=meja1.namaMeja[3];
			}else if (mejaPilihan == 5) {
			System.out.println("Anda memilih " + meja1.namaMeja[4]);
			kasir1.strukMeja[0]=meja1.namaMeja[4];
			}
		}
			catch (Exception e) {
			System.out.println("Pilih sesuai nomor !");
		}
	}
}
