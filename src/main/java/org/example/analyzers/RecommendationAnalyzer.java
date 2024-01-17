package org.example.analyzers;
import org.example.data.io.csvPort.CSVDataMapper;
import org.example.data.io.csvPort.CSVFileReader;
import org.example.data.io.mappers.RecommendationDataMapper;
import org.example.models.Recommendation;

import java.util.List;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RecommendationAnalyzer {
    private static RecommendationAnalyzer instance;
    private List<Recommendation> recommendations;

    private RecommendationAnalyzer() {
        CSVDataMapper<Recommendation> recommendationDataMapper = new RecommendationDataMapper();
        CSVFileReader<Recommendation> recommendationFileReader = new CSVFileReader<>("dataset/recommendations.csv", recommendationDataMapper);
        this.recommendations = recommendationFileReader.readData();
    }

    public static RecommendationAnalyzer getInstance() {
        if (instance == null) {
            instance = new RecommendationAnalyzer();
        }
        return instance;
    }

    // Obtener la recomendación más útil
    public Recommendation getMostHelpfulRecommendation() {
        return recommendations.stream()
                .max(Comparator.comparingInt(Recommendation::getHelpful))
                .orElse(null);
    }

    // Obtener la recomendación más divertida
    public Recommendation getMostFunnyRecommendation() {
        return recommendations.stream()
                .max(Comparator.comparingInt(Recommendation::getFunny))
                .orElse(null);
    }

    // Filtrar recomendaciones según un predicado dado
    public List<Recommendation> filterRecommendations(Predicate<Recommendation> predicate) {
        return recommendations.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
