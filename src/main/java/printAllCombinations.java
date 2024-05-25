

public class printAllCombinations {

    public static void main(String[] arg) {

        String str = "12345";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                String a = String.valueOf(str.charAt(i));
                String b = String.valueOf(str.charAt(j));

                if(!a.equals(b)) {
                    String combination = a.concat(b);
                    System.out.println(combination);
                }
            }
        }
    }

}
