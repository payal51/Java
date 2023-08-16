package One;

import java.util.HashMap;

public class day37c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String ,Integer> patient = new HashMap<>();
		
       patient.put("steve", 30);
       patient.put("stella", 40);
       patient.put("pragya", 25);
       patient.put("jose", 22);
       patient.put("henry", 27);
		System.out.println(patient);
		
		
			
			for(int pat : patient.values()) {
				System.out.println(pat);
			}
	}
	}

