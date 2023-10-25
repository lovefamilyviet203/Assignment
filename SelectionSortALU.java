public class SelectionSortALU {
    public static void selectionSort(int[] arrayNumbers){
        int count = arrayNumbers.length;
        for (int i = 0;i < count; i++){
            // thuat toan nay - mau chot la can tim duoc min hoac max
            int minIdx = i;
            for (int j = i+1;j < count; j++){
                if(arrayNumbers[j] < arrayNumbers[minIdx]){
                    minIdx = j;
                    // tim duoc vi tri cua phan tu nho nhat (tim duoc phan tu nho nhat)
                }
            }
            // hoan doi vi tri giua cac cap so
            // dua thang nho nhat ve dau mang
            int temp = arrayNumbers[minIdx];
            arrayNumbers[minIdx] = arrayNumbers[i];
            arrayNumbers[i] = temp;
        }
    }
    public static void printResult(int[] array){
        System.out.println("Mang sau khi da duoc sap xep theo thuat toan Selection Sort");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
