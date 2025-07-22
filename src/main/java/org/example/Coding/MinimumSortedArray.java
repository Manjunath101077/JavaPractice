package org.example.Coding;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinimumSortedArray {
    public void minimumSorted(int[] arr) {
        int first=arr[0];
        for(int i=0;i<arr.length;i++){
            first=Math.min(first,arr[i]);
        }
        System.out.println(first);
    }

    public int minimumSortedBinary(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            if (arr[first] < arr[last]) {
                return arr[first]; // already sorted segment
            }
            int mid = first + (last - first) / 2;
            if (arr[mid] > arr[last]) {
                first = mid + 1;
            } else {
                last = mid;
            }
        }

        return arr[first]; // or arr[last], both are same now
    }
    public void minimumSortedStream(int[] arr) {
        OptionalInt finalMinimum= Arrays.stream(arr).min();
        System.out.println(finalMinimum.getAsInt());
    }
}
