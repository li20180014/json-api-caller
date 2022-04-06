package rs.ac.bg.fon.np.main;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.np.domain.Asteroid;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL url = new URL("https://api.nasa.gov/neo/rest/v1/feed?start_date=2022-04-01&end_date=2022-04-01&api_key=");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			List<Asteroid> asteroids = new ArrayList<>();
			JsonObject jsonObj = gson.fromJson(in, JsonObject.class);
			JsonArray jsonArray = (JsonArray) ((JsonObject) jsonObj.get("near_earth_objects")).get("2022-04-01");

			for (int i = 0; i < jsonArray.size(); i++) {
				JsonObject asteroidObj = (JsonObject) jsonArray.get(i);
				Asteroid a = gson.fromJson(asteroidObj, Asteroid.class);
				asteroids.add(a);
			}
			
			for (Asteroid a : asteroids) {
				System.out.println(a);
			}
			in.close();
			
			
			try (PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))) {
				out.print(gson.toJson(asteroids));
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
