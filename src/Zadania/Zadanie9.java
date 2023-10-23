package Zadania;

public class Zadanie9 {
    public static void main(String[] args){
        Person1 person = new Person1();
        person.name = "Lyapis";
        person.surname = " Trubetskoy";
        person.changePerson1(person);
        System.out.println(person);
    }
}
class Person1 {
    public String name;
    public String surname;

    public String toString (){
        return name + surname;
    }
    public void changePerson1 (Person1 person){
        person = new Person1();
        name = "Ilya" ;
        surname = " Lagutenko";
    }
}
