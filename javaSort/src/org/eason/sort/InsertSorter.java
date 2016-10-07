package org.eason.sort;

/**
 * @Title:  直接插入排序
 * @Description:  直接插入排序 有N条数据需要N-1中间排序 思路简单效果较好
 *                如果数据是无规则,需要移位的数据非常多,效果下降
 * Created by eason_hoo on 16/8/7.
 */
public class InsertSorter extends BaseSorter {

    @Override
    public void sort(int[] array) {

        int temp;

        for (int i = 1; i < array.length; i++){

            temp = array[i]; //记录最外层当前的循环的i值

            if(array[i] < array[i - 1]){ //当array[i] < array[i-1]值需要做交换

                int j = i - 1;

                //当array[i] < array[i-1]需要和有序区挨个比较移位
                while (j >= 0 && temp < array[j]){

                    //当前值小于有序数据最大值,有序数据向后移一位
                    array[j + 1] = array[j];
                    //有序数组挨个比较
                    j--;
                }
                //如果是array[0]不用移位
                array[j + 1] = temp;
            }
        }
    }
}
