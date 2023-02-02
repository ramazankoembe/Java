package ramazanKombe;

import java.util.Scanner;

public class Main {

	public static void option() {
	String sunroof, metalikRenk, budyKit, celikJant, multiMedia;
	String motor, vites;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Sunroof ? E/H ");
	sunroof =scan.nextLine();
	if(sunroof == "E") 	sunroof = "Sunroof isteniyor";
	
	System.out.println("Metalik renk? E/H ");
	metalikRenk=scan.nextLine();
	if(metalikRenk == "E") metalikRenk = "Metalik renk isteniyor";
	System.out.println("Budykit? E/H ");
	budyKit = scan.nextLine();
	if(budyKit == "E") budyKit ="Budykit isteniyor";
	
	System.out.println("Celikjant? E/H ");
	celikJant = scan.nextLine();
	if(celikJant == "E") celikJant = "Celikjant isteniyor";
	System.out.println("Multi media? E/H ");

	multiMedia = scan.nextLine();
	if(multiMedia== "E") multiMedia = "Multi Media Isteniyor";
	
	}
	public static void main(String[] args) {


		
		Scanner input = new Scanner(System.in);
        System.out.println("elektrıklı duz vıtes ıcın 1 , elektrikli otomatik icin 2 ,benzinli duz vites icin 3 ,"
        		+ " benzinli otomatik icin 4 u secin");
        byte yakitvites = input.nextByte();
        
		switch (yakitvites){
        
        case 1 :
        System.out.println("elektrıklı duz vıtes");
        option();
        
        break;
        case 2 :
        System.out.println("elektrikli otomatik");
        option();
        break;
       
        case 3:
        System.out.println("benzinli duz vites");
        option();
        break;
        
        case 4:
        System.out.println("benzinli otomatik ");
        option();
        break;
        default:
            System.out.println("Lutfen gecerli bir  no giriniz"); }
        }

		
	}


