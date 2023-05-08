import java.util.ArrayList;

public class MyArrayList{
    public static void main(String[] args){
        ArrayList<Egg> myList = new ArrayList<Egg>();

Egg egg1 = new Egg();
myList.add(egg1);

Egg egg2 = new Egg();
myList.add(egg2);

int theSize = myList.size();

boolean isIn = myList.contains(egg1);

int idx = myList.indexOf(egg2); //returns 1

boolean empty = myList.isEmpty();


myList.remove(egg1);
    }
}