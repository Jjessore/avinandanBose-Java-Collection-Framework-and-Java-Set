import java.util.HashSet;
public class HashSetDemo15f {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add("A");
        set2.add("a");
        set2.add("B");
        set2.add("b");
        set2.add("C");
        set2.add("c");
        set1.stream().spliterator().tryAdvance(s -> System.out.println(s));
        set2.stream().spliterator().tryAdvance(s -> System.out.println(s));

        

    }
}
