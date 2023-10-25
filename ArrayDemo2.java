public class ArrayDemo2 {
    private boolean kiemTraSNT(int number){
        if(number<=1){
            return false;
        }
        if(number == 2){
            return true;
        }
        // Check from number 2 until the square root of the number to be checked
        for (int b =2; b <= Math.sqrt(number);b++){
            if(number % b == 0){
                return false;
            }
        }
        return true;
    }
    private int tongSNT(int[] numbers){
        int sum =0;
        for (int i:numbers){
            if(this.kiemTraSNT(i)){
                sum+=i;
            }
        }
        return sum;
    }
    private int demSNT(int[] numbers){
        int count = 0;
        for (int j:numbers){
            if(this.kiemTraSNT(j)){
                count++;
            }
        }
        return count;
    }
    private double tinhTBCSNT(int[] arrNumbers){
        double sumSNT=this.tongSNT(arrNumbers);
        int countSNT=this.demSNT(arrNumbers);
        return sumSNT/countSNT;
    }
    public static void main(String[] args){
        int[] numbers = {2, 5, 4, 8, 12, 11, 10, 9, 17};
        // Calculate the average of prime numbers in the array
        ArrayDemo2 demo = new ArrayDemo2();
        double result =demo.tinhTBCSNT(numbers);
        System.out.println(result);
    }
}
