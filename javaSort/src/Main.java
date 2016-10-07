import org.eason.sort.*;

public class Main {

    public static void main(String[] args) {

        int array[] = {94,34,26,9,0,37,55,5,68,83,90,12,65,76,49};

        /**
         * 直接插入排序
         */

//        InsertSorter sorter = new InsertSorter();
        /**
         * 直接选择排序
         */
//        SelectionSorter sorter   = new SelectionSorter();
        /**
         * 冒泡排序
         */
        //BubbleSorter    sorter         = new BubbleSorter();
        /**
         * 希尔排序
         */
//        ShellSorter sorter  = new ShellSorter();

//        QuickSorter sorter = new QuickSorter();


         MergeSorter sorter = new MergeSorter();


//         HeapSort sorter = new HeapSort();

         sorter.sort(array);

        for (int item : array) {
            System.out.println(item);
        }

    }
}
