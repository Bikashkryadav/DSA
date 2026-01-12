public class bubble_sort {
    public static void main(String[] args) {
        int[] arry = {2,1,35,465,3,11,3};
        int big = arry[0];
        for (int i=0; i <= arry.length ;i++) {
            for(int j= 0; j<= arry.length; j++){
                if(arry[j] > arry[j+1]){
                    System.out.println(arry[j]);
                }
            }
        }
    }
}