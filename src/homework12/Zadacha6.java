package homework12;

public class Zadacha6 {
    public static void main(String[] args) {
        int start = 32;
        int end = 126;
        for (int i = start; i <= end; i++){
            int num = i;
            char c = (char) i;
            System.out.println(num+ "  :  " +c+ "  ");
        }
    }
}
