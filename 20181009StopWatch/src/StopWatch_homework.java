import java.util.*;
public class StopWatch_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] int_array=new int[100000];
		Random random=new Random();
		for(int i=0;i<100000;i++)//����һ��100000�������������
		{
			int k=random.nextInt(11);//��1-10�������
			int_array[i]=k;
		}
		StopWatch sw=new StopWatch();//��ʼ��ʱ
		sw.start();//��ʼ��ʱ
		for(int i=0;i<100000;i++)//ѡ������
		{
			for(int j=i+1;j<100000;j++)
				if(int_array[i]<int_array[j]) {
					int t;
					t=int_array[i];
					int_array[i]=int_array[j];
					int_array[j]=t;
				}
		}
		sw.stop();//ֹͣ��ʱ
		System.out.println("����100000�������������ˣ�"+sw.getElapsedTime()+"���롣");
		
		

	}

}
class StopWatch{//�����
	long startTime;
	long endTime;
	StopWatch(){
		startTime=System.currentTimeMillis();
		endTime=0;
	}
	void start() {//��ʼ��ʱ
		startTime=System.currentTimeMillis();
	}
	void stop() {//ֹͣ��ʱ
		endTime=System.currentTimeMillis();
	}
	long getElapsedTime() {//���س���ʱ�䣨���룩
		return endTime-startTime;
	}
	
}
