import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StringHandler {


    public static void main(String[] arg) throws Exception {
        StringHandler stringHandler = new StringHandler();
        //stringHandler.printWordsAsPerNumbers();
        //stringHandler.printUniqueCharacters();
        //stringHandler.sumOfNumberValuesInString();
        int[] arr = {78,21,1,98,125,1,45,14,26};
        stringHandler.nthHighestInArray(arr,8);
    }

    public void nthHighestInArray(int[] arr, int num) throws Exception{
        Set<Integer> set = new TreeSet();
        int length= arr.length;
            for (int i = 0; i < length; i++) {
                set.add(arr[i]);
            }
            System.out.println("Sorted Array is: " + set);
            Object[] sort = set.toArray();
            System.out.println(num + " highest is: " + sort[sort.length - num]);
    }


    public void printUniqueCharacters() {
        String s1 = "himanshu";
        char[] ch = s1.toCharArray();
        String finalString = "";

        Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

        for (char c : ch) {

            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {

                mp.put(c, 1);

            }
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {

            if (entry.getValue().equals(1)) {

                finalString = finalString + entry.getKey();

            }
        }

        System.out.println(finalString);

    }


    public void printWordsAsPerNumbers() {
        String strg = "2(AB)3(CD)1(EF)2(GH)";
        String finalString = "";
        String[] str = strg.split("[)]", 0);

        for (String s : str) {
            String str1 = s.replaceAll("[(){}]", "");
            String str2 = str1.replaceAll("[0-9]", "");
            int num = Integer.parseInt(str1.replaceAll("[^0-9]", ""));
            String newString = "";

            for (int i = 0; i < num; i++) {
                newString = newString + str2;
            }

            finalString += newString;
        }
        System.out.println("Final String is: " + finalString);
    }


    public void sumOfNumberValuesInString() {
        String str = "ab,;',cd56ef$%#g34h&&^ijSDFASF20";
        int total = 0;
        String[] strNum = str.split("[^0-9]");

        for (String s : strNum) {
            if (!s.isEmpty()) {
                int number = Integer.parseInt(s.trim());
                total += number;
            }
        }

        System.out.println("Total of numbers in the String is: " + total);
    }
}
