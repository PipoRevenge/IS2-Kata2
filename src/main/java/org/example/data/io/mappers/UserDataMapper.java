package org.example.data.io.mappers;

import org.example.models.User;
import org.example.data.io.csvPort.CSVDataMapper;

public class UserDataMapper implements CSVDataMapper<User> {
    @Override
    public User mapData(String[] data) {
        return new User(
                Integer.parseInt(data[0]), // user_id
                Integer.parseInt(data[1]), // products
                Integer.parseInt(data[2]) // reviews
        );
    }
}