
//Class within pkg2
/*class MyPackage{
	public void display() {
		System.out.println("This msg is from MyPackage class within pkg2");
	}
}*/



package pkg4;
import pkg.MyPackage;
import pkg2.MyPackage2;
import pkg3.MyPackage3;
public class TestMyPackage {

	public static void main(String[] args) {
		System.out.println("Package");
		MyPackage mypack1=new MyPackage();
		MyPackage2 mypack2=new MyPackage2();
		MyPackage3 mypack3=new MyPackage3();
		mypack1.display();
		mypack2.display();
		mypack3.display();
	}
}