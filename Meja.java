public class Meja {
	
	String [] namaMeja = {
		"Meja 01","Meja 02","Meja 03","Meja 04","Meja 05"
	};

	public void daftarMeja() {
		System.out.println("Daftar Meja : ");
		for (int i=0 ; i<5 ; i++) {
			System.out.println((i+1)+". " + namaMeja[i]);
		}
	}
}
