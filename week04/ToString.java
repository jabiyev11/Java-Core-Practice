package week04;

import invoice.Invoice;
import geometry.*;
import datetime.*;
import math.*;

public class ToString {
    
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("1253", "ScrewDriver", 4, 15.87);
        System.out.println("Better version of toString: " + invoice.toString());

        Point p1 = new Point(1, 3);
        System.out.println("Better version of toString: " + p1.toString());

        Segment seg = new Segment(1, 3, 4, 5);
        System.out.println("Better version of toString: " + seg.toString());

        CustomTime time1 = new CustomTime(12, 34, 56);
        System.out.println("Better version of toString: " + time1.toString());

        CustomDate date1 = new CustomDate(12, 29, 2005);
        System.out.println("Better version of toString: " + date1.toString());

        ComplexNumber number = new ComplexNumber(5, 7);
        System.out.println("Better version of toString: " + number.toString());

        //Using StringBuilder is memory efficient comparing to traditional usage in terms of
        // memory and CPU usage
        //It also improves cache relaibility 
        //Apart from that, also improves performance with making Objects mutable 
    }
}
