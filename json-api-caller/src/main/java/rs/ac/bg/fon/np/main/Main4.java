package rs.ac.bg.fon.np.main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.np.domain.Asteroid;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Asteroid a = new Asteroid();
			a.setId("534646");
			a.setName("200F YL");
			a.setIs_potentially_hazardous_asteroid(true);
			a.setAbsolute_magnitude_h(20.3);
			
			System.out.println(a);
			JsonObject jsonObj = new JsonObject();

			jsonObj.addProperty("id", a.getId());
			jsonObj.addProperty("name", a.getName());
			jsonObj.addProperty("is_potentially_hazardous_asteroid", a.isIs_potentially_hazardous_asteroid());
			jsonObj.addProperty("absolute_magnitude_h", a.getAbsolute_magnitude_h());

			try (FileWriter out = new FileWriter("rucni_upis.json")) {
				
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				out.write(gson.toJson(jsonObj));
				
			} catch (IOException ex) {
				
				ex.printStackTrace();
				
			}
			
	}

}
