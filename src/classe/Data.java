package classe;



public class Data{
	int dia;
	int mes;
	int ano;
	
	
	Data(int ndia, int nmes, int nano){
		
		dia = ndia;
		mes = nmes;
		ano = nano;
		
	}
	
	Data(){
		dia =1;
		mes =1;
		ano = 1970;
	}
	
	String dataFormatada() {
		
		return dia + "/" + mes + "/" + ano;
	}
	
}
