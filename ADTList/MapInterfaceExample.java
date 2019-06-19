/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */

import java.util.HashMap;
import java.util.LinkedHashMap;


public class MapInterfaceExample{

    public static void main(String args[]) {

        HashMap <Integer, String> map=new HashMap <Integer, String>();

        map.put( 100, "Amit" );
        map.put( 101, "Vijay" );
        map.put( 102, "Rahul" );
        map.put( 101, "narayan" );


        for (HashMap.Entry m : map.entrySet()) {
            System.out.println( m.getKey() + " " + m.getValue() );
        }
        map.remove( 102 );
        System.out.println( "Values after remove: " + map );

        for (HashMap.Entry m : map.entrySet()) {
            System.out.println( m.getKey() + " " + m.getValue() );
        }

        //Creating map of Student

        HashMap <Integer, Student> studentMap=new HashMap <Integer, Student>();

        //Create Student
        Student b1=new Student( "Let us C", "Yashwant Kanetkar", 8 );

        Student b2=new Student( "Data Communications & Networking", "Forouzan", 4 );

        Student b3=new Student( "Operating System", "Galvin", 6 );

        // Create MAp with Studenrs
        studentMap.put( 110, b1 );
        studentMap.put( 115, b2 );
        studentMap.put( 120, b2 );

        for (HashMap.Entry m : studentMap.entrySet()) {
            System.out.println( m.getKey() + " " + m.getValue() );
        }


        LinkedHashMap <Integer, String> hm=new LinkedHashMap <Integer, String>();
        hm.put( 100, "Amit" );
        hm.put( 101, "Vijay" );
        hm.put( 102, "Rahul" );

        for (HashMap.Entry m : hm.entrySet()) {
            System.out.println( m.getKey() + " " + m.getValue() );
        }

    }


}


