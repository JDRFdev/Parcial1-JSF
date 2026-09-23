package controller;

import java.io.Serializable;
import java.util.List;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import model.CdtDTO;
import service.CdtService;
@Named("Cdt")
@ViewScoped
public class CdtBean implements Serializable {

	private static final long serialVersionUID = 384259522314680994L;
	private static CdtService service=new CdtService();
	private CdtDTO cdt=new CdtDTO();
	public CdtBean() {
	}

	public CdtDTO getCdt() {
		return cdt;
	}
	public void setCdt(CdtDTO cdt) {
		this.cdt = cdt;
	}
	
	public void agregarCDT(CdtDTO cdt) {
		service.agregarCDT(this.cdt);
		cdt=new CdtDTO();
	}
	public List<CdtDTO> obtenerCdts(){
		return service.obtenerCdts();
	}
}
