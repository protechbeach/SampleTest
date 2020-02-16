package collectionconcept;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class testcase01 {

	public static void main(String[] args) throws JsonIOException, IOException {
		
	List<Object> arr=new ArrayList<Object>();	
	arr.add("ABNC");
	arr.add("2301");
	arr.add('A');
	arr.add(123);
		
	Gson gobj = new Gson();	
	
	gobj.toJson(arr, new FileWriter("E:\\JavaProject\\Demo1\\TestProject\\jsonfile\\file.json"));
	
	String jsonvalue = gobj.toJson(arr);	
	System.out.println("Jsonvalue is :  "+jsonvalue);
	
	
	System.out.println(" *** END ***");
	}
}
