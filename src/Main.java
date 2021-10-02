public class Main {
    public static void main(String[] args) {
        Queue<Person> queue;

        Person a = new Person("Hubert Humboldt",    50, "Pollenalergie");
        Person b = new Person("Franziska Franken",  37, null);
        Person c = new Person("Arwin Laschstedt",   45, null);
        Person d = new Person("Lana Lena Berstock", 36, null);
        Person e = new Person("Olof Schnolz",       48, null);
        Person f = new Person("Tristan Windler",    42, null);
        Person g = new Person("Angelo Merte",       67, null);


        queue = new Queue(a, b, c, d, e, f, g);

        Doctor vaccinatingDoctor = new Doctor("Dr. Martin Sonneborn", 30);

        while (!queue.isEmpty()) {
            Person vaccinee = queue.dequeue();
            vaccinatingDoctor.setVaccinee(vaccinee);

            if (vaccinatingDoctor.validateMedicalProblems())
                vaccinatingDoctor.vaccinate();
        }
    }

}
