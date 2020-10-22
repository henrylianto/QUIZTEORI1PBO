import java.util.Scanner;

class quizteori1{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int total = 0;
		int bayar = 0;
		int harga = 0; 
		int tipe,meteran,kembalian;
		String nama;
		boolean loop = true;
		
			
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		
	    System.out.println("Tipe Rumah :    =  Harga Beban");
		System.out.println("Tipe 31         =  Rp. 100.000 ");
		System.out.println("Tipe 32         =  Rp. 125.000 ");
		System.out.println("Tipe 33         =  Rp. 450.000 ");
		System.out.println("Tipe 34         =  Rp. 480.000 ");
		System.out.println("Tipe 35         =  Rp. 500.000 ");
		System.out.println("Tipe 40         =  Rp. 550.000 ");
	
		while(loop){
		System.out.print("Tipe Rumah : ");
		
        tipe = input.nextInt();
		

		 switch(tipe)
		 {
            case 31 :
                harga = 100000;
                
                loop = false;
                break;
                
            case 32 :
               harga = 125000;
                 
                loop= false;
                break;
            case 33 :
               harga = 450000;
                  
            case 34 :
                harga = 480000;
                
                loop = false;
                break;
            case 35 :
               harga = 500000;
                 
                loop= false;
                break;
            case 40 :
               harga = 550000;
                loop = false;
                break;
            
               default :
                System.out.println("Pilihan tidak tersedia, mohon input ulang");
               
                
        }
        
	  
	}
	
  	   System.out.print("Masukkan Jumlah meteran : ");
       meteran = input.nextInt();
       total = meteran*harga;
       System.out.println("Total Penggunaan : Rp. "+total);
      
       
		while(bayar<total){
		System.out.print("Masukkan Jumlah Bayaran = Rp."); 
		bayar = input.nextInt();
			if (bayar > total){
				kembalian=bayar-total;
			}
			else if (bayar<total){
				System.out.println("Uang anda kurang, mohon ditambah");
			}
		}
	   
	   kembalian = bayar - total;
		
		
		
	   System.out.println("Nama        : "+nama );
	   System.out.println("Total Harga : Rp."+(meteran*harga));
	   System.out.println("Bayar       : Rp."+bayar);
	   System.out.println("Kembalian   : Rp."+kembalian);
	    
	   
	    	
		
				
	}
}