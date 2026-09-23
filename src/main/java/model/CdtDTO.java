package model;

import java.io.Serializable;

public class CdtDTO implements Serializable{
	
	private static final long serialVersionUID = -8214193150204854621L;
	private PersonaDTO usuario;
	private int dias;
	private double valorInversion;
	private double tasaInteresAnual;
	public CdtDTO() {
	 this.usuario=new PersonaDTO();
	}
	public CdtDTO(PersonaDTO usuario, int dias, double valorInversion, double tasaInteresAnual) {
		this.usuario = usuario;
		this.dias = dias;
		this.valorInversion = valorInversion;
		this.tasaInteresAnual = tasaInteresAnual;
	}
	public PersonaDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(PersonaDTO usuario) {
		this.usuario = usuario;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public double getValorInversion() {
		return valorInversion;
	}
	public void setValorInversion(double valorInversion) {
		this.valorInversion = valorInversion;
	}
	public double getTasaInteresAnual() {
		return tasaInteresAnual;
	}
	public void setTasaInteresAnual(double tasaInteresAnual) {
		this.tasaInteresAnual = tasaInteresAnual;
	}
	public double calcularGananciaBruta() {
		return (this.valorInversion*this.tasaInteresAnual*this.dias)/365;
	}
	public double calcularRetencion() {
		return calcularGananciaBruta()*0.06;
	}
	public double calcularGanaciaNeta() {
		return calcularGananciaBruta()-calcularRetencion();
	}
	public double calcularMontoTotal() {
		return this.valorInversion+calcularGanaciaNeta();
	}
}
