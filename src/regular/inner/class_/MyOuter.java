package regular.inner.class_;

public class MyOuter {
	private int x = 7;
	
	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is: " + x);

			// To reference the inner class instance itself from within the inner class code, use this.
			System.out.println("Inner Class ref is: " + this);
			
			// To reference the "outer this" (the outer class instance) from within the inner class code, use NameOfOuterClass.this (example, MyOuter.this).
			System.out.println("Outer Class ref is: " + MyOuter.this);
		}
	}
	
	// Instantiating an Inner Class from Within the Outer Class
	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}
}
