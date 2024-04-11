public class StudentMain {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            TeaClassStudent student = new TeaClassStudent("19ME00" + i,
                    switch (i) {
                case 1 -> "Suresh";
                case 2 -> "Ramesh";
                case 3 -> "Dinesh";
                case 4 -> "Siresh";
                case 5 -> "Liresh";
                        default -> "Anonymous";
                    }, "19/07/2000", "Tea Class");

            System.out.println(student);
        }

        Student normStud = new Student("123", "AK", "2002", "classic");

        System.out.println(normStud);
    }
}
