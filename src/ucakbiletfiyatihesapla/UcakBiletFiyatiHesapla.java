package ucakbiletfiyatihesapla;

import java.util.Scanner;

public class UcakBiletFiyatiHesapla {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Mesafeyi Kilometre Türünden Girin : ");
        double kilometre = scanner.nextDouble();
        System.out.print("Lütfen Yaşınızı Girin : ");
        int yas = scanner.nextInt();
        System.out.print("Lütfen Yolculuk Tipini Seçiniz (1 : Tek Yön, 2 : Gidiş - Dönüş) : ");
        int yolculukTip = scanner.nextInt();
        
        
        double normalTutar = (kilometre * 0.10) ; // --> Hiçbir indirim uygulanmamış bilet tutarı.
        
         //İndirim Hesapla  
         
        //Yaş İndirimi Hesapla       
        
        double yasIndirimliTutar = 0 ;
        
        
        //Geçersiz Veri Giriş İşlemi Yaşandığı Takdirde Yaşanıcak Senaryo.
        if(kilometre<0 || yas<0 || yolculukTip != 1 || yolculukTip != 2){
            System.out.println("Geçersiz Veri Girdiniz...");
            System.exit(0);
        }
        
        
        else if(yas<12){
            yasIndirimliTutar = (normalTutar * 0.5) ;     
            normalTutar -= yasIndirimliTutar;
        }
        else if(yas>= 12 && yas<25){
            yasIndirimliTutar = (normalTutar * 0.1) ;
            normalTutar -= yasIndirimliTutar;
        }
        else if(yas>65){
            yasIndirimliTutar = (normalTutar * 0.3) ;
            normalTutar -= yasIndirimliTutar;
        }
        
        //Yolculuk Tipi İndirimi Hesapla
        double yolculukTipiIndirim ;
        if(yolculukTip == 1){
             normalTutar = normalTutar;
        }
        else if(yolculukTip == 2){
            yolculukTipiIndirim = normalTutar * 0.2;
            normalTutar = (normalTutar - yolculukTipiIndirim) * 2;
        }
        else{
            System.out.println("Geçersiz Yaş Girdiniz...");
        }
        
        
        System.out.println("Toplam Tutar : " + normalTutar);
        
             
    }

}
