package org.example.analyzers;

import org.example.models.Game;
import org.example.data.io.csvPort.CSVDataMapper;
import org.example.data.io.csvPort.CSVFileReader;
import org.example.data.io.mappers.GameDataMapper;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GameAnalyzer {
    private static GameAnalyzer instance;
    private List<Game> games;

    private GameAnalyzer() {
        CSVDataMapper<Game> gameDataMapper = new GameDataMapper();
        CSVFileReader<Game> gameFileReader = new CSVFileReader<>("dataset/games.csv", gameDataMapper);
        this.games = gameFileReader.readData();
    }

    public static GameAnalyzer getInstance() {
        if (instance == null) {
            instance = new GameAnalyzer();
        }
        return instance;
    }

    // Obtener el juego con el mayor número de reseñas positivas
    public Game getGameWithMostPositiveReviews() {
        return games.stream()
                .max(Comparator.comparingInt(Game::getPositiveRatio))
                .orElse(null);
    }

    // Obtener el juego con el mayor número de reseñas negativas
    public Game getGameWithMostNegativeReviews() {
        return games.stream()
                .max(Comparator.comparingInt(game -> 100 - game.getPositiveRatio())) // Negativo = 100 - Positivo
                .orElse(null);
    }

    // Obtener un mapa que agrupa los juegos por su calificación (rating)
    public Map<String, List<Game>> groupGamesByRating() {
        return games.stream()
                .collect(Collectors.groupingBy(Game::getRating));
    }

    // Filtrar juegos según un predicado dado
    public List<Game> filterGames(Predicate<Game> predicate) {
        return games.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

