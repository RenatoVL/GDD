
package cl.previred.gdd.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cl.previred.gdd.request.GddDatos;

@Service
public class GddServiceImpl implements GddService{
	
	private static final Logger LOG = LoggerFactory.getLogger(GddServiceImpl.class);

	@Override
	public GddDatos gernerarDatos(GddDatos request) {
		
		GddDatos response = new GddDatos();
		
		response.setId(request.getId());
		response.setFechaCreacion(request.getFechaCreacion());
		response.setFechaFin(request.getFechaFin());
		
		LocalDate fechaInicio  = LocalDate.parse(request.getFechaCreacion());
		LocalDate fechaFin = LocalDate.parse(request.getFechaFin());
		
		ArrayList<String> listaFechas= new ArrayList<String>();
		
		Random random = new Random();
		int i=1;
		while(!fechaInicio.isAfter(fechaFin)) {
			LocalDate fecha = fechaInicio;
			fechaInicio = fechaInicio.plusMonths(random.nextInt(3)+1);
			listaFechas.add(fechaInicio.toString());
			for(String fechaIn: request.getFechas()) {
				LocalDate fechaI = LocalDate.parse(fechaIn);
				if(!fechaI.equals(fechaInicio)) {
					if(fecha.isAfter(fechaInicio) && fecha.isBefore(fechaFin) ) {
						listaFechas.add(fechaInicio.toString());
					}
				}
			}
			i++;
			if(i>99) break; 			
		}
		response.setFechas(listaFechas);
		
		return response;
		
	}
}

