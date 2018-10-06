package shangji20180921;

public class chengfabiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"=");
				System.out.printf("%-2d ", i*j);
			}
		System.out.print("\n");
		}

	}

}
