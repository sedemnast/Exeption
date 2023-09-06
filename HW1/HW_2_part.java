package HW1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class HW_2_part {
    public static void main(String[] args) {
        try {
            callMethod6("");
            ArrayList<String> stringArrayList = (ArrayList<String>) callMethod1();
            int a = 10, b = 2;
            callMethod6("");
            int div = callMethod2(a, b);
            System.out.println(div);
            callMethod6("");
            callMethod3(stringArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArrayList) {
        callMethod6("");
        if (!stringArrayList.isEmpty()) {
            callMethod3(stringArrayList);
        }
    }

    private static ArrayList<String> callMethod1() throws IOException {
        callMethod2(100000000, 11 - 10);
        return new ArrayList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        try {
            FileInputStream fis = new FileInputStream("/Users/sedemnast/Downloads/Exeption/HW1/1.txt");
            fis.read();
            if (fis.available() > 0) {
                throw new RuntimeException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int num = callMethod4("1240"); // Changed "124O" to "1240"
        return a / b;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) { // Fixed the loop index
            strings[i] = s;
        }
    }
}
