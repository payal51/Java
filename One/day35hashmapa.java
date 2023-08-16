package One;
import java.util.HashMap;
import java.util.Map;
public class day35hashmapa {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Map<String, String> pet = new HashMap<String, String>();
		pet.put("feature", "bark");
		pet.put("color", "black");
		pet.put("type", "German shepherd");
		pet.put("age", "4");
		System.out.println(pet);
		
		for (Map.Entry<String, String> entry : pet.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
	}

		Map<String, String> students = new HashMap<String, String>();
		students.put("firstName", "payal");
		students.put("lastName", "devkota");
		students.put("rollNo", "07");
		students.put("age", "29");
		students.put("skills", "interact");
		
		for(String prop:students.keySet()) {
			System.out.println(prop);
		}
		
		for(String prop:students.values()) {
			System.out.println(prop);
		}
		
		Map<String, String> baby = new HashMap<String, String>();
		 baby.put("12month","crawl");
		 baby.put("18month","babble");
		 baby.put("24month","talk");
		System.out.println( baby);
		
		System.out.println( baby.get("12month"));
		for(String key : baby.keySet()) {
			System.out.println(key);
			System.out.println( baby.get(key));
		}
		
		
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		

