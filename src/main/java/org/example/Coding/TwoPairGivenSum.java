package org.example.Coding;

import java.util.Arrays;
import java.util.HashSet;

public class TwoPairGivenSum {
    public static boolean twoPairGivenSumUsingLoop(int num, int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num)
                    return true;
                break;
            }
        }

        return false;
    }
    public static boolean twoPairGivenSumUsingSet(int num,int[] arr){

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int target=num-arr[i];
            if(set.contains(target))
                return true;
             set.add(arr[i]);
        }
    return false;
    }

    public static boolean twoPairGivenSumUsingBinary(int target,int[] arr){
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                last=mid-1;
            }else if(arr[mid]>target){
                first=mid+1;
            }
        }
        return false;
    }

    public static boolean twoPairGivenSumUsingTwoPoint(int num,int[] arr){
        Arrays.sort(arr);
        int left=0;int right= arr.length-1;
        while(left<=right){
            if(arr[left]+arr[right]==num){
                return true;
            }else if(arr[left]+arr[right]<num){
                    left++;
            }else if(arr[left]+arr[right]>num){
                right--;
            }
        }
        return false;
    }
}
//
//Input: arr[] = [0, -1, 2, -3, 1], target = -2
//Output: true
//Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
//
//Input: arr[] = [1, -2, 1, 0, 5], target = 0