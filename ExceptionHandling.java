class ExceptionHandling{
	public static void main(String[] args){

	try{

	int a=9;
	int b=0;

	System.out.println(a/b);
	
	 catch(ArithmeticException e){
		System.out.println("Cannot divide by zero");
	}

	}
}
