package One;

public class day28enumb {


	public static void main(String[] args) {
		String exam = subject.NEPALI.getsubject();
		System.out.println(exam);

	}

}enum subject{
	SCIENCE, MATH, NEPALI, SOCIAL;
	
	public String getsubject() {
		switch(this) {
		case SCIENCE:
			return "science class";
		case MATH:
			return "math class";
		case NEPALI:
			return "nepali class";
		case SOCIAL:
			return "social class";
			default:
			
		return null;
	}}}
