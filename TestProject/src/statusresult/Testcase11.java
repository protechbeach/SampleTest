package statusresult;

public class Testcase11 {

	public static void main(String[] args) {
	String result = Testcase11.findStatus(" value 3", "value 3", " vaLUe 3", " value 3", "Value 3");
	System.out.println("Result is : "+result);	
	}
	
	public static String findStatus(String s1, String s2, String s3, String s4, String s5){
		String status = "Pass";	
		String arr[] = new String[5];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		arr[3]=s4;
		arr[4]=s5;
		
		String baseValue = arr[0].trim();
		
		for(int i=1; i<arr.length;i++){	
			if(!arr[i].trim().equalsIgnoreCase(baseValue)){
				status = "Fail";
			}
		}
		return status;
	}

}
