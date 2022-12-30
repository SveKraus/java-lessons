package Homework3;

public class Homework1 {
    public static void main(String[] args){
        String iStudy = " I study Basic Java! ";
        System.out.println(iStudy);
        System.out.println(iStudy.charAt(iStudy.length() -1));
        System.out.println(iStudy.contains("java"));
        System.out.println(iStudy.replace("a", "o"));
        System.out.println(iStudy.toUpperCase());
        System.out.println(iStudy.toLowerCase());
        System.out.println(iStudy.substring(0, iStudy.indexOf("java")));

    }
}
