public class lowest_num_arr {
    public static void main(String[] args) {
        int[] numbers = {2,5,4,5,3,76,87,5};
        int num = numbers[0];
        for(int i=0; i < numbers.length; i++) {
            if(num > numbers[i] ){
                num = numbers[i];
            }
        }
        System.out.println("the lowest number in the array is "+num);
    }
}
