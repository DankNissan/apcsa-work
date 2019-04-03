import java.util.ArrayList;


public class Chest<E> extends Storage<E>
{
    ArrayList<E> list = new ArrayList<E>();
    public void store(E thing) {
        if (list.size() <= 20) {
            list.add(thing);
        }
    }
    public String dump() {
        String out = "You dumped" + list.toString() + "out of your chest.";
        list.clear();
        return out;
    }
}
