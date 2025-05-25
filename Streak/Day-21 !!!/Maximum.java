package Arrays;

public class Greatest {
    public static void main(String[] args) {
        int[] list = {1,75,34,87,34,78,34,65,32};

        System.out.println(max(list));
        }
        static int max(int[] arr) {
            int maxe= arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxe) {
                    maxe = arr[i];
                }

            }
            return maxe;

        }
}
