package rs.ac.bg.fon.np.domain;

public class Asteroid {

	private String id;
	private String name;
	private double absolute_magnitude_h;
	private boolean is_potentially_hazardous_asteroid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAbsolute_magnitude_h() {
		return absolute_magnitude_h;
	}
	public void setAbsolute_magnitude_h(double absolute_magnitude_h) {
		this.absolute_magnitude_h = absolute_magnitude_h;
	}
	public boolean isIs_potentially_hazardous_asteroid() {
		return is_potentially_hazardous_asteroid;
	}
	public void setIs_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
		this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
	}
	@Override
	public String toString() {
		return "Asteroid(id = " + id + "): name = " + name + ", Absolute Magnitude = " + absolute_magnitude_h
				+ ", Is Potentially Hazardous = " + is_potentially_hazardous_asteroid;
	}
	
	
	
}
