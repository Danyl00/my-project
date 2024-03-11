import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        /*
        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>(List.of("Apple", "Banana", "Orange"));

        list1.remove("Orange");
        list1.remove(1);
        for (String fr : list1) {
            System.out.println(fr);

        }
        //  String frut1= list1.get(1);

        //  System.out.println(frut1);
        System.out.println();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Cherry");
        list2.add("coco");
        list2.add(0, "Mango");

        int size = list2.size();
        System.out.println(size);
        for (String fruts : list2) {

            System.out.println(fruts);
        }

        ArrayList<Integer> listt = new ArrayList<>();
        listt.add(8);
        listt.add(6);
        listt.add(4);
        listt.add(2);
        listt.add(14);
        listt.remove(2);
        listt.add(15);
        for (Integer mn : listt) {
            System.out.println(mn);

        }
        if (listt.contains(4)) {
            System.out.println("Містить");

        } else {
            System.out.println("Не мітить");
        }
        int sum = 0;
        for (int number : listt) {
            sum += number;
        }
        System.out.println(sum);
        int min;
        int max;
        min = Collections.min(listt);
        max = Collections.max(listt);
        System.out.println(min);
        System.out.println(max);


        String s = "Hello World";
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0, 7));
        System.out.println(s.substring(3, 9));
        System.out.println(s.indexOf("World"));
        System.out.println(s.replace("World", "Hlk"));
        System.out.println(s.startsWith("Hello"));
        String st = "   Hello   ";
        System.out.println(st);
        System.out.println(st.trim());
        //     ArrayList<Integer> number =new ArrayList<>();
        Scanner sk = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>(List.of(2, 56, 67, 3, 8));
        int userNumber = sk.nextInt();
        if (number.contains(userNumber)) {
            System.out.println(userNumber + "Знайдено");
        } else {
            System.out.println(userNumber + "Не знайдено");
        }
        String t = sk.next();
        char firstLetter = t.charAt(0);
        char LastLetter = t.charAt(t.length() - 1);
        String resoult = t.substring(1, t.length() - 1);
        resoult = Character.toUpperCase(firstLetter) + resoult.toLowerCase() + Character.toUpperCase(LastLetter);
        System.out.println(resoult);


        ArrayList<Integer> num= new ArrayList<>(List.of(5,7,4,4,5,8,9));
        System.out.println(num);
        HashSet<Integer> heshNum=new HashSet<>(num);
        num.clear();
        num.addAll(heshNum);
        System.out.println(num);
*/
        ArrayList<Integer> arr= new ArrayList<>(List.of(3,7,9,5,3,6));
        System.out.println(arr);

        for (int index:arr) {
            if(index %3==0){
                System.out.println("Знайдено " +index);
            }


        }


}
    }


