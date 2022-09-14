package lab_03;

public class lab3_4 {
    public static void main(String[] args) {
        int[] myIntArr1 = new int[]{1, 12, 16, 28, 34};
        int[] myIntArr2 = new int[]{1, 13, 16, 27, 99};
        int[] myIntArr3 = new int[myIntArr1.length + myIntArr2.length];

        for (int i = 0; i < myIntArr1.length; i++) {
            myIntArr3[i]=myIntArr1[i];
        }

        for (int i = 0; i < myIntArr2.length; i++) {
            myIntArr3[i+myIntArr1.length]=myIntArr2[i];
        }

        for (int i = 0; i < myIntArr3.length-1; i++) {
            for (int j = i + 1; j < myIntArr3.length; j++) {
                if (myIntArr3[i] > myIntArr3[j]) {
                    int t = myIntArr3[i];
                    myIntArr3[i] = myIntArr3[j];
                    myIntArr3[j] = t;
                }
            }
        }
        System.out.print("Array after sort: ");
        for(int value: myIntArr3) {
            System.out.print(value + " ");
        }
    }
}
