package api;

import data.Metrics;
import data.Records;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
	//This file will contain the logic that controls the APIs weather data gathering functionality

	private final WeatherService weatherService;

	@GetMapping(value = "/data", produces = "application/json")
	@ResponseBody
	public ResponseEntity<ArrayList<Records>> retrieveData(
			@RequestParam("fromDate") Date fromDate,
			@RequestParam("toDate") Date toDate,
			@RequestParam("metrics") Metrics[] metrics,
			@RequestParam("statistic") String stat) {

		ArrayList<Records> transactionEvents = weatherService.retrieveData(fromDate, toDate, metrics, stat);

		return new ResponseEntity(transactionEvents, HttpStatus.OK);
	}
}
