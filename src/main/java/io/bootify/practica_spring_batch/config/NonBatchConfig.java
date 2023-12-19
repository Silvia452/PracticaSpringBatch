package io.bootify.practica_spring_batch.config;

import io.bootify.practica_spring_batch.domain.Transacciones;
import io.bootify.practica_spring_batch.repos.TransaccionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class NonBatchConfig {

    @Autowired
    private TransaccionesRepository transaccionesRepository;

    @Bean
    public void importCsvToDBJob() {
        try {
            List<Transacciones> transaccionesList = readCsvFile("src/main/resources/transacciones.csv");

            for (Transacciones transaccion : transaccionesList) {
                transaccionesRepository.save(transaccion);
            }

            System.out.println("Import completed successfully.");
        } catch (IOException | DateTimeParseException | NumberFormatException e) {
            e.printStackTrace();
            System.err.println("Error during CSV import: " + e.getMessage());
        }
    }

    private List<Transacciones> readCsvFile(String filePath) throws IOException {
        List<Transacciones> transaccionesList = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            // Omitir la primera línea que contiene los encabezados
            String headerLine = reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                Transacciones transaccion = new Transacciones();
                transaccion.setId(Long.parseLong(values[0]));
                transaccion.setFecha(LocalDate.parse(values[1])); // Assuming date is in ISO format (yyyy-MM-dd)
                transaccion.setCantidad(Double.parseDouble(values[2]));
                transaccion.setTipoTrans(values[3]);
                transaccion.setCuentaOrigen(values[4]);
                transaccion.setCuentaDestino(values[5]);
                transaccionesList.add(transaccion);
            }
        }
        return transaccionesList;
    }

}

