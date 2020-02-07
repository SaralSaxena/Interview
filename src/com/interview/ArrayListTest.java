package com.interview;

public class ArrayListTest {

    public static void main(String... a) {
        CustomArrayList<Employee> list = new CustomArrayList<>();
        list.add(new Employee("1", "saral"));
        list.add(new Employee("2", "amit"));
        list.add(new Employee("3", "dinesh"));
        list.add(null);
        list.display();
        System.out.printf("\n element at index %d = %s%n", 1, list.get(1));
        System.out.printf("element removed from index %d = %s%n", 1, list.remove(1));

        System.out.println("\n" +
                "let's display list again after removal at index 1");
        list.display();

        //list.remove(5);  //will throw IndexOutOfBoundsException, because no element to remove on index 5.
        //list.get(6);   //will throw IndexOutOfBoundsException,  no element to get on index 6.

    }

}
