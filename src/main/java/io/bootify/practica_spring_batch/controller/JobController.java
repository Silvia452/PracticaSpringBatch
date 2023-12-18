package io.bootify.practica_spring_batch.controller;
/*

import io.bootify.practica_spring_batch.domain.Transacciones;
import io.bootify.practica_spring_batch.repos.TransaccionesRepository;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private TransaccionesRepository transaccionesRepository;

    @PostMapping("/importTransacciones")
    public ResponseEntity<String> importCsvToDBJob() {
        try {
            List<Transacciones> transaccionesList = readCsvFile("src/main/resources/transacciones.csv");

            for (Transacciones transaccion : transaccionesList) {
                transaccionesRepository.save(transaccion);
            }

            return ResponseEntity.ok("Import completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during CSV import: " + e.getMessage());
        }
    }

    private List<Transacciones> readCsvFile(String filename) throws IOException {
        List<Transacciones> transaccionesList = new ArrayList<>();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename)) {
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] values = line.split(",");
                    Transacciones transaccion = new Transacciones();
                    transaccion.setId(Long.parseLong(values[0]));
                    transaccion.setFecha(LocalDate.parse(values[1]));
                    transaccion.setCantidad(Double.parseDouble(values[2]));
                    transaccion.setTipoTrans(values[3]);
                    transaccion.setCuentaOrigen(values[4]);
                    transaccion.setCuentaDestino(values[5]);
                    transaccionesList.add(transaccion);
                }
            } else {
                throw new IOException("CSV file not found: " + filename);
            }
        }
        return transaccionesList;
    }
}




*/
