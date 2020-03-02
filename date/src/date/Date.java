package date;

public class Date {
	private int ano;
	private int mes;
	private int dia;
	
	public Date(int ano, int mes, int dia) {
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
	
	public void getMes() {
		this.mes = mes;
	}
	
	public void getDia() {
		this.dia = dia;
	}
	
}
