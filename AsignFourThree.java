

class c{
	public void test(){
		System.out.println("Class C test");
	}
}

class  b extends c{
	public void test(){
		System.out.println("Class B test");
	}
}

class a extends b{
	
	public void test(){
		System.out.println("Class a test");
	}
	public void testcall(){
		//super.super.test(); shows error 
 		super.test(); // can call its parent only
	}

}

public class AsignFourThree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a obj = new a();
		obj.testcall();
		
		
	}

}
