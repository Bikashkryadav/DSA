public class bubble_sort {
    public static void main(String[] args) {
        int[] my_array = { 2, 13, 4, 55, 76, 55, 76, 1, 3, 5, 4 };
        int n = my_array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(my_array[j]>my_array[j+1]){
                    int temp = my_array[j];
                    my_array[j]=my_array[j+1];
                    my_array[j+1]=temp;
                }
            }
        }
        for(int k=0; k<=n-1;k++){
            System.out.print(my_array[k]+" ");
        }
    }
}