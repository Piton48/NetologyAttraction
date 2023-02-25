public class Person {
    protected String name;
    protected String lastName;
    protected int tickets;

    public Person(String name, String lastName, int tickets) {
        this.name = name;
        this.lastName = lastName;
        this.tickets = tickets;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean pickUpATicket() {
        this.tickets--;
        if (this.tickets > 0) {
            return true;
        } else return false;
    }
}
