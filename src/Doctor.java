import java.util.Set;

public class Doctor extends Person {

    private Person vaccinee;

    public Doctor(String name, int age) {
        super(name, age);
    }

    public void vaccinate () {
        vaccinee.vaccinate();
        System.out.println("vaccinated " + vaccinee);
    }

    public boolean validateMedicalProblems () {
        if (vaccinee.getKnownMedicalProblems() == null)
            return true;
        return !Set.of("anaphylactic", "Polyethylene Glycol allergy", "PEG allergy", "Polysorbate allergy").contains(vaccinee.getKnownMedicalProblems());
    }

    public void setVaccinee (Person vaccinee) {
        this.vaccinee = vaccinee;
    }

}
