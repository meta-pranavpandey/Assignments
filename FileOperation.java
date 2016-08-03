import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class FileOperation {

	
	/**
	 * Accepts file path and name and read data for entities
	 * @param fileName 
	 * @return ArrayList<Entitiy>
	 */
	public ArrayList<Entity> readDataFromFile(String fileName){
		ArrayList<Entity> entityArrayList = new ArrayList<Entity>();
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String strLine;
			while( (strLine = bufferedReader.readLine() ) != null) {
				String[] entityDataArray = strLine.split(",");
				char tmp = entityDataArray[0].charAt(0);
				//check type of entity
				switch(tmp)
				{
					case 'p' :
						Entity entityP = new Person(entityDataArray[1],Integer.parseInt(entityDataArray[2]),entityDataArray[3]);
						entityArrayList.add(entityP);
						break;
					case 'o' :
						Entity entityO = new Organization(entityDataArray[1],entityDataArray[2]);
						entityArrayList.add(entityO);
						break;
					default :
						break;
				}
			}
			try {
				fileInputStream.close();
				bufferedReader.close();
				} catch(Exception ex) {
					System.out.println("Error: "+ex.getMessage());
				  }
		} catch(Exception ex){
			System.out.println("Error: "+ex.getMessage());
		  } 
		return entityArrayList;
	}
	
	
	/**
	 * Accepts file path and name and read data for relations b/w entities
	 * @param fileName
	 * @return ArrayList<String>
	 */
	public ArrayList<String> readRelationsFromFile(String fileName){

		ArrayList<String> stringArrayList = new ArrayList<String>();
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String strLine;
			while( (strLine = bufferedReader.readLine() ) != null) {
				stringArrayList.add(strLine);
			}
			try {
				fileInputStream.close();
				bufferedReader.close();
				} catch(Exception ex) {
					System.out.println("Error: "+ex.getMessage());
				  }
		} catch(Exception ex){
			System.out.println("Error: "+ex.getMessage());
		  } 
		return stringArrayList;
	}
}
