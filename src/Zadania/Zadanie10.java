package Zadania;
public class Zadanie10 {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", " Trubetskoy");
        person.changePerson(person);
        System.out.println(person);
    }
}
class Person {
    String name;
    String surname;
    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String toString (){
        return name + surname;
    }
    public void changePerson (Person person){
        person = new Person("Ilya", " Lagutenko");
    }
}