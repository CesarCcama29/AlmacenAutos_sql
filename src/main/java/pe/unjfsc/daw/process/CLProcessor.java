package pe.unjfsc.daw.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.unjfsc.daw.entity.CEEntrada;
import pe.unjfsc.daw.entity.CESalida;


public class CLProcessor implements ItemProcessor<CEEntrada, CESalida>{
	private static final Logger MOLOG = LoggerFactory.getLogger(CLProcessor.class);
	 
	  public CESalida process(CEEntrada poItemCompra) throws Exception {
	     MOLOG.info("[DAW] =====[ Start process ]=====");
	     MOLOG.info("[DAW] Data received input : {} ", poItemCompra.toString());
	     CESalida oCompraSalida = new CESalida();
	    
	     oCompraSalida.setNumeroUbicacion(poItemCompra.getNumeroUbicacion());
	     oCompraSalida.setNombreDueño(poItemCompra.getNombreDueño());
	     oCompraSalida.setTipoVehiculo(poItemCompra.getTipoVehiculo());
	     oCompraSalida.setPlaca(poItemCompra.getPlaca());
	     oCompraSalida.setHora(poItemCompra.getHora());
	     oCompraSalida.setMoneda(poItemCompra.getMoneda());
	     oCompraSalida.setPrecio(poItemCompra.getPrecio());
	     MOLOG.info("[DAW] New CECompraDTOSalida : {} ", oCompraSalida.toString());

	     return oCompraSalida;
	  }
}
