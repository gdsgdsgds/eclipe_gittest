package LianXi;

import java.util.Scanner;
//hahahhaahahhahahahahahahahahhahah
public class QiuZhi {
	public static void main(String[] args) {
		Scanner rrr= new Scanner(System.in);
		double Area=0;
		double perumeter=0;
		double Volume=0;
		System.out.println("������Բ�İ뾶��");
		double r=rrr.nextDouble();
		Circle1 yuan= new Circle1();
		yuan =new Circle1(r);
		Area=yuan.getArea(r);
		perumeter=yuan.getPerimeter(r);
		System.out.println("������Բ���İ뾶�͸ߣ�");
		double r1=rrr.nextDouble();
		double h1=rrr.nextDouble();
		Cylinder zhu=new Cylinder();
		zhu =new Cylinder(r1,h1);
		Volume=zhu.getVolume(r1);
		show1(Area,perumeter,Volume);
	}
	public static void show1(double a,double b,double c){
		System.out.printf("Բ�����Ϊ��%f",a);
		System.out.printf("Բ���ܳ�Ϊ��%f",b);
		System.out.printf("Բ�������Ϊ��%f",c);
	}
}
class Circle1{
	private double  r;
	public  Circle1(double a){
		this.r=a;
	}
	public  Circle1(){
	}
	public double getArea(double A) {
		A=r*r*Math.PI;
		return A;
		
	}
	public double getPerimeter(double a) {
		a=2*r*Math.PI;
		return a;
		
	}

}
	class Cylinder{
		private double  r;
		private double  h;
		public Cylinder(double r,double h){
			this.r=r;
			this.h=h;
		}
		public Cylinder() {
			// TODO Auto-generated constructor stub
		}
		public double  getVolume(double d)  {
			d=r*r*h*Math.PI;
			return d;
			
		}
}
