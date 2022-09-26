import java.util.ArrayList;
import java.util.Collections;
class Arraylists{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<Integer>();
        //add Elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        //get elements
        int element=list.get(0);
        System.out.println(element);
        //add element in between
        list.add(1,3);
        System.out.println(list);
        //Set Element
        list.set(0,4);
        System.out.println(list);
        //delete element
        list.remove(3);
        System.out.println(list);
        //size
        int size=list.size();
        System.out.println(size);
        //loops
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        //sorting
        Collections.sort(list);
        System.out.println(list);
        }
    }

