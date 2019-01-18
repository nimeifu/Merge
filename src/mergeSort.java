public class mergeSort {
    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n-1, temp);
    }


    private static void mergeSortHelper(int[] arr, int from, int to, int[] temp)
    {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(arr, from, middle, temp);
            mergeSortHelper(arr, middle + 1, to, temp);
            merge(arr,from,middle,to,temp);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right,int[] temp)
    {
        int i=left;
        int j=mid+1;
        int k=left;

        while(i<=mid && j<=right)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<= mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            temp[k]=arr[j];
            j++;
            k++;

        }

        for (int x=left;x<=right;x++)
        {
            arr[x]=temp[x];
        }
    }
}


