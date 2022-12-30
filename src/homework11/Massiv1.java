package homework11;

public class Massiv1 {
    public static void main(String[] args) {
        int[] arr ={ -15, 6, -11, -13, 3, 9};
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]>0){
                System.out.println("Первый положительный элемент массива = " + arr[i] + "  номер элемента" +i);
                break;
            }

        }
    }
}
