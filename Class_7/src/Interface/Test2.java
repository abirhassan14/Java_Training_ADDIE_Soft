package Interface;

public class Test2 implements Test{
	// Here implements is used to override "Test" interface
	
	
	@Override
	public int addvalue(int a, int b, int c) {
		
		return (a+b+c);
	}

	@Override
	public int subvalue(int a, int b) {
		
		return (a-b);
	}
	
	@Override
	public int multivalue(int a, int b) {
		
		return (a*b);
	}

	
}
