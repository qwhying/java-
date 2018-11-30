package ex;

import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages_pt_BR;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static <E extends Comparable<E>> void SelectionSort(E[] list)
    {
        for(int i=0;i<list.length-1;i++) {
            E currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //交换list[i]和list[currentMinIndex]如果当前最小的不是第i个的时候
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
    public static <E extends Comparable<E>> void InsertionSort(E[] list)
    {
        for(int i=1;i<list.length;i++) {//外层向右的index，即作为比较对象的数据
            E temp = list[i];//用作比较的数据
            int leftindex = i - 1;
            while (leftindex >= 0 && list[leftindex].compareTo(temp) > 0)
            {//当比到最左边或者遇到比temp小的数据时，结束循环
                list[leftindex+1]=list[leftindex];
                leftindex--;
            }
            list[leftindex+1]=temp;//把temp放到空位上
        }

    }
}
