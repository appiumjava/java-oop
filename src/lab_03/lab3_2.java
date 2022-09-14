package lab_03;

public class lab3_2 {
    public static void main(String[] args) {
        int[] myIntArr = new int[]{1, 2, 3, 4, 5};
        int max = myIntArr[0];
        int min = myIntArr[0];
        for (int i = 0; i < myIntArr.length; i++) {
            if (max<myIntArr[i]){
                max=myIntArr[i];
            }
            if (min>myIntArr[i]){
                min=myIntArr[i];
            }
        }
        System.out.println("Maximum number:" + max);
        System.out.println("Min:" + min);
    }
}
