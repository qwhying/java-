package shangji20180928;
import java.util.*;
class Car{
	String name;//the owner's name
	double speed;//the present speed
	/*Construct a Car object*/
	Car(String n,double speed){
		name=n;
		this.speed=speed;
	}
	/*set new owner's name*/
	void changeName(String newname) {
		name=newname;
		System.out.println("����Ϊ:"+name);
	}
	/*set new speed*/
	void changeSpeed(double newspeed) {
		speed=newspeed;
		System.out.println("��ǰ����Ϊ:"+speed);
		
	}
	/*stop the car*/
	void stop() {
		speed=0;
		System.out.println("ͣ���󣬳���Ϊ:0");
	}
}
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("����",10);
	    car1.changeName("����");
		car1.changeSpeed(20);
		car1.stop();

	}

}
