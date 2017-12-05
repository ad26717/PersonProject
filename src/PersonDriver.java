import com.alidemir.chapter5_2.Person;

public class PersonDriver {

    public static void main(String [] args){

        Person person1 = new Person();
        person1.setPersonAge(25);
        person1.setPersonName("Ahmet");

        System.out.println("Name: " + person1.getPersonName() + " Age: " + person1.getPersonAge());

        Person person2 = new Person("Mehmet", 46);

            // Complete equality checking conditional
        if (person1.equals(person2)){
            System.out.println("These people are the same people");
        } else {
            System.out.println("These people are not the same people");
        }
            // Age checking conditional
        if (person1.getPersonAge() == person2.getPersonAge()){
            System.out.println("These people are at the same age");
        } else if (person1.getPersonAge() > person2.getPersonAge()){
            System.out.println("Person 1 is older than person 2");
        } else if (person1.getPersonAge() < person2.getPersonAge()){
            System.out.println("Person 2 is older than person 1");
        }
            // Name checking conditional
        if (person1.getPersonName() == person2.getPersonName()){
            System.out.println("These people have the same name");
        } else {
            System.out.println("These people do not have the same name");
        }
    }
}
