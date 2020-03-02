package date;

public class Date {
	private int ano;
	private int mes;
	private int dia;
	
	public Date(int dia, int mes, int ano) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	
	//getAno
	public int getAno() {
		return this.ano;
		
	}
	
	//setAno
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getMes() {
		return this.mes = mes;
	}
	
	public void setMes() {
		this.mes = mes;
	}
	
	public int getDia() {
		return this.dia = dia;
	}
	public void setDia() {
		this.dia = dia;
	}
	
	public String toString() {
		String dia;
		String mes;
		
		if(this.dia > 9 ) {
			dia = "" + this.dia;
		}else {
			dia = "0" + this.dia;
		}
		
		if (this.mes > 9) {
			mes= "" + this.mes;
		} else {
			mes = "0" + this.mes;
		}
		return dia + "/" + this.mes + "/" + this.ano;
	}
	
	public void aumentarMes(int mes) {
		
		int mesesTotales = (this.mes + mes);
		int anos = mesesTotales / 12;
		
		
		this.ano = this.ano + anos;
		
		this.mes = this.mes - anos * 12;
	}
}
