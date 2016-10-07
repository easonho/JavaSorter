package org.eason.sort;

/**
 * @Title: 排序算法堆排序
 * @Package ${package_name}
 * @Description: 堆排序
 * 由n条数据无序序列构成大顶堆,从n/2 开始向上(树根)调整堆,最后得到一个最大顶堆
 * Created by eason_hoo on 16/10/6.
 */
public class HeapSort extends BaseSorter {

    @Override
    public void sort(int[] array) {
        this.inPlaceHeapSort(array);
    }

    /**
     * 1.大顶堆创建
     * 2.首个数据和末尾数据交换后调整
     */
    private void  inPlaceHeapSort(int[] arr){
        int length = arr.length;

        /**建立最大顶堆**/
        for (int i = length/2; i > 0; i--){
            this.heapAdjust(arr,i,length);
        }

        for (int j = 0; j < length; j++){
            /**交换堆顶元素arr[0]和堆中最后一个元素array[arr.length-1-j] **/
            int temp = arr[0];
            arr[0]   = arr[arr.length-j-1];
            arr[arr.length-j-1]   = temp;
            this.heapAdjust(arr,0,arr.length-j-1);
        }


    }

    /**
     * 堆排序的数据调整
     */
    private void heapAdjust(int[] arr, int parent, int size){

        int child = parent * 2 + 1;

        while (child < size){

            /**比较左右节点,取最大值下角标(找到比当前待调整结点大的孩子结点)**/
            if(child + 1 < size && arr[child + 1] > arr[child]){
                child ++;
            }

            /**孩子结点大于当前待调整结点，将孩子结点放到当前待调整结点的位置上**/
            if(arr[child] > arr[parent]){


                int temp    = arr[child];
                arr[child]  = arr[parent];
                arr[parent] = temp;

                /**重新调整一下索引**/
                parent = child;
                child  = parent * 2 + 1;

            }else {
                /**如果当前待调整结点大于它的左右孩子，不需要调整，直接退出**/
                break;
            }
        }
    }
}
