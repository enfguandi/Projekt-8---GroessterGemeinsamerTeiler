
public class euclidOld {
	private int a = 0;
	private int b = 0;
	
	
	public void setA(int A) {
		this.a = A;
	}
	
	public void setB(int B) {
		b = B;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	
	public int berechne() {
		int x=a;
		int y=b;
		
		if(x==0) {
			return y;
		}else {
			while(y!=0) {
				if(x>y) {
					x = x-y;
				}else {
					y=y-x;
				}
			}
			return x;
		}
	}
	}
