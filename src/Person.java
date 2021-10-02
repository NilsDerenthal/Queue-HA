/**
 * Creates a basic Person with a name, age and known medical problems.
 */
public class Person {

    private final String name;
    private final int age;
    private final String knownMedicalProblems;

    private boolean isVaccinated;

    public Person(String name, int age, String knownMedicalProblems) {
        this.name = name;
        this.age = age;
        this.knownMedicalProblems = knownMedicalProblems;

        isVaccinated = false;
    }

    public Person(String name, int age) {
        this(name, age, null);
    }

    public void vaccinate () {
        isVaccinated = true;
    }

    // getter

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public String getKnownMedicalProblems() {
        return knownMedicalProblems;
    }

    @Override
    public String toString() {
        return name;
    }
}
