package collectionconcept;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

public class testcase02 {
	public static void main(String[] args) {
		
	Data data = null;		
	List<Data> dataObj = new ArrayList<Data>();
	
	data = new Data();	
	data.Asset_Value="5465462.36";
	data.Market_Value="102.102";
	data.Wealth_Value="103.103";
	dataObj.add(data);
		
	data = new Data();	
	data.Asset_Value="999.999";
	data.Market_Value="888.888";
	data.Wealth_Value="777.000";
	dataObj.add(data);	
	
	testcase02.WriteJson(dataObj);	
	System.out.println(" ** Write Json end ** ");
	
	testcase02.ReadJson();
	
	
	}
	
	public static void WriteJson(List value){
		try{
			File file = new File("E:\\JavaProject\\Demo1\\TestProject\\jsonfile\\file1.json");		
			ObjectMapper mapper = new ObjectMapper();		
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, value);
		}catch(Exception e){
			System.out.println(" json file missing");
		}
	}
	
	public static void ReadJson(){
		
		try{
			File file = new File("E:\\JavaProject\\Demo1\\TestProject\\jsonfile\\file1.json");
			ObjectMapper mapper = new ObjectMapper();
			//mapper.readValue(file, null);
						
		}catch(Exception e){
			
		}
		
		
	}
	

}
