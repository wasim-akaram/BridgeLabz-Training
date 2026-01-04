package com.stackandqueue;



import java.util.LinkedList;
import java.util.Deque;


class SlidingWindowMaximum 
{

    public static int[] maxSlidingWindow(int[] arr, int k) 
    {

        if (arr == null || k <= 0)
            return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Store result once window is formed
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }
}
