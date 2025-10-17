import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayIntList myFaveNums = new ArrayIntList();

        myFaveNums.add(25);
        myFaveNums.add(75);
        myFaveNums.add(13);
        myFaveNums.add(3);
        myFaveNums.add(123);
        myFaveNums.add(5);
        myFaveNums.add(11);
        myFaveNums.add(100);

        ArrayList<String> words = new ArrayList<>();

        words.add("hello");
        words.add("world");
        words.add("October");
        words.add("Thursday");

//        for (String word : words) {
//            System.out.println(word);
//        }

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);

            if (word.equals("hello")) {
                iterator.remove();
            }
        }

    }
}


/*
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayIntList myFavNums = new ArrayIntList();

        myFavNums.add(25);
        myFavNums.add(75);
        myFavNums.add(13);
        myFavNums.add(3);
        myFavNums.add(123);
        myFavNums.add(5);
        myFavNums.add(1);
        myFavNums.add(100);
        myFavNums.add(33);

        ArrayList<String> words = new ArrayList<>();

        words.add("hello");
        words.add("world");
        words.add("October");
        words.add("Thursday");

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);

            if (word.equals("hello")) {
                iterator.remove();
            }
        }
    }
}
 */