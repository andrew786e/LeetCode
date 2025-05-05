class Solution {
    public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> freqChar = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Deque<int[]> deque = new ArrayDeque<>(); 

        int time = 0;

        // Count frequencies
        for (char task : tasks) {
            freqChar.put(task, freqChar.getOrDefault(task, 0) + 1);
        }

        // Load frequencies into maxHeap
        freqChar.forEach((k , v) -> {
            maxHeap.add(v) ; 
        }) ;

        // Run simulation
        while (!maxHeap.isEmpty() || !deque.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()) {
                int freq = maxHeap.poll() - 1; 
                if (freq > 0) {
                    deque.addLast(new int[]{freq, time + n}); 
                }
            }

            // Check if any task in cooldown is ready
            if (!deque.isEmpty() && deque.peekFirst()[1] == time) {
                maxHeap.add(deque.pollFirst()[0]);
            }
        }

        return time;
    }
}
