CREATE DATABASE weather_database;

USE weather_database;

CREATE TABLE weather_records (
    sensor INT,
    windspeed DECIMAL(3, 2),
    humidity DECIMAL(2, 2),
    temperature DECIMAL(2, 2),
    date DATETIME;
);