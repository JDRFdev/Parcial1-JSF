package controller;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("Mybean")
@RequestScoped
public class BeanPrueba{
	public String mensaje() {
		return "Probando 1,2,3";
	}
}
