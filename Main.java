import java.util.LinkedList;
import java.util.List;

//Linked List - Dynamic data structure(no need for resizing) - last item points to null
//no random indexing from linked list
//advantage is that items can be inserted/removed at the beginning of data structure
//O(1)

//disadvantage is inserting at anywhere besides the beginning
//must go through every node for an arbitrary/last location
//O(n)

//require more memory because of references and cannot go backwards
public class Main{
    
    public static void main(String[] args) {
        //list is interface
        List<Integer> list = new LinkedList<>();//linked list is class/implementation of list
        //linked list is a generic class that implements many interfaces
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(3);

        //doubly linked list(requires more memory)
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        //0(1)
        list2.addLast(6);
        list2.addFirst(1);
        list2.removeFirst();
        list2.removeLast();
        
        
        for(Integer num : list2){
            System.out.println(num);
        }
        System.out.println("Size: " + list2.size());
        System.out.println(list2.isEmpty());


    }


}