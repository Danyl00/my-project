import org.jetbrains.annotations.Contract;
/*
*
*
* */
public class ReloadFunction {

    static int Add(int a){
        return a*a;
    }
    static int Add(int a, int b){
        return a+b;
    }
    static int Add(int a, int b, int c){
        return a+b+c;
    }
    static  double Add(double a){
        return a*a;
    }
    static double Add(double a , double  b){
        return a+b;
    }
    static double Add(double a ,double b, double c){
        return a+b+c;

    }

static void Multy(int a){
    System.out.println(a*a);



}
static void Multy(int a, int b){
    System.out.println(a*b);
    }


static int maxOfValue(int a ,int b){
        int value;
        if(a>b){
            value=a;
        }
        else{
            value=b;
        }
        return value;
}

static int maxOfValue(int a, int b, int c) {
    int value = 0;
    if (a > b && a > c) {
        value = a;
    } else if (b > a && b > c) {
        value = b;
    } else if (c > a && c > b) {
        value = c;
    } else {
        System.out.println("error");
    }
    return value;
}

   static int nuumber (int a){
            return a*a;
    }


    static double nuumber(double a){
            return a*a*a;

    }


    static int SumOfElem(int[]Array){
        int sum=0;
        for (int i = 0; i <Array.length ; i++) {
            sum=sum+Array[i];
        }
        return sum;
    }

static double SumOfElem(double[]Array){
        double sum=0;
        for (int i = 0; i <Array.length ; i++) {
            sum+=Array[i];
        }
        return sum;
    }


static String Concat(String str, String str1){
        return str+str1;

}
    public static void main(String[] args) {
String str= Concat("Hello","World");
        System.out.println(Concat("Hello" , "World"));

        System.out.println(maxOfValue(4 , 7));
        System.out.println(maxOfValue(6 ,8 ,5));

int []Array={1231,123};
int []Arr=new int[5];
Arr[0]=1;
Arr[0]=5;
       /* System.out.println(Add(1,4));
        System.out.println(Add(3.3, 4.5));
        System.out.println(Add(2,2,6));
        System.out.println(Add(4.2,6.2,8.4));*/
    }
}
