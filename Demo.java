
class Test1{
	
	int x, y;
	
	Test1(){	
		x = 1000;
		y = 2000;
	}
	
	Test1(int x, int y){
		this.x =x;
		this.y =y;
	}
}
 
class Test2 extends Test1{
	
	int a, b;
	Test2(){
		a = 3000;
		b = 4000;
	}
	Test2(int a, int b){
		this.a = a;
		this.b = b;
	}
	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);	
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Test2 t2 = new Test2(9,99);
		t2.disp();
	
	}

}
