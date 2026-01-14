//pattern rectangle 
public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 0; i<=5; i++){
            for (int j = 0; j <=5 ; j++) {// run five times then go loop i again and again until the i loop fail the condition i<=5
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
