package first;

public class dest {
	static String varl;
	static String varnm;
	static String var45="Where";	
	public static void getvar(){
		varnm=source.setvar();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getvar();
		System.out.println(var45);
		System.out.println(varnm);
		

	}

}
