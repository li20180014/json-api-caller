package rs.ac.bg.fon.np.main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.domain.Asteroid;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileReader in = new FileReader("niz_objekata.json")) {
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			List<Asteroid> asteroids = Arrays.asList(gson.fromJson(in, Asteroid[].class));

			for (Asteroid asteroid : asteroids) {
				System.out.println(asteroid);
			}

		} catch (Exception ex) {
			
			ex.printStackTrace();
			
		}
	}

}
