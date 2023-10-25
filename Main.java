import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*LinkedList*/
        LinkedList<String> animals = new LinkedList<>();
        // 1 - operater add
        LinkedListADT.addElement(animals);
        LinkedListADT.addElementWithIndex(animals,0,"Tiger");
        LinkedListADT.getElementByIndex(animals,2);
        LinkedListADT.removeElementByIndex(animals,2);
        LinkedListADT.indexOfElement(animals,"Tiger");
        LinkedListADT.lastIndexOfElement(animals,"Dog");
        LinkedListADT.containsElementByValue(animals,"Cat");
        LinkedListADT.interatorElement(animals);
        LinkedListADT.clearElement(animals);

        /*Stack*/
        Stack<Integer> numbers = new Stack<>();
        // 1 - push stack
        StackADT.stackPush(numbers);
        // 2 - pop stack
        StackADT.stackPop(numbers);
        // 3 - peek stack
        StackADT.stackPeek(numbers);
        // 4 - search stack
        StackADT.stackSearch(numbers,1);
        // 5 - empty stack
        StackADT.checkEmptyStack(numbers);

        /*Queue implement LinkedList*/
        Queue<String> fruits = new LinkedList<>();
        Queue<Integer> queueNumbers = new LinkedList<>();
        // 1 - Queue Add
        QueueLinkedListADT.queueAdd(fruits);
        // 2 - Queue Offer
        QueueLinkedListADT.queueOffer(queueNumbers);
        // 3 - Queue Peek
        QueueLinkedListADT.queuePeek(queueNumbers);
        // 4 - Queue Remove
        QueueLinkedListADT.queueRemoveByIndex(queueNumbers,3);
        // 5 - Queue Search
        QueueLinkedListADT.queueSearch(queueNumbers,5);
        // 6 - Queue For
        QueueLinkedListADT.forQueue(queueNumbers);

        /* Cac thuat tuan sap xep*/
        /* 1 - Bubble Sort*/
        int[] randomNumbers = {100, 1, 5, 4, 3, 2};
        BubbleSortALU.bubbleSort(randomNumbers,randomNumbers.length);
        BubbleSortALU.printResult(randomNumbers);
        /* 2 - Insertion Sort*/
        InsertionSortALU.insertionSort(randomNumbers);
        InsertionSortALU.printResult(randomNumbers);
        /* 3 - Selection Sort*/
        SelectionSortALU.selectionSort(randomNumbers);
        SelectionSortALU.printResult(randomNumbers);
        /* 4 - Selection Sort*/
//        MergeSortALU.sort(randomNumbers,0,randomNumbers.length - 1);
//        MergeSortALU.printResult(randomNumbers);
    }

}