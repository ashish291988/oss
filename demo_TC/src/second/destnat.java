package second;

import first.source;

public class destnat {
	
	/**
	 * @param args
	 */
	static String varnm;
	static String var2;
	public static String processed_val(){
		var2="How";
		return var2;
	}
	public static void getvar(){
		varnm=source.setvar();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getvar();
		System.out.println(first.source.vr90);
		
		
		
		System.out.println(varnm);
	}

}
