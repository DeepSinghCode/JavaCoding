
import java.util.*;

public class Account {
    int id;

    public Account(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        List<Account> list = new ArrayList<Account>();
        list.add(new Account(111));
        list.add(new Account(222));
        // insert code here
    }
}