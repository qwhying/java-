import java.util.*;
public class StopWatch_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] int_array=new int[100000];
		Random random=new Random();
		for(int i=0;i<100000;i++)//创建一个100000个随机数的数组
		{
			int k=random.nextInt(11);//从1-10的随机数
			int_array[i]=k;
		}
		StopWatch sw=new StopWatch();//开始计时
		sw.start();//开始计时
		for(int i=0;i<100000;i++)//选择排序
		{
			for(int j=i+1;j<100000;j++)
				if(int_array[i]<int_array[j]) {
					int t;
					t=int_array[i];
					int_array[i]=int_array[j];
					int_array[j]=t;
				}
		}
		sw.stop();//停止计时
		System.out.println("进行100000个数的排序用了："+sw.getElapsedTime()+"毫秒。");
		
		

	}

}
class StopWatch{//秒表类
	long startTime;
	long endTime;
	StopWatch(){
		startTime=System.currentTimeMillis();
		endTime=0;
	}
	void start() {//开始计时
		startTime=System.currentTimeMillis();
	}
	void stop() {//停止计时
		endTime=System.currentTimeMillis();
	}
	long getElapsedTime() {//返回持续时间（毫秒）
		return endTime-startTime;
	}
	
}
