package designpattern;

	class Singleton {
	private static Singleton instance=null;
	
	private Singleton() {
		System.out.println("This is inside the Singleton private constructor");
	}
	
	public static Singleton hello()
	{
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
}