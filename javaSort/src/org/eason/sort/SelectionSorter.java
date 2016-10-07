package org.eason.sort;

/**
 * @Title: 选择排序
 * @Package org.eason.sort
 * @Description: 选择排序 N条数据 需要N-1中间交换 执行的步骤长 效率不高
 *
 * Created by eason_hoo on 16/9/4.
 */
public class SelectionSorter extends BaseSorter {

    int temp;       //交换使用中间变量
    int index;      //记录有序下角标

    @Override
    public void sort(int[] array) {

        //有N个元素 需要N - 1 次循环
        for(int i = 0; i < array.length-1; i++){
            index = i;
            for (int j = i+1; j < array.length; j++){
                //当有序数组最大值大于无序数组值需要发生交换
                if(array[index] > array[j]){
                    index = j;
                }
            }
            //发生交换
            if (index != i){
                temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }
}
