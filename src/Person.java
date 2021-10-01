public record Person(String name, int age, String knownMedicalProblems){
    @Override
    public String toString () {
        return name;
    }
}
