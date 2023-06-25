package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

	//	This file will contain all the java related config neccesary to connect to the datastore which
	//	will contain the weather data\

	//TODO: get h2 in memory db working within app
	public static void connectToH2Db() throws Exception {
		Class.forName("org.h2.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:h2:" + "./Database.my", "root", "password");
	}

	public static void connectToDb() {
		Connection connection = null;

		try {
			String url = "jdbc:h2://localhost:8001/weather_database";
			String username = "username";
			String password = "password";
			connection = DriverManager.getConnection(url, username, password);

			// TODO: Connection successful, hit queries in WeatherRepository from here
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
