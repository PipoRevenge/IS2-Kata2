package org.example.data.io.mappers;

import org.example.models.Recommendation;
import org.example.data.io.csvPort.CSVDataMapper;


public class RecommendationDataMapper implements CSVDataMapper<Recommendation> {
    @Override
    public Recommendation mapData(String[] data) {
        return new Recommendation(
                Integer.parseInt(data[0]), // app_id
                Integer.parseInt(data[1]), // helpful
                Integer.parseInt(data[2]), // funny
                data[3], // date
                Boolean.parseBoolean(data[4]), // is_recommended
                Double.parseDouble(data[5]), // hours
                Integer.parseInt(data[6]),// user_id
                Integer.parseInt(data[7])

        );
    }
}