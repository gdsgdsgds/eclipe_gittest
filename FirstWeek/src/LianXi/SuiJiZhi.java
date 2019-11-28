package LianXi;

public class SuiJiZhi {
	public static void main(String[] args) {
		int[] AC = new int[50];
		int Cont = 0;
		for(int i=0;i<50;i++) {AC[i]=(int)(100*Math.random());
			}
		max(AC);
		min(AC);
		cont(AC,Cont);
	}
private static void cont(int[] n, int Cont) {
		// TODO Auto-generated method stub
	int d=60;
	for(int i=0;i<50;i++) {
		if(n[i]>d) {
			Cont++;
		}else {
			continue;
			}
	}
		System.out.printf("大于60的数有：%d个",Cont);
	}
public static void max(int[] a) {
	int b=0;
	for(int i=0;i<50;i++) {
		if(a[i]>b) {
			b=a[i];
		}else {
			continue;
		}
	}
	System.out.println("max="+b);
	
} 
public static void min(int a[]) {
	int b=1000;
	for(int i=0;i<50;i++) {
		if(a[i]<b) {
			b=a[i];
		}else {
			continue;
		}
	}
	System.out.println("min="+b);
}
}
