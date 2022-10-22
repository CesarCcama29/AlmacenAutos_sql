package pe.unjfsc.daw.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.unjfsc.daw.entity.CESalida;


public class CDWriter implements ItemWriter<CESalida>{
	private static final Logger LOG = LoggerFactory.getLogger(CDWriter.class);

	  public void write(List<? extends CESalida> poItemsSalida) throws Exception {
	     LOG.info("[DAW] =====[ Start write ]=====");
	    
	     LOG.info("[DAW] Object output : {} ", poItemsSalida.toString());
	     for(CESalida item:poItemsSalida) {
	         LOG.info("[DAW] Item read  : {}", item.toString());
	      }
	   }
}
