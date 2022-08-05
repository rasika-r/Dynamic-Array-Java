//Manually creating a dynamic array similar to ArrayList

public class Main {
    public static void main(String[] args) {

        //creating new array with length 3

        Array numbers = new Array(3);
        System.out.println("Created new Array with length 3");


        //inserting 3 values into array

        numbers.insert(5);
        numbers.insert(4);
        numbers.insert(3);
        System.out.println("Inserted 3 values");

        //again inserting 2 values and the array expands

        numbers.insert(2);
        numbers.insert(1);
        System.out.println("Inserted 2 more values");


        //printing the array

        System.out.println("The array: ");
        numbers.print();


        //deleting value from array using index

        numbers.removeIndex(2);
        System.out.println("Removed an item from the array");


        //searching a value and return its index

        System.out.println("The index of searched item is: ");
        System.out.println(numbers.searchItem(2));

        System.out.println("The array after all the operations: ");
        numbers.print();


    }
}
