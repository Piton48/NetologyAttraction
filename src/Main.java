import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>() {
        };
        list.add(new Person("Иван", "Долвич", 10));
        list.add(new Person("Сергей", "Петров", 2));
        list.add(new Person("Константин", "Лисовский", 5));
        list.add(new Person("Михаил", "Иванишко", 1));
        list.add(new Person("Николай", "Аленин", 15));
        return list;
    }

    public static void main(String[] args) {
        Queue<Person> queue = (Queue<Person>) generateClients();
        while (queue.peek() != null) {
            Person person = queue.poll();
            System.out.println(person.getName() + " " + person.getLastName() + " прокатился на аттракционе");
            if (person.pickUpATicket()) queue.offer(person);
        }
    }
}