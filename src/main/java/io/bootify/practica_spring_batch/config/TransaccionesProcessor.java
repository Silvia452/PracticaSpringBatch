package io.bootify.practica_spring_batch.config;


import io.bootify.practica_spring_batch.domain.Transacciones;
import org.springframework.batch.item.ItemProcessor;

public class TransaccionesProcessor implements ItemProcessor<Transacciones, Transacciones> {
    @Override
    public Transacciones process(Transacciones transacciones) throws Exception {
        if(transacciones.getId().equals("None")) {
            return transacciones;
        }else{
            return null;
        }
    }

}
