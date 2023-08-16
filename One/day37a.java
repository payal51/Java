package One;

import java.util.Arrays;
import java.util.List;

public class day37a {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("niranjan","","payal","sanat","","nivaan", "");
		System.out.println(names.stream().filter(x -> x.isEmpty()).count());

		
		System.out.println(names.stream().filter(x -> x.isEmpty()).toList());
		
		System.out.println(names.stream().filter(x -> !x.isEmpty()).toList());
		
		System.out.println(names.stream().filter(x -> x.contains("i")).toList());
		
		System.out.println(names.stream().filter(x -> x.length() > 5).toList());
		
		
		
		
		
		List<Integer> amount = Arrays.asList(200, -500, 350, 450, -700,-890, 1, 101, -506);
		
		System.out.println(amount.stream().filter(amo -> amo >0).toList());
		System.out.println(amount.stream().filter(amo -> amo < 0).toList());
		
		List<String> park =Arrays.asList("o'neil","HOLLYWOOD","santiago","orange county","Craig");
		System.out.println(park.stream().map(x -> x.toUpperCase()).toList());
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers.stream().map(x -> x * 3).toList());
		
		
		List<Integer> salary = Arrays.asList(5400,6400,7500,8800,9900);
		System.out.println(salary.stream().map(x -> x * 2).toList());
		
		System.out.println(salary.stream().map(x -> x + x * 0.10).toList());
		
	}

}
