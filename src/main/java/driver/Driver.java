/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import linkedList.*;

/**
 *
 * @author jesse
 */
public class Driver {
        public static void pnt(Object o){
        System.out.println(o);
    }
    public static void pnt() {pnt("");}
    
    public static void main(String[] args){
        CircleLinkedList<Integer> cll = new CircleLinkedList<Integer>();
        cll.add(2);
        cll.add(4);
        cll.add(6);
        cll.add(8);
        cll.add(10);
        cll.add(11);
        cll.add(13);
        cll.add(20);
        cll.add(25);
        cll.add(26);
        cll.add(34);
        cll.add(35);
        
        System.out.println("new list: " + cll);
        
        Node<Integer> johnny = cll.remove(0);
        
        System.out.println("list after removing first item: " + cll);
        
        pnt();
        pnt("what was the first item: " + johnny);
        pnt("the new first item: " + cll.getFirst());
        pnt();
        pnt("The 12th item in the list: " + cll.get(12));
        pnt();
        pnt("the -12th item in the lit: " + cll.get(-12));
        pnt();
        pnt("The -104th item: " + cll.remove(-104));
        pnt();
        pnt("The list after removing the -104th item: " + cll);
        pnt();
        pnt("The first item in the list right now: " + cll.getFirst());
        pnt();
        pnt("The last item in the list right now: " + cll.getLast());
        
    }
    
}
