package Time;

public class Time {
	private int horas;
	private int minutos;
	private int segundos;

	public Time(int horas, int minutos, int segundos) {
	
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	//getter
	public int getHoras() {
		return this.horas;
	}

	// setter
	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String toString() {
		// hh:mm:ss
		return this.horas + ":" + this.minutos + ":" + this.segundos;
	}
	
	public void aumentarMinutos(int minutos) {
		int numeroTotalMinutos = this.minutos + minutos;
		
		int numeroHoras = numeroTotalMinutos /60;
		int numeroFinalMinutos = numeroTotalMinutos - (numeroHoras * 60);
		
		this.horas = this.horas + numeroHoras;		
		this.minutos = numeroFinalMinutos;
		
	}
}
