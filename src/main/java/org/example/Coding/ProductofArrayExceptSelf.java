package org.example.Coding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductofArrayExceptSelf {


    public void ProductOfArray(int[] arr) {
        int finalNas[]=new int[arr.length];

        for(int i=0;i< arr.length;i++){
            int totalMulRach=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j)
                totalMulRach*=arr[j];
            }
            finalNas[i]=totalMulRach;
        }
    for(int i=0;i<finalNas.length;i++){
        System.out.println(finalNas[i]);
    }
    }

    public void ProductOfArrayUsingprefixSufix  (int[] arr) {
        int n=arr.length;
        int[] prefix=new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            result[i]=prefix[i]*suffix[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
    }

    public void ProductOfArrayStream(int[] arr) {
        List<Integer> ans=IntStream.range(0,arr.length)
                .mapToObj(i->
                        IntStream.range(0,arr.length)
                                .filter(j->j!=i)
                                .map(j->arr[j])
                                .reduce(1,(a,b)->a*b))
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}

//nput: arr[] = [10, 3, 5, 6, 2]
//Output: [180, 600, 360, 300, 900]