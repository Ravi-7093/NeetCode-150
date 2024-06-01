class KthLargest {
    private PriorityQueue<Integer> heap ; //initialize the minheap
    private static int k;
    
    
    public KthLargest(int k, int[] nums) {
        this.k=k;
        heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.offer(num); // create minheap so that we can order elements in ascending order
        }
        while(heap.size()>k){
            heap.poll(); // remove the first least element so we can get the 3rd largest element
        }
        
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>k){
            heap.poll();
        }
        return heap.peek();
    }
  
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
