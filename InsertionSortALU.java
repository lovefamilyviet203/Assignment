public class InsertionSortALU {
    public static void insertionSort(int[] arrNumbers){
        // So luong phan tu trong mang
        int count = arrNumbers.length;
        for (int i = 1; i < count; i++){
           // cac phan tu duoc duyet
            int key = arrNumbers[i];
            // vi i = 1: bat dau tu phan tu sau phan tu dau tien
            // j: vi tri cua cac phan tu dung truoc cac phan tu dang duoc duyet
            int j = i - 1;
            while (j>=0 && arrNumbers[j]>key){
                // neu nhu phan tu dung dang truoc cac phan tu dang duoc duyet ma lon hon thi thuc hien hoan doi vi tri
                arrNumbers[j+1] = arrNumbers[j];
                j--;
            }
            // tiep tuc doi vi tri dang duyet thanh vi tri dung dang sau de tiep tuc thuc thi kiem tra
            arrNumbers[j+1]=key;
        }
    }
    public static void printResult(int[] array){
        System.out.println("Mang sau khi da duoc sap xep theo thuat toan Insertion Sort");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
