import java.util.Random;

public class main {
    public static void main(String[] args){
        Random random=new Random();
        int size=10;
        int max;
        int[]d=new int[size];
        for (int i = 0; i <size; i++) {
            d[i]=random.nextInt(1,100);

        }
        for (int i = 0; i <size ; i++) {
            System.out.print(d[i]+" ");
        }
        max=d[0];
        for (int i = 0; i <size ; i++) {
            if(max<d[i]){
               max=d[i];

            }
        }
        System.out.println( );
        System.out.println(max);

    }

}
