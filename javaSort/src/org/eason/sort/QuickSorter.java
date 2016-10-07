package org.eason.sort;

/**
 * @Title: 快速排序
 * @Package ${package_name}
 * @Description: 快速排序 是冒泡排序的改进型,效率更高
 *               冒泡排序 数据之间的比较次数太多,快速排序是
 *               找到一个中间值把数据分成两等份把的比其小的放
 *               左手边 比其大放右手边
 * Created by eason_hoo on 16/9/4.
 */
public class QuickSorter extends BaseSorter {


    @Override
    public void sort(int[] array) {
        this.quickSort(array,0, array.length - 1);
    }

    /**
     * 交换两个数据值
     * @param arr
     * @param i
     * @param j
     */
    private  void  swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]   = arr[j];
        arr[j]   = temp;
    }

    /**
     * 查询基准值
     * @param arr  原始值
     * @param left
     * @param right
     */
    private int  partition(int[] arr, int left, int right){

        /**默认最左边为基准值**/
        int pointV = arr[left];
        while (left < right){

            /**从右边开始和基准值比较, 如arr[n-i] >= 基准值pointV 索引值right-- 否则交换和基准值交换**/
            while (left < right && arr[right] >= pointV)
                    right--;
            this.swap(arr,left,right);

            /**从d左边开始和基准值比较, 如arr[n-i] <= 基准值pointV 索引值left++ 否则交换和基准值交换**/
            while (left < right && arr[left] <= pointV)
                 left++;
            this.swap(arr,left,right);
        }
        return  left;
    }

    /**
     * 递归快速排序
     * @param arr
     * @param left  左边最小序号
     * @param right 右边最大序号
     */
    private void  quickSort(int[] arr, int left,int right){

        if (left < right){
            /**确定基准值下角标值pointV**/
            int pointV = this.partition(arr,left,right);
            /**递归左遍历 left 至 pointV-1**/
            this.quickSort(arr,left,pointV - 1);
            /**递归右遍历 pointV+1 至 right**/
            this.quickSort(arr,pointV + 1,right);
        }
    }

}
