package laicode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class minHeapklargest {
    public int findKthLargest(int[] nums, int k) {
        // Write your solution here
        //assume k belongs to [1,array.length];
        if (nums == null || nums.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) {
                    return 0;
                }
                return (o1 > o2) ? 1 : -1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            //这里不写i<=k是记住i从0开始，已经有k个了
            if (i < k) {
                minHeap.offer(nums[i]);
                System.out.println(minHeap.peek());
            } else if(nums[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(nums[i]);
                System.out.println(minHeap.peek());
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] array = {8,10,2,7,4,2,13,19,6,3,3,4,5,0,-1,42,32,1,6,4};
        minHeapklargest m = new minHeapklargest();
        int res = m.findKthLargest(array, 3);
    }
}
