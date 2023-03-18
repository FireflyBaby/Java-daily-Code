package com.itche.chapter03;

public class UnitArray {
    private int sum;
    private int max;
    private int min;
    private double avg;
    public UnitArray(int arr[]){
        this.max=arr[0];
        this.min=arr[0];
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (this.max>arr[i]){
                this.max=arr[i];
            }
            if (this.min<arr[i]){
                this.min=arr[i];
            }
        }
        avg=sum/arr.length;


    }

    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getAvg() {
        return avg;
    }
    public void printArray(int temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
