package xlreaderutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	public static void main(String[] args) {
		List<Object[]> list = getXlData();
		int i=1;
		for(Object[] data : list) {
			System.out.println("Obj "+ i++);
			System.out.println(data);
		}
		System.out.println(list.size());

	}

	public static List<Object[]> getXlData() {
		
		//APACHE POI (XL read write)
		

		// XSSFWorkbook
		// XSSFSheet
		// rows
		// cols

		List<Model> list = new ArrayList<>();
		List<Object[]> list1= new ArrayList<>();

		try {
			String xlpath = ".\\data\\datasheet.xlsx";
			FileInputStream stream = new FileInputStream(xlpath);
			XSSFWorkbook workbook = new XSSFWorkbook(stream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int first = sheet.getFirstRowNum();
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(1).getLastCellNum();

			System.out.println(rows);
			System.out.println(cols);

			for (int r = 1; r <= rows; r++) {
				Model obj = new Model();

				for (int c = 0; c < cols; c++) {

					 XSSFRow row = sheet.getRow(r);
					 XSSFCell cell = row.getCell(c);

					if (cell.getCellType().toString().equals("STRING")) {
						System.out.print(cell.getStringCellValue());
						if (obj.country == null)
							obj.country = cell.getStringCellValue();						
						else if (obj.capital == null)
							obj.capital = cell.getStringCellValue();
						else if (obj.phone == null)
							obj.phone = cell.getStringCellValue();
						else if (obj.email == null)
							obj.email = cell.getStringCellValue();
						else if (obj.address == null)
							obj.address = cell.getStringCellValue();
						else if (obj.city == null)
							obj.city = cell.getStringCellValue();
						else if (obj.state == null)
							obj.state = cell.getStringCellValue();	
						
					} else if (cell.getCellType().toString().equals("BOOLEAN")) {
						System.out.print(cell.getBooleanCellValue());
					} else if (cell.getCellType().toString().equals("NUMERIC")) {
						System.out.print(cell.getNumericCellValue());
						if (obj.population == 0.0)
							obj.population = cell.getNumericCellValue();
						else if (obj.pin == 0)
							obj.pin = (int) cell.getNumericCellValue();
					}

				}
				// End of Inner for loop
				// My first Model data is ready so I need to push to list
				String country= obj.country;
				String capital=obj.capital;
				double population= obj.population;
				String phone = obj.phone;
				String email = obj.email;
				String address = obj.address;
				String city = obj.city;
				String state = obj.state;
				int pin = obj.pin;
				Object[] newObj = {country,capital,population,phone,email
						,city,address,state,pin};
				//list.add(obj);
				list1.add(newObj);

			} // End of Outer for loop

			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list1;
	}

}
