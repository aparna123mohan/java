import java.util.*;

public class  linkedlist {
    public static  void main(String[] args){
         System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
        LinkedList<String> L=new LinkedList<>();
        L.add("Gold");
        L.add("Silver");
        L.add("Bronze");
        L.add(0,"Olympics Medals");
        System.out.println(L);
        L.remove("Bronze");
        System.out.println(L);
        L.remove(2);
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.removeFirst();
        System.out.println(L);


    }

}
