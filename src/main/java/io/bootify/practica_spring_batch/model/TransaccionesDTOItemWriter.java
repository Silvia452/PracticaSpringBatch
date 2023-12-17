package io.bootify.practica_spring_batch.model;

import io.bootify.practica_spring_batch.domain.Transacciones;
import io.bootify.practica_spring_batch.model.TransaccionesDTO;
import io.bootify.practica_spring_batch.config.BatchConfig;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

/*
public class TransaccionesDTOItemWriter implements ItemWriter<TransaccionesDTO> {

    private final JdbcTemplate jdbcTemplate;

    public TransaccionesDTOItemWriter(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void write(List<? extends TransaccionesDTO> items) throws Exception {
        for (TransaccionesDTO transaccionesDTO : items) {
            // Convierte TransaccionesDTO a entidad Transacciones y persiste en la base de datos
            Transacciones transacciones = convertirADTO(transaccionesDTO);
            persistirEnBaseDeDatos(transacciones);
        }
    }

    private Transacciones convertirADTO(TransaccionesDTO transaccionesDTO) {
        Transacciones transacciones = new Transacciones();
        transacciones.setId(transaccionesDTO.getId());
        transacciones.setFecha(transaccionesDTO.getFecha());
        transacciones.setCantidad(transaccionesDTO.getCantidad());
        transacciones.setTipoTrans(transaccionesDTO.getTipoTrans());
        transacciones.setCuentaOrigen(transaccionesDTO.getCuentaOrigen());
        transacciones.setCuentaDestino(transaccionesDTO.getCuentaDestino());
        return transacciones;
    }

    private void persistirEnBaseDeDatos(Transacciones transacciones) {
        jdbcTemplate.update("INSERT INTO Transaccioneses (fecha, cantidad, tipoTrans, cuentaOrigen, cuentaDestino) " +
                        "VALUES (?, ?, ?, ?, ?)",
                transacciones.getFecha(),
                transacciones.getCantidad(),
                transacciones.getTipoTrans(),
                transacciones.getCuentaOrigen(),
                transacciones.getCuentaDestino());
    }


}

*/
