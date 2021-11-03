package regular.inner.class_;

// Creating an Inner Class Object from Outside the Outer Class Instance code
public class Test {
	public static void main(String[] args) {
		// 1.
		MyOuter mo = new MyOuter();
		MyOuter.MyInner inner = mo.new MyInner();
		inner.seeOuter();
		
		// 2.
		MyOuter.MyInner inner2 = new MyOuter().new MyInner();
		inner2.seeOuter();
	}
}
