package over;

public class overload {

	public static int Sum (int num, int num2) {
	
	return num+num2 ;
	}

	public static int Sum (int num, int num2,int num3) {
	
	return num+num2+num3 ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload total=new overload ();
	
		
	int result2=total.Sum (5,6,7);
		int result=total.Sum (3,4);
		System.out.println (result+" "+result2);

	}

}
