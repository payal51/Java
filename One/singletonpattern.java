package One;

public class singletonpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
                             //            WRONG  SHOULD TRY ONE MORE TIME
}
class Mobile{
	private static Mobile mobobj;
	private Mobile() {
		
	}
	public static Mobile getinstance() {
		return mobobj;
}
	public static Mobile getMobobj() {
		return mobobj;
	}
	public static void setMobobj(Mobile mobobj) {
		Mobile.mobobj = mobobj;
	}}