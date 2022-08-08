package xlreaderutility;

public class DataModel2 {
	
	String country;
	String capital;
	double population;
	
	@Override
	public String toString() {
		return "DataModel2[country=" + country + ",capital= " + capital + ",population= " + population +"]";
		}
		public DataModel2() {
			super();
		}
		
		public DataModel2(String country,String capital,double population) {
			super();
			this.country=country;
			this.capital=capital;
			this.population=population;
			
		}

		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			 this.country=country;
		}
		public String getCapital() {
			return capital;
		}
		public void setcapital(String capital) {
			this.capital=capital;
		}
		public double getPopulation(double population) {
			return population;
			
		}
		public void setPopulation(double population) {
			this.population=population;
		}
				
		
		
			
		
		
	
	

}
