import java.util.List;

public class SortList {

    public static void main(String[] arg) {

        SortList sortList= new SortList();
        /*List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(45,89,12,156,11,1,98,36,54));
        sortList.sortArrayList(list);
        System.out.println("Sorted list is:" + list);*/

        int arr[] = new int[] {45,89,12,156,11,1,98,36,54};
        sortList.sortArray(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public List<Integer> sortArrayList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int temp = 0;
                if (list.get(i) < list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }


    public int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] =  arr[j];
                    arr[j] =  temp;
                }
            }
        }

        return arr;
    }
}

