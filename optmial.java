import java.util.PriorityQueue;
import java.util.Collections;

 class optimal{
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;

     
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) minHeap.add(num);
        for (int i = 1; i < k; i++) minHeap.poll();
        int kthSmallest = minHeap.peek();

    
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) maxHeap.add(num);
        for (int i = 1; i < k; i++) maxHeap.poll();
        int kthLargest = maxHeap.peek();

        System.out.println("Kth Smallest Element: " + kthSmallest);
        System.out.println("Kth Largest Element: " + kthLargest);
    }
}
