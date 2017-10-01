package test.java;

import main.WeatherRepository;
import main.WeatherRequest;
import main.WeatherReport;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;



public class WeatherRepositoryTest {

    @Test
    public void testIfWeatherRepositoryResponseCityEqualsReqCity() {
        try {
            WeatherRequest request = new WeatherRequest();
            WeatherRepository repository = new WeatherRepository();
            WeatherReport report = repository.getCurrentWeather(request);
            assertEquals(report.getCityName(), request.getCityName());
        } catch (AssertionError e) {
            fail("Failure cause: " + e.getMessage());
        }
    }

    @Test
    public void testIfWeatherRepoResponseCityCoordinatesAreValid() {
        try{
            WeatherRequest request = new WeatherRequest();
            WeatherRepository repository = new WeatherRepository();
            WeatherReport report = repository.getCurrentWeather(request);
            String coordinatesCity = "59.4370:24.7536";
            assertEquals(coordinatesCity, report.getCoordinates());
        } catch (AssertionError e) {
            fail("Failure cause: " + e.getMessage());
        }
    }

    @Test
    public void testIfWeatherRepoResponseCurrentTempIsValid() {
        try{
            WeatherRequest request = new WeatherRequest();
            WeatherRepository repository = new WeatherRepository();
            WeatherReport report = repository.getCurrentWeather(request);
            assertEquals(report.GetCurrentTemp(),request.getCurrentTemp());
        } catch(Exception e){
            fail("Test failed, cause: " + e.getMessage());
        }
    }

    @Test
    public void testIfCurrentDayWeatherRepoResponseMaxTempEqualsReqMaxTemp() {
        try {
            WeatherRequest request = new WeatherRequest();
            WeatherRepository repository = new WeatherRepository();
            WeatherReport report = repository.getCurrentWeather(request);
            assertEquals(report.getMaxTemp(), request.MaxTemp());
        } catch (AssertionError e) {
            fail("Failure cause: " + e.getMessage());
        }
    }

    @Test
    public void testIfCurrentDayWeatherRepoResponseMinTempEqualsReqMinTemp() {
        try {
            WeatherRequest request = new WeatherRequest();
            WeatherRepository repository = new WeatherRepository();
            WeatherReport report = repository.getCurrentWeather(request);
            assertEquals(report.getMinTemp(), request.MinTemp());
        } catch (AssertionError e) {
            fail("Failure cause: " + e.getMessage());
        }
    }
}
