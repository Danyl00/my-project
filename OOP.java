import java.util.ArrayList;
import java.util.List;

class Robot{
    String name;

    Robot (String _name){
        this.name=_name;
    }

    public void sayHello(){
        System.out.println("Hi , i`m robot "+ name);
    }

    public void work(){
        System.out.println("i`m doing my work");
    }
}

class AndroidRobot extends Robot {
    AndroidRobot(String _name) {
        super(_name);
    }

    @Override
    public void work(){
        System.out.println("i`m help people to work");
    }

    public void chargeBattery(){
        System.out.println("I`m charging my battery");
    }
}

class IOS extends AndroidRobot{

    IOS(String _name) {
        super(_name);
    }
    @Override
    public void work(){
        System.out.println("I`m waiting......");
    }
}
class animal{


    animal() {

    }
    public void eat(){
        System.out.println("тварина їсть");
    }


}
class animalDog extends animal{

    animalDog() {
        super();
    }
    public void theDogIsBarking(){
        System.out.println("собава гавкає");
    }

}
class Person{
    String firstName;
    String lastName;
    Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void introduse(){
        System.out.println("мене звати"+firstName+" "+lastName);
    }
}
class Student extends Person{
int studentId;
    Student(String firstName, String lastName,int studentId) {
        super(firstName, lastName);
        this.studentId=studentId;
    }
    public void Stady(){
        System.out.println("i learn");
    }
}
class Teacher extends Person{
String subject;
    Teacher(String firstName, String lastName,String subject) {
        super(firstName, lastName);
        this.subject=subject;
    }
    public void teach(){
        System.out.println("teaching"+subject);
    }



}

class Cars implements ToString {
    String Model;
    int GraduationYear;
    int price;
    Cars(String Model, int GraduationYear,int price) {
        this.Model=Model;
        this.GraduationYear=GraduationYear;
        this.price=price;
    }

    public String getModel(){
        return Model;
    }
    public int getGraduationYear(){
        return GraduationYear;
    }
    public int getPrice(){
        return price;

    }
    @Override
    public String ToString(){
        return "Model: " +Model +" GraduationYear: " +GraduationYear + " price: " +price;
    }

    }

    class carr extends Cars{
int countOfPassengers;
        carr(String Model, int GraduationYear, int price,int countOfPassengers) {
            super(Model, GraduationYear, price);
            this.countOfPassengers=countOfPassengers;
        }

        @Override
        public String ToString(){

            return super.ToString() +" Count of Passengers: " + countOfPassengers;

        }
    }

class carParking{
    List<Cars> parking;
    carParking(){
        parking=new ArrayList<>();

    }
public void carAdd(Cars CarsX){
        parking.add(CarsX);
}
public void carDel(Cars CarX) {
    parking.remove(CarX);
}
public void showCars(){
    for (Cars index:parking ) {
        System.out.println(index);
    }

}
}


public class OOP {
    public static void main(String[] args) {

carParking carPark= new carParking();
        carPark.carAdd(new carr("ads",90,123,4));
        carPark.carAdd(new carr("fgh",78,160,2));
        carPark.carAdd(new carr("ljjkl",54,189,5));

        System.out.println("my car parks");
        carPark.showCars();

        System.out.println(carPark.parking.contains(90));

       /* AndroidRobot ios = new AndroidRobot("IOS_17");
        ios.sayHello();
        ios.work();
        ios.chargeBattery();

        IOS newIos= new IOS("OIS_11");
        newIos.sayHello();
        newIos.work();
        animal dog = new animal();
        dog.eat();

        animalDog dog1=new animalDog();
        dog1.theDogIsBarking();
        dog1.eat();
        Person person1=new Person("jon","bob");
        person1.introduse();
        Student student1=new Student("alise","jonson",123);
        student1.introduse();
        student1.Stady();
        Teacher teacher1=new Teacher("bob","bob","math");
        teacher1.introduse();
        teacher1.teach();*/


    }

}
