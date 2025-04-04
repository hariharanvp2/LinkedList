
public class Main {

    public static void main(String[] args) {

        Linkedlist obj = new Linkedlist(1);
        obj.append(2);
        obj.append(3);
        obj.append(4);
        obj.prepend(0);
        obj.append(5);

        obj.print();
        System.out.println("after removing last node  ");
        obj.removeLast();
        obj.print();
        System.out.println("after reversing");
        obj.reverse();
        obj.print();
        System.out.println("after inserting 55 in index 3");
        obj.insert(3, 55);
        obj.print();
        System.out.println("get the value in index 4");
        obj.Get(4);
        System.out.println("after setting the value of 55 to 5");
        obj.set(3,5);

    }
}