package xlreaderutility;

public class Model {
	
	String country;
	String capital;
	double population;
	String phone;
	String email;
	String address;
	String city;
	String state;
	int pin;
	
	
	
	@Override
	public String toString() {
		return "Model [country=" + country + ", capital=" + capital + ", population=" + population + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state + ", pin=" + pin
				+ "]";
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(String country, String capital, double population, String phone, String email, String address,
			String city, String state, int pin) {
		super();
		this.country = country;
		this.capital = capital;
		this.population = population;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
