package org.example.data.io.mappers;

import org.example.models.Game;
import org.example.data.io.csvPort.CSVDataMapper;

public class GameDataMapper implements CSVDataMapper<Game> {
    @Override
    public Game mapData(String[] data) {
        return new Game(
                Integer.parseInt(data[0]), // app_id
                data[1], // title
                data[2], // date_release
                Boolean.parseBoolean(data[3]), // win
                Boolean.parseBoolean(data[4]), // mac
                Boolean.parseBoolean(data[5]), // linux
                data[6], // rating
                Integer.parseInt(data[7]), // positive_ratio
                Integer.parseInt(data[8]), // user_reviews
                Double.parseDouble(data[9]), // price_final
                Double.parseDouble(data[10]), // price_original
                Double.parseDouble(data[11]), // discount
                Boolean.parseBoolean(data[12]) // steam_deck
        );
    }
}