package production;

public class beltTest {
	 private String name;
	
	public static void main(String args[]){
		beltTest a = new beltTest();
		beltTest b = new beltTest();
		beltTest c = new beltTest();
		beltTest d = new beltTest();
		beltTest e = new beltTest();
		a.name = "Tyler";
		b.name = null;
		c.name = null;
		d.name = "Matt";
		e.name = "Steve";
		Belt.loadBelt(a);
		Belt.loadBelt(b);
		Belt.loadBelt(b);
		Belt.loadBelt(d);
		Belt.loadBelt(e);
		Belt.packBox(2);
	}
		
}

