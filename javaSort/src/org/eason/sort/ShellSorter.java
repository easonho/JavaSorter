package org.eason.sort;

/**
 * @Title: 希尔排序
 * @Package ${package_name}
 * @Description: 希尔排序 是插入排序的升级版
 *               希尔排序首先将数据分成N份序列,再将每一等份按个比较
 *               当最后只能分成一个序列是使用插入排序再次排序
 *               希尔排序产生的移位比较少,效率比较高
 * Created by eason_hoo on 16/9/4.
 */
public class ShellSorter extends BaseSorter{

    @Override
    public void sort(int[] array) {

        //数据分成2等份
        for (int r = array.length/2; r >=1; r /= 2){

            //插入排序的内部排序
            for (int i = r; i < array.length; i++){

                int temp = array[i];
                int j = i - r;

                //是否需要移位
                if(array[i] < array[j]){

                    while (j >=0 && array[i] < array[j] ){

                        //跨度距离为r 进行移位
                        array[j+r]  = array[j];
                        j -= r;
                    }
                    array[j + r] = temp;
                }
            }
        }
    }
}
