public class MergeSortALU {
    private static void mergeSort(int[] arr, int l, int r, int m){
        // can tim kich thuoc cua hai mang con ban dau duoc tach
        int n1 = m - l +1;
        int n2 = r - m;
        // mang con thu nhat : arr[l...mid]
        // mang con thu hai : arr[mid+1...r]
        // tao cac mang con ben trai va ben phai
        // khai bao mang rong voi kich thuoc co dinh san
        int[] Left = new int[n1];
        int[] Right = new int[n2];
        // copy du lieu vao hai mang con trai- phai vua tao
        for (int i =0; i < n1; i++){
            Left[i]= arr[l+i];
        }
        for (int j =0; j<n2; j++){
            Right[j] = arr[m+1+j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i< n1 && j < n2){
            if(Left[i] <=Right[j]){
                arr[k] = Left[i];
                i++;
            }else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]= Right[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] arr, int l, int r){
        if(l<r){
            int m = l + (r-l)/2;
            // De quy lai
            MergeSortALU.sort(arr, l, m);
            MergeSortALU.sort(arr, m+1, r);

            // Goi ham merge da viet
            MergeSortALU.mergeSort(arr, l, m, r);
        }
    }
    public static void printResult(int[] array){
        System.out.println("Mang sau khi duoc sap xep voi thuat toan Merge Sort");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
