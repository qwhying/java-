package shangji201809301;
class bankaccount{
	private int account;
	private double leftmoney;
	bankaccount(int acc,double m){
		account=acc;
		leftmoney=m;
	}
	public double getleftmoney() {
		return leftmoney;
	}
	public void savemoney(double money) {
		leftmoney+=money;
	}
	public void getmoney(double money) {
		if(money<=leftmoney)
		leftmoney-=money;
		else
			System.out.println("只能取："+leftmoney);
	}
}

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankaccount ba=new bankaccount(888123,1000);
		ba.savemoney(21000);
		System.out.println("存入21000元后余额为:"+ba.getleftmoney());
		ba.getmoney(11500);
		System.out.println("取出11500元后余额为:"+ba.getleftmoney());

	}

}
