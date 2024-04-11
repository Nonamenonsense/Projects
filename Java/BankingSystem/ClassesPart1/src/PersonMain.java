public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(-5);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        System.out.println("Age = "+person.getAge());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}