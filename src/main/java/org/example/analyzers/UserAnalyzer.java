package org.example.analyzers;

import org.example.data.io.csvPort.CSVDataMapper;
import org.example.data.io.csvPort.CSVFileReader;
import org.example.data.io.mappers.UserDataMapper;
import org.example.models.User;

import java.util.List;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserAnalyzer {
    private static UserAnalyzer instance;
    private List<User> users;

    private UserAnalyzer() {
        CSVDataMapper<User> userDataMapper = new UserDataMapper();
        CSVFileReader<User> userFileReader = new CSVFileReader<>("dataset/users.csv", userDataMapper);
        this.users = userFileReader.readData();
    }

    public static UserAnalyzer getInstance() {
        if (instance == null) {
            instance = new UserAnalyzer();
        }
        return instance;
    }

    // Obtener el usuario con más productos
    public User getUserWithMostProducts() {
        return users.stream()
                .max(Comparator.comparingInt(User::getProducts))
                .orElse(null);
    }

    // Obtener el usuario con más reseñas
    public User getUserWithMostReviews() {
        return users.stream()
                .max(Comparator.comparingInt(User::getReviews))
                .orElse(null);
    }

    // Filtrar usuarios según un predicado dado
    public List<User> filterUsers(Predicate<User> predicate) {
        return users.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
