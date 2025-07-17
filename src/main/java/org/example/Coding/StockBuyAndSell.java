package org.example.Coding;

public class StockBuyAndSell {

    public void stockBuyAndSell(int[] arr) {
        int maimumProfir=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]-arr[i]>maimumProfir)
                    maimumProfir=arr[j]-arr[i];
            }
        }
        System.out.println(maimumProfir);
    }
}
