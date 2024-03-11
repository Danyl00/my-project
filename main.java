import java.util.Random;
import java.util.Scanner;

public class main {

    //функція з параметром(аргументом)
    static void sayHello(int x){

        for (int  i = 0; i  < x ;i ++) {
            System.out.println("HI");
        }

    }
    //функція без параметрів (аргументів)
    static void SayHello(){

        System.out.println("Hello");

    }

    static void startPrint(int x ){
        for (int i = 1; i <= x; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    static void UserAdddNumbers(int c, int u , int x) {
        System.out.println((c + u) * x);
    }
    static void UserAddNumbers(int x,int y){
        System.out.println(x+y);

    }
    static int addNumbers(int x,int y){

        return x+y;
    }
    static int minus(int x,int y){
        return x-y;
    }
    static int multiply(int x , int y){
        return x*y;
    }
    static int split(int x , int y){
        return x/y;
    }

    static int square (int x){
        return x*x;
    }

    static int maxF(int x, int y){

        if(x>y){
            return x;
        }else {
            return y;
        }


    }
    static int average(int x,int y,int z){
       return(x+y+z)/3;
    }
    static void Print(int x ,int y ,int o){
            System.out.println((x+y+o)/3);





    }

    static void showArray (int []array){

        for (int i =0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }

static void fillArrey(int [] array){Scanner sk=new Scanner(System.in);
    for (int i = 0; i < array.length ; i++) {
        array[i]=sk.nextInt();

    }
}
static void FillAndShowArrey(int [] array){
    Scanner sk=new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
        array[i]=sk.nextInt();
    }
    for (int i = 0; i <array.length ; i++) {
        System.out.print(array[i]+" ");
    }
}
static void RandomArray(int [] array){
        Random rant=new Random();
    for (int i = 0; i <array.length ; i++) {
        array[i]= rant.nextInt(1,50);

    }
}

// Fix this code ******************************************************************
static void ViewArray(int[] Array){

    for (int i = 0; i < Array.length; i++) {
        System.out.println(Array [i]+ " ");
    }
}

static double  Pluss(double x, double y){

        return x+y;

}

static void SearchMaxElem(int []Array){
        int max=0;
    for (int i = 0; i < Array.length ; i++) {
        if(max < Array[i]){
            max=Array[i];
        }
    }
    System.out.println(max);

}

static int SeachMinElem(int []Array){
    int min=0;
    for (int i = 0; i < Array.length ; i++) {
        if(min > Array[i]){
            min=Array[i];
        }
    }
    System.out.println(min);
    return min;
}

//*******************************************************
public void myFunction (){
    System.out.println("hello");
}

public int AddNumbers(int a,int b){
        int result=a+b;
        return result;

}

public static void printInfo(String name){

    System.out.println("hi"+name);

}
static boolean isEven(int nummber){
        return nummber%2==0;
}


static int sumOfElements(int Arrey[]){
        int sum=0;
    for (int i = 0; i < Arrey.length; i++) {
        sum=sum+Arrey[i];
    }
    return sum;
}
    //FIX CODE***************************************************

    static int ret(int a, int b){


           return a+b ;
    }

    static void sayHello(){
        System.out.println("hello");


    }

     static void plusplus(int a,int b ){
         System.out.println(a+b);
     }
    double Minus(double a,double b){
    return a-b;
    }

    static int searchMax(int a, int b,int c){
        int max=0;
        if(a>b&&a>c){
            max=a;
        }
        else if(b>a&&b>c){
            max=b;
        }
        else if(c>a&&c>b){
            max=c;

        }
        return max;
    }
    //*написати програму для обчислення факторіалу n!=1*2*3...n;

    static int temperatureCanvert(int a){
        return a*9/5+32;
    }
static  int pow(int a){
        return a*a;
}
    public static void main(String[] args) {
Scanner sk=new Scanner(System.in);

//printInfo("mark");
      //  System.out.println(isEven(5));
//int[]Array=new int[5];
     //   int[]f={2,12,56,8,90};
     //   System.out.println(sumOfElements(f));
     //Pluss(1,4);
       sayHello();
        System.out.println(ret(2,5));
      plusplus(4,5);
        System.out.println(searchMax(4,5,6));
        System.out.println("f="+temperatureCanvert(5));
//fillArrey( Array);
//showArray(Array);
//FillAndShowArrey(Array);
//RandomArray(Array);
//showArray(Array);


//Print(3,5,7);
   //     System.out.println(average(3,5,7));

//int userNumber=sk.nextInt();

   //     System.out.println(square(userNumber));

        //int result= maxF(523452345,2123);
       // System.out.println("Max value:" + result);

/*int usernumber2=sk.nextInt();
int result=addNumbers(userNumber,usernumber2);
        System.out.println(result);
result++;
        System.out.println(result);
        System.out.println(addNumbers(userNumber,usernumber2));
*/

//UserAddNumbers(userNumber,usernumber2);
//startPrint(userNumber);
//UserAdddNumbers(userNumber,usernumber2,7);
      /*
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
        System.out.println(ma*/


   /* Random random = new Random();
    int size = 10;


    int[] g = new int[size];
    int min=0;
    int max=0;
  for(int i = 0;i<size;i++){

        g[i] = random.nextInt(-1, 10);

    }
        for (int i = 0; i <size ; i++) {
            System.out.print(g[i]+" ");

        }
        for (int i = 0; i <size ; i++) {
            if(g[i]==0){
                g[i]=4;
            }

        }
        System.out.println();
        for (int i = 0; i <size ; i++) {
            System.out.print(g[i]+" ");

        }
        for (int i = 0; i <size ; i++) {
            if(min>g[i]){
                min=g[i];
            }
            if(max<g[i]){
                max=g[i];
            }
        }
        System.out.println();
        System.out.println(min+" "+max);*/





        /*int[]g={1,-5,4,2,6,3,-1,4,-7,-3};
        for (int i = 0; i < 9; i++) {
            System.out.print(g[i]);
        }
        System.out.println();
        for (int i = 9; i != 0 ; i--) {
            if (g[i]>0){
                System.out.println(g[i]+" ");
                break;
            }

        }

        System.out.println();
        for (int i = 0; i <9 ; i++) {
            if(g[i]<0){
                System.out.println(g[i]+" ");
                break;
            }
        }*/
        /*
int midleT=0;
int counter=0;
int[]g={1,3,67,23,5,43,45,5,78,5,4,7,9,1,12,12,89,5,6,0,12,34,21,1,12,13,14,15,21,6,4};
        for (int i = 0; i < g.length ; i++) {
            midleT=midleT+g[i];
        }
        System.out.println(midleT/g.length);
        for (int i = 0; i < g.length; i++) {
            if(g[i]>=15){
                counter++;
            }
        }
        System.out.println(counter);
        */



}

}

