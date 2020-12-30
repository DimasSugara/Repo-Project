/*
Nama: M. MISBAH ALVARIZ
NIM : 1908107010006
*/

public class Menu {

	 String[][] menuMakanan = {
			    
			    {"Spaghetti Brulee\t", "30000"},
			    {"Tenderloin Steak\t", "50000"},
			    {"Orange Waffle\t", "45000"},
			    {"Roasted Chicken\t", "95000"},
			    {"Mie Goreng Aceh\t", "55000"},
			    {"Sapo Tahu Ceker\t", "55000"},
			    {"Udang Mayonaise\t", "75000"},
			    {"Sapi Lada Hitam\t", "70000"},
			    {"Salmon Egg Sushi\t", "90000"},
			    {"Nasi Kari Ayam\t", "55000"},
			  };
			  
			  String[][] menuMinuman = {
			    
			    {"Banana Milkshake\t", "30000"},
			    {"Ice Tea Smoothie\t", "25000"},
			    {"Ice Chocolatte\t", "30000"},
			    {"Ice Tea Javachip\t", "25000"},
			    {"Ice Lemon Tea\t", "20000"},
			    {"Ice Blue Squash\t", "20000"},  
			    {"Mineral Water\t", "10000"},
			    {"Taro Milk Tea\t", "25000"},
			    {"Matcha Milk Tea\t", "30000"},
			    {"Ice Coffee Milk\t", "25000"},
			};
	
public void panggilMenu() {
	System.out.println("\n===========================================");
	System.out.println("|No. | Makanan \t\t\t|  Harga  |");
	System.out.println("===========================================");
		for ( int i=0 ; i<10 ; i++) {
		System.out.println("| "+(i+1)+"  |"+" " + menuMakanan[i][0] +"\t|"+"Rp."+ menuMakanan[i][1]+" |" );
		};
	System.out.println("===========================================");

	System.out.println("\n===========================================");
	System.out.println("|No. | Minuman \t\t\t|  Harga  |");
	System.out.println("===========================================");
		for ( int i=0 ; i<10 ; i++) {
		System.out.println("| "+(i+1)+"  |"+" " + menuMinuman[i][0] + "\t|"+"Rp." + menuMinuman[i][1]+" |" );
		};
	}

}
