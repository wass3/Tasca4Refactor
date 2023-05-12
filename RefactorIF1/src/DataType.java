import javax.swing.*;

public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }
    public static String gd(int code){

        switch (code) {
            case 702, 1082, 1083, 1114, 1184, 1266, 12403 -> {
                return "DATE";
            }
            case 20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3724, 2769, 12396 -> {
                return "NUMERIC";
            }
            default -> {
                return "STRING";
            }
        }
    }
}