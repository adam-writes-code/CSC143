public class Main {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();

        words.add("First word");
        words.addToFront("Sunday");
        words.addToFront("Monday");
        words.addToFront("Tuesday");
        words.addToFront("Wednesday");
        words.addToFront("Thursday");
        words.addToFront("Friday");
        words.addToFront("Saturday");

        words.add("Days of the week");

        System.out.println(words.size());
        System.out.println(words.count());

    }
}
