package service;

import java.io.File;
import java.util.List;

import model.CdtDTO;
import util.JSONMapper;

public class CdtService {
	
	public CdtService() {
	}
	public void agregarCDT(CdtDTO cdt) {
		JSONMapper.agregar(cdt, CdtDTO.class, System.getProperty("user.home") + File.separator + "CDT.json");
	}
	public List<CdtDTO> obtenerCdts(){
		return JSONMapper.obtener(CdtDTO.class, System.getProperty("user.home") + File.separator + "CDT.json");
	}
}
