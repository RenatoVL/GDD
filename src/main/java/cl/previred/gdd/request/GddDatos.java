package cl.previred.gdd.request;

import java.io.Serializable;
import java.util.ArrayList;

public class GddDatos implements Serializable{

	private static final long serialVersionUID = 2834178159661851446L;

	private Integer id;    
	private String fechaCreacion;    
	private String fechaFin;    
	private ArrayList<String> fechas;
	
	public GddDatos() {
	}
	
	public GddDatos(Integer id, String fechaCreacion, String fechaFin, ArrayList<String> fechas) {
		super();
		this.id = id;
		this.fechaCreacion = fechaCreacion;
		this.fechaFin = fechaFin;
		this.fechas = fechas;
	}

	@Override
	public String toString() {
		return "NotificacionEncoderRequest [id=" + id + ", fechaCreacion=" + fechaCreacion + ", fechaFin=" + fechaFin
				+ ", fechas=" + fechas + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public ArrayList<String> getFechas() {
		return fechas;
	}

	public void setFechas(ArrayList<String> fechas) {
		this.fechas = fechas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
}
