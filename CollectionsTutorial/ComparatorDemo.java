import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        
        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals("cat", 2, "black"));
        animals.add(new Animals("dog", 3, "white"));
        animals.add(new Animals("lion", 4, "yellow"));
        animals.add(new Animals("tiger", 15, "orange"));
        animals.add(new Animals("bear", 6, "brown"));
        animals.add(new Animals("pig", 17, "pink"));
        animals.add(new Animals("cow", 8, "white"));
        animals.add(new Animals("horse", 19, "black"));
        animals.add(new Animals("sheep", 10, "white"));

        System.out.println("Before sorting:");
        for (Animals animal : animals) {
            System.out.println(animal.getName() + " " + animal.getAge() + " " + animal.getColor());
        }

        // Sort by age
        // animals.sort(new AgeComparator());
        // Sort by name
        // animals.sort(new NameComparator());
        // System.out.println("After sorting by age:");
        // System.out.println("After sorting by name:");
        // for (Animals animal : animals) {
        //     System.out.println(animal.getName() + " " + animal.getAge() + " " + animal.getColor());
        // }
        // animals.sort(new NameComparable());//error
        Collections.sort(animals, new NameComparator());
        System.out.println("After sorting by name:");
        for (Animals animal : animals) {
            System.out.println(animal.getName() + " " + animal.getAge() + " " + animal.getColor());
        }
    }
}
class AgeComparator implements Comparator<Animals> {
    @Override
    public int compare(Animals o1, Animals o2) {
        System.out.println("------------------------------------------------");
        System.out.println("Comparing " + o1.getName() + " and " + o2.getName());
        System.out.println(o1.age+" - "+o2.age+" = " + (o1.getAge() - o2.getAge()));
        System.out.println("------------------------------------------------");
        // return o1.getAge() - o2.getAge();// Ascending order
        return o2.getAge() - o1.getAge();//descending order
    }
}
class NameComparator implements Comparator<Animals> {
    @Override
    public int compare(Animals o1, Animals o2) {
        System.out.println("------------------------------------------------");
        System.out.println("Comparing " + o1.getName() + " and " + o2.getName());
        System.out.println(o1.name+" - "+o2.name+" = " + (o1.getName().compareTo(o2.getName())));
        System.out.println("------------------------------------------------");
        return o1.getName().compareTo(o2.getName());
    }
}
/* class NameComparable implements Comparable<Animals> {
    @Override
    public int compareTo(Animals o) {
        System.out.println("------------------------------------------------");
        System.out.println("Comparing " + this.getName() + " and " + o.getName());
        System.out.println(this.name+" - "+o.name+" = " + (this.getName().compareTo(o.getName())));
        System.out.println("------------------------------------------------");
        return this.getName().compareTo(o.getName());
    }
} */
