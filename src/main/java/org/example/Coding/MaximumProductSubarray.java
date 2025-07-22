package org.example.Coding;

public class MaximumProductSubarray {


//    public void maximumProductKadons(int[] arr) {
//
//        int currentMax=arr[0];
//        int maxProduct=arr[0];
//
//        for(int i=1;i<arr.length;i++){
//            currentMax=Math.max(arr[i],currentMax*arr[i]);
//            maxProduct=Math.max(maxProduct,currentMax);
//        }
//        System.out.println(maxProduct);
//    }
public void maximumProductKadons(int[] arr) {
    int maxiProduct=1;
    for(int i=0;i<arr.length;i++){
        int currentmaxi=1;
        for(int j=i;j< arr.length;j++){
            currentmaxi=currentmaxi*arr[j];
            if(currentmaxi>maxiProduct)
                maxiProduct=currentmaxi;
//            if()
        }
//        if(currentmaxi>maxiProduct)
//        maxiProduct=currentmaxi;
    }
    System.out.println(maxiProduct);
}
}
