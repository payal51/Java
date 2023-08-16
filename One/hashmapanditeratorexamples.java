package One;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmapanditeratorexamples {

	public static void main(String[] args) {
		
HashMap <String, Integer> hashmap1 =new HashMap<>();
System.out.println(hashmap1);

// add 
            
hashmap1.put("pragya", 1100); 
hashmap1.put("shreya", 2000); 
hashmap1.put("shraddha", 3000); 
System.out.println(hashmap1); 

//update  
hashmap1.put("shraddha",7700); 
System.out.println(hashmap1); 

//getting the value (retrive) 
int a = hashmap1.get("pragya"); 
System.out.println(a); 

hashmap1.remove("pragya"); 
System.out.println(hashmap1); 

// Allow duplicate keys ?? 

hashmap1.put("shreya", 900); 
System.out.println(hashmap1); 
 
// how many key-values are there  
 
System.out.println(hashmap1.size()); 
 
HashMap<String , String> hashMap2 = new HashMap<>(); 
hashMap2.put("madhesh", "janakpur"); 
hashMap2.put("bagmati", "hetauda"); 
hashMap2.put("koshi", "biratnagar"); 
hashMap2.put("gandaki", "pokhara"); 
// To check whether a key exist or not ?? 
 System.out.println(hashMap2);
 
 
if(hashMap2.containsKey("madhesh")) { 
 System.out.println(hashMap2.get("madhesh")); 
} 
 
if(hashMap2.containsValue("pokhara")) { 
 System.out.println("value available ..."); 
} 

//containskey() and containsvalue -- return boolea values  

for(String key:hashMap2.keySet()) { 
 System.out.println(key); 
 System.out.println(hashMap2.get(key)); 
} 

System.out.println(hashMap2.keySet()); 
System.out.println(hashMap2.values()); 

for(Map.Entry<String, String>entry:hashMap2.entrySet()) { 
System.out.println(entry.getKey()+" "+entry.getValue()); 
} 

HashMap<String , String> hashMap3 = new HashMap<>(); 
hashMap3.put("niranjan","neupane"); 
hashMap3.put("payal","devkota"); 
hashMap3.put("smita","khanal"); 
hashMap3.put("subas","ranjit"); 

System.out.println(hashMap3); 
 
Iterator<Map.Entry<String, String>> abc = 
  hashMap3.entrySet().iterator(); 
 
while(abc.hasNext()) { 
 Map.Entry<String, String> entry = abc.next(); 
 System.out.println(entry.getKey()); 
 System.out.println(entry.getValue()); 
} 







	}

}
