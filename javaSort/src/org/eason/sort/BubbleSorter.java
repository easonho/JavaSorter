package org.eason.sort;

/**
 * @Title: 冒泡排序算法
 * @Package ${package_name}
 * @Description: 冒泡排序算法 有N个数据需要N-1次中间比较排序 执行的步骤长 效率不高
 * Created by eason_hoo on 16/9/4.
 */
public class BubbleSorter extends  BaseSorter {
    @Override
    public void sort(int[] array) {

        int temp;   // 交换使用临时表

        for (int i = 0; i < array.length;i++){

            for (int j = i + 1; j < array.length;j++){

                //从小到大排序,需要移位
                if(array[i] > array[j] ){

                    temp        = array[j];
                    array[j]    = array[i];
                    array[i]    = temp;
                }

            }
        }
    }
}
