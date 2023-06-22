package api;

import data.Metrics;
import data.Records;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class WeatherService {
	// This file will contain the business logic that defines what data the API will retrieve

	public ArrayList<Records> retrieveData(Date toDate, Date fromDate, Metrics[] metrics, String stat) {
		//TODO: Add application logic here

		return new ArrayList<>();
	}
}
