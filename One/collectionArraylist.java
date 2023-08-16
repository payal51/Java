package One;
import java.util.ArrayList;
public class collectionArraylist {

	public static void main(String[] args) {
		ArrayList<String> flower = new ArrayList <>();
 flower.add("rose");
 flower.add("jasmine");
 flower.add("gurans");
 flower.add("marigold");
 
 System.out.println(flower);
 
 
 
 //Retrive
 String a = flower.get(0);
 String b = flower.get(1);
 String c = flower.get(2);
 String d = flower.get(3);
 
 System.out.println(a);
 System.out.println(b);
 System.out.println(c);
 System.out.println(d);
 
 
 //loop through this
 for (int i = 0; i<flower.size(); i++) {
	 System.out.println(i);
	 System.out.println(flower.get(i));
	 
	 System.out.println("******");
	 
	 //Update the value of arrraylist
	 ArrayList<String> insects = new ArrayList<>();
	 insects.add("mosquito");
	 insects.add("ant");
	 insects.add("dragonfly");
	 insects.add("cockroach");
	 System.out.println(insects);
	 
	 insects.set(3, "butterfly");
	 System.out.println(insects);
	 
	 //Deleting the value of arraylist
	 
	 insects.remove(1);
	 System.out.println(insects);
 }
	}

}
