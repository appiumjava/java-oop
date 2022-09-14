package lab_03;

public class lab3_1 {
    public static void main(String[] args) {
        int[] myIntArr = new int[]{1, 2, 3, 4, 5};
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < myIntArr.length; i++) {
            if (myIntArr[i]%2==0){
                evenCount++;
            }else oddCount++;
        }
        System.out.println("Total even number: "+ evenCount);
        System.out.println("Total odd number: "+ oddCount);
    }
}
