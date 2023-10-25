import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListADT {
    public static void addElement(LinkedList<String> linkedList){
        linkedList.add("Mouse");
        linkedList.add("Cat");
        linkedList.add("Dog");
        System.out.println("LinkedList : "+linkedList);
    }

    public static void addElementWithIndex(LinkedList<String> linkedList, int index, String valueElement){
        linkedList.add(index,valueElement);
        System.out.println("LinkedList : "+linkedList);
    }

    public static void getElementByIndex(LinkedList<String> object, int index){
        String element = object.get(index);
        System.out.println("get Element : "+element);
        System.out.println("LinkedList : "+ object);
    }

    public static void setElementValueByIndex(LinkedList<String> object, int index, String value){
        object.set(index,value);
        System.out.println("LinkedList : "+ object);
    }

    //Viet tiep cac phuong thuc: clear, remove, constrains, indexOf, lastIndexOf
    public static void removeElementByIndex(LinkedList<String> object,int index){
        object.remove(index);
        System.out.println("LinkedList : "+ object);
    }
    public static void containsElementByValue(LinkedList<String> object, String value){
        Boolean check =object.contains(value);
        System.out.println("Check : "+ check);
    }
    public static void indexOfElement(LinkedList<String> object, String value ){
        int position = object.indexOf(value);
        System.out.println("Position of Element : "+ position);
    }
    public static void lastIndexOfElement(LinkedList<String> object, String value){
        int position = object.lastIndexOf(value);
        System.out.println("Position of Element : "+ position);
    }
    //Write the browsing method through the elements of LinkedList
    public static void interatorElement(LinkedList<String> object){
        ListIterator<String> animalIterate = object.listIterator();
        while (animalIterate.hasNext()){
            // hasNext(): checks to see if there is a next element or not
            System.out.print("Element Value : "+animalIterate.next());
            // next(): lays out the next element
            System.out.print(" , ");
            System.out.println();
        }
    }

    public static void clearElement(LinkedList<String> object){
        object.clear();
        System.out.println("LinkedList : "+ object);
    }


}
