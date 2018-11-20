package com.company;

public class method {

    public void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n-1, temp);
    }

    public void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if (left<right)
        {
            int mid = (left+right)/2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid+1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(int[] elements, int left, int mid, int right, int[] temp)
    {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
}
