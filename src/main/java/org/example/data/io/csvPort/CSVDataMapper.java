package org.example.data.io.csvPort;

public interface CSVDataMapper<T> {
    T mapData(String[] data);
}
