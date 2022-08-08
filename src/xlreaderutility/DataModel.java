package xlreaderutility;

public class DataModel {
	String country;
	String capital;
	double population;
	
	
	@Override
	public String toString() {
		return "DataModel [country=" + country + ", capital=" + capital + ", population=" + population + "]";
	}
	public DataModel() {
		super();
		
	}
	public DataModel(String country, String capital, double population) {
		super();
		this.country = country;
		this.capital = capital;
		this.population = population;
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
	
	

}
