package pe.unjfsc.daw.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.unjfsc.daw.entity.CEEntrada;
public class CLMapper implements FieldSetMapper<CEEntrada> {
	private static final Logger MOLOG = LoggerFactory.getLogger(CLMapper.class);
	 public CEEntrada mapFieldSet(FieldSet poFieldSet) throws BindException {
	     MOLOG.info("[DAW] =====[ Start mapFieldSet ]=====");
	     MOLOG.info("[DAW] read record : {} ", poFieldSet.toString());
	    
	     CEEntrada oCompraEntrada = new CEEntrada();
	     oCompraEntrada.setNumeroUbicacion(poFieldSet.readInt("UBICACION"));
	     oCompraEntrada.setNombreDueño(poFieldSet.readString("DUEÑO"));
	     oCompraEntrada.setTipoVehiculo(poFieldSet.readString("VEHICULO"));
	     oCompraEntrada.setPlaca(poFieldSet.readString("PLACA"));
	     oCompraEntrada.setHora(poFieldSet.readString("HORA"));
	     oCompraEntrada.setMoneda(poFieldSet.readString("MONEDA"));
	     oCompraEntrada.setPrecio(poFieldSet.readDouble("PRECIO"));
	     MOLOG.info("[DAW] Mapper to CECompraDTOEntrada : {}", oCompraEntrada.toString());

	     return oCompraEntrada;
	  }

}
