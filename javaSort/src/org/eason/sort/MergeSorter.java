package org.eason.sort;

/**
 * @Title:  归并排序
 * @Package ${package_name}
 * @Description: 归并排序:
 *              将两个或者两个以上的有序列表合并成为一个有序的列表
 *              在排序中 先是将无序列表分割成多个序列, 如果分别排序
 *              最后排序完成,合并序列
 *
 * Created by eason_hoo on 16/10/7.
 */
public class MergeSorter extends BaseSorter {

    @Override
    public void sort(int[] array) {

        //需要同等的空间大小
        int[] temp = new int[array.length];

        this.mergeSort(array,temp,0,array.length-1);

    }

    /**
     * 合并排序算法
     * @param arr
     * @param temp
     * @param left
     * @param right
     */
    private  void  mergeSort(int[] arr, int[] temp, int left, int right){


        /**中间分隔值**/
        int mid = (left + right)/2;

        if (left == right) return;

        /**将数组分为两组子序列**/
        mergeSort(arr,temp,left,mid);
        mergeSort(arr,temp,mid + 1, right);

        int i,j,k;

        /**复制左序列**/
        for ( i = mid; i>=left; i--){
            temp[i] = arr[i];
        }

        /**复制右序列**/
        for (j = 1; j <= right - mid; j++){
            temp[right-j+1] = arr[mid + j];
        }


        /**合并两个子序列**/
        for (i = left,j = right,k = left;k <= right;k++)
        {
            if (temp[i]<temp[j])
                arr[k] = temp[i++];
            else
                arr[k] = temp[j--];
        }
    }

}
