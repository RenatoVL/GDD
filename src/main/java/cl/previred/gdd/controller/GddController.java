package cl.previred.gdd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.previred.gdd.request.GddDatos;
import cl.previred.gdd.service.GddService;


@RestController
public class GddController {
	private static final Logger LOG = LoggerFactory.getLogger(GddController.class);
	
	@Autowired
	private GddService gddService;
	
	@PostMapping(value="/gdd/generarDatos",  produces = "application/json")
    public GddDatos generarDatos(@RequestBody GddDatos request){
		LOG.info("[INICIO GddController] generarDatos");
		GddDatos response = gddService.gernerarDatos(request);
		LOG.info("[FIN GddController] generarDatos");
		return response;
    }
}
