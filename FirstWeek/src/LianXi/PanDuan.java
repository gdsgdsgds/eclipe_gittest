package LianXi;

import java.util.Scanner;

public class PanDuan {
	public static void main(String[] args) {
		String ad[]= {"one","two","three","four","five","six","seven","eight","nine","ten"};
		System.out.println("请输入一个测试单词：");
		Scanner shuru =new Scanner(System.in);
		String iuput=shuru.next();
		String temp=iuput;
		String temp2="-1";
		temp2=ceshi(temp2,ad,temp);
		if(temp2.equals("-1")) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}

	public static String ceshi(String a ,String[] ac,String b){	
		a="-1";
		for(int i=0;i<10;i++) {
			if(ac[i].equals(b)) {
				a=ac[i];
			}
		}
		return a;
		}
}
