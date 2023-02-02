package ramazanKombe;

public class H12Firma {

	
	String calisanIsim;
	String calisanSoyIsim;
	String calisanStatu;

	double calisanMaas;	
	double zamliMaas;
	
	public void Calisan(String calisanIsim,String calisanSoyIsim,String calisanStatu,double calisanMaas) {
		
	this.calisanIsim =calisanIsim;
	this.calisanSoyIsim =calisanSoyIsim;
	this.calisanStatu =calisanStatu;
	
	this.calisanMaas =calisanMaas;	
}
		public String getCalisanBilgileri() {
			
			if(calisanIsim != null && calisanSoyIsim != null && calisanStatu != null) {
				if(calisanMaas<=0)
					
					calisanMaas=0;
				
				return "----------\n<Calisan Bilgileri>\n----------\n Calisanin ismi: + calisanIsim + \n Calisanin soyismi:"
						+ "+ calisanSoyIsim + \n Calisanin statusu: + calisanStatu \n Calisanin Maasi: + calisanMaas";
			}
			return "Bu bilgiler sistemde mevcut degildir";
			
		}
		
		public double zam(double zamOrani) {
			
			
			double zamliMaas = calisanMaas + (calisanMaas*zamOrani);
		
					return zamliMaas;
	
		
			
		}
		

}
	


