import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue;

        Person a = new Person("Hubert Humboldt",    50, "Pollenalergie");
        Person b = new Person("Franziska Franken",  37, null);
        Person c = new Person("Arwin Laschstedt",   45, null);
        Person d = new Person("Lana Lena Berstock", 36, null);
        Person e = new Person("Olof Schnolz",       48, null);
        Person f = new Person("Tristan Windler",    42, null);

        queue = new Queue(a, b, c, d, e, f);

        int queueSize = queue.getSize();

        for (int i = 0; i < queueSize; i++) {
            Person p = queue.dequeue();
            System.out.println(queue);
        }
    }
}
