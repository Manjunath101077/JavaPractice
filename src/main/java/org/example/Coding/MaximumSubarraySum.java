package org.example.Coding;

public class MaximumSubarraySum <T>{


    public void maximumSubarray(int[] arr) {
        int finalAns=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++) {
//                if(arr[i]+arr[j] >sum)
                    sum=sum+arr[j];
            }
            if(sum>finalAns){
                finalAns=sum;

                }
        }
        System.out.println(finalAns);
    }

//    Kadane's Algorithm (Best Approach - O(n)):

    public void maximumSubarrayKadane(int[] arr) {
        int maxSoFar=arr[0];
        int currentMax=arr[0];
        for(int i=1;i<arr.length;i++){
        currentMax=Math.max(arr[i],currentMax+arr[i]);
        maxSoFar=Math.max(currentMax,maxSoFar);
        }
        System.out.println(maxSoFar);
    }
}

//Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//Output: 11