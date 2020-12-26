public class Pelayan  {
	

String [] namaPel= {
			"Budi","Samsol","Jamal","Doubleh","Asep", "Bambang"
			};
	public void daftarPelayan() {
		System.out.println("Daftar Pelayan : ");
		for (int i=0 ; i<5 ; i++) {
		System.out.println((i+1)+". " + namaPel[i]);
	}
}
	
public void terimaPesanan(Pelanggan p1, Kasir kasir1) {
	System.out.println("Pesanan telah diterima oleh Pelayan");
	p1.pesanan(kasir1);
}

public void delay() {
	try {
		Thread.sleep(1000);
	}
	catch(InterruptedException ex)
	{
		Thread.currentThread().interrupt();
	}
}

public void delayMasak() {
	try {
		Thread.sleep(5000);
	}
	catch(InterruptedException ex)
	{
		Thread.currentThread().interrupt();
	}
}
	
public void laporMenu() {
	System.out.println("Pelayan memberikan pesanan pelanggan ke Koki\n\n");
}
	
}
