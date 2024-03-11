import java.util.Scanner;

public class calc {

    //calc
    //читати ціле число з конослі і повертати його
    static int getInt(){
        Scanner sk =new Scanner(System.in) ;
        System.out.println("Enter number");
        int num=sk.nextInt();
        return num;
    }
    //читати і поверати операцію (+ - * /)
    static char getOperation(){
        Scanner sk =new Scanner(System.in) ;
        System.out.println("Enter operation");
        char operation=sk.next().charAt(0);
        return operation;
    }
    // має виконувати над числами НАМ1 і НАМ2 операці. , яку ввів користувач
    static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println(" ERROR : this operation can't be");break;
        }

        return result;
    }
    public static void main(String[] args) {
       /* int num1=getInt();
int num2=getInt();
char operation=getOperation();
        System.out.println(calc (num1,num2, operation));
*/
       // int result= calc(getInt(),getInt(),getOperation());
        //System.out.println(result);
        System.out.println(calc(getInt(),getInt(),getOperation()));



    }
}
