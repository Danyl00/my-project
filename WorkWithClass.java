import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*class Student
String name;
String surname;
int age;
Student(String _name,String _surname,int _age){
    name=_name;
    surname=_surname;
    age=_age;
}
  public void showInfo(){
      System.out.println("name: "+name+ " surname: "+surname+ " age: "+age);

  }
public void isAge(){
    if(age>15){
        System.out.println("age>15");
    }
    else{
        System.out.println("age<15");
    }
}

public void UpdateAge() {
    if (age < 15) {
        age = age + 3;
    }

}

*/
class Car {
    String AutoBrand;
    int price;
    int graduationYear;

    Car(String _AutoBrand, int _price, int _graduationYear) {
        AutoBrand = _AutoBrand;
        price = _price;
        graduationYear = _graduationYear;

    }

    public void showInfo() {
        System.out.println("AutoBrand: " + AutoBrand + " price: " + price + " graduationYear: " + graduationYear);

    }

    public void priceСheck() {
        if (price > 5000) {
            System.out.println("price>5000");
        } else {
            System.out.println("price<5000");
        }
    }

}

class Book{
    String name;
    String author;
   int year;

 Book(String _name, String _author, int _year){
     name=_name;
     author=_author;
     year=_year;

 }
 Book(String _name, int _year)
 {
     name= _name;
     year=_year;
 }
 Book(String _name)
 {

     name=_name;
 }


    public void showInfo() {
        System.out.println("name: " + name);

    }
    public void showInfo(boolean x) {
     showInfo();
     if(x){
         System.out.println("year:" + year);
     }
    }
    public void showInfo(boolean x, boolean y)
    {
        showInfo(true);
        if(x && y){
            System.out.println("Author: "+ author);
        }
    }

}

class  Contact {
    int phoneNumber;
    String firstName;
    String lastName;

Contact(int _phoneNumber,String _firstName,String _lastName){
    phoneNumber=_phoneNumber;
    firstName=_firstName;
    lastName=_lastName;
}
}
/*class Student {
    String name;
    String surname;
    int GPA;

    Student(String _name, String _surname, int _GPA) {
        name = _name;
        surname = _surname;
        GPA = _GPA;
    }

    public void showInfo() {
        System.out.println("name: " + name + " surname: " + surname + " age: " + GPA);

    }
}
*/



class employe {
    String reviewTask;
    String date;
    boolean dunTask;

    employe(String _reviewTask, String _date, boolean _dunTask) {
        reviewTask = _reviewTask;
        date = _date;
        dunTask = _dunTask;
    }
}
    class WorkWithClass {
        public static void main(String[] args) {
            /*
            Student student1 = new Student("danyl", "nyzhnyk", 13);
            Student student2 = new Student("dsaasd", "asdasd", 123);

            student1.showInfo();
            student2.showInfo();
            student1.isAge();
            student2.isAge();
            student1.UpdateAge();
            student1.showInfo();
            student2.UpdateAge();
            student2.showInfo();



            Car car1 = new Car("BMW", 91586, 2017);
            // car1.showInfo();

            Book book1 = new Book("asd", "oiuah", 1234);
            book1.showInfo(true, true);
            Book book2 = new Book("Name", 1992);
            // book2.showInfo(true);
            Book book3 = new Book("name1");
            //book3.showInfo();


            List<Contact> Contacts = new ArrayList<>();
            Contacts.add(new Contact(123456, "kjhsd", "hjaa"));
            Contacts.add(new Contact(345712, "kjhsd", "hjaa"));
            Contacts.add(new Contact(6789, "rty", "fgh"));

            System.out.println("Contacts");
            for (Contact index : Contacts) {
                System.out.println("name: " + index.firstName + " last name: " + index.lastName + " phone number " + index.phoneNumber);
            }
            Contacts.add(new Contact(98347593, "kkkllkjk", "fpopoo"));

            if (!Contacts.isEmpty()) {
                Contacts.remove(0);
            }
            for (Contact index : Contacts) {
                System.out.println("name: " + index.firstName + " last name: " + index.lastName + " phone number " + index.phoneNumber);
            }
            String searcNname;
            Scanner sk = new Scanner(System.in);
            System.out.println("Enter name");
            searcNname = sk.next();
            boolean found = false;
            for (Contact index : Contacts) {
                if (index.firstName.equalsIgnoreCase(searcNname)) {
                    System.out.println("contact found-name" + index.firstName + " last name: " + index.lastName + " phone number " + index.phoneNumber);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("contact not found");
            }



            List<Student> students = new ArrayList<>();
            students.add(new Student("max", "bob", 190));
            students.add(new Student("st1", "b1", 1));
            students.add(new Student("st2", "b2", 150));
            students.add(new Student("st3", "b3", 70));
            for (Student index:students ) {
                System.out.println(" Student: " +index.name+ " sure Name: " +index.surname+" GPA : "+index.GPA );
            }
            List<employe> employye = new ArrayList<>();
employye.add(new employe("Write the tasks","3.4.2023",true));
        }
    }
*/

        }
    }