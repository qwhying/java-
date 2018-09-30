package shangji201809301;

class myprogram{
	private int data;
	private String str;
	myprogram(int d,String s){
		data=d;
		str=s;
	}
	public void setData(int newdata) {
		data=newdata;
	}
	public int getData() {
		return data;
	}
	public void setStr(String newstr) {
		str=newstr;
	}
	public String getStr() {
		return str;
	}
	public String toStr() {
		System.out.println("The data is "+data);
		System.out.println("The str is "+str);
		return Integer.toString(data);
	}    
}
public class jioj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myprogram m1=new myprogram(12,"heihei");
		int data=m1.getData();
		m1.setData(8);
		String str=m1.getStr();
		m1.setStr("lala");
		m1.toStr();
		System.out.println("check now,the original data is "+data+"the original str is "+str);
	}

}
