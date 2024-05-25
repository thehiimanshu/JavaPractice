import java.util.Arrays;

public class ArrayMaxProduct {

        public static void main(String[] args) {
            int[] a1 = {5,2,4,9,2,-5,-10};
            int[] a2 = {6,1,5,8,1,-10,10};

            ArrayMaxProduct obj = new ArrayMaxProduct();

            int max1 = obj.max(a1);
            int max2 = obj.max(a2);

            int min1 = obj.min(a1);
            int min2 = obj.min(a2);

            int minSum = min1*min2;
            int maxSum = max1*max2;

            if(minSum>maxSum){
                System.out.println("Maximum product is: "+ minSum);
            }

            else{
                System.out.println("Maximum product is: "+ maxSum);
            }
        }

        public int max(int[] arr){
            int max=arr[0];
            for (int num : arr) {
                if(max<num){
                    max=num;
                }
            }
            return max;
        }
        public int min(int[] arr){
            int min=arr[0];
            for (int num : arr) {
                if(min>num){
                    min=num;
                }
            }
            return min;
        }

    }

