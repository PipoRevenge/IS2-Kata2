package org.example.data.io.csvPort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader<T>  {
    private final String filePath;
    private final CSVDataMapper<T> dataMapper;

    public CSVFileReader(String filePath, CSVDataMapper<T> dataMapper) {
        this.filePath = filePath;
        this.dataMapper = dataMapper;
    }


    public List<T> readData() {
        List<T> entities = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Ignorar la primera línea (encabezado)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                T entity = dataMapper.mapData(data);
                entities.add(entity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return entities;
    }
}
