package rs.ac.bg.fon.np.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.domain.Asteroid;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			URL url = new URL("https://api.nasa.gov/neo/rest/v1/neo/3542519?api_key=");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			Gson gson = new GsonBuilder().create();
			
			Asteroid a = new Asteroid();
			a = gson.fromJson(in, Asteroid.class);

			System.out.println(a);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}

}
