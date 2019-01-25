package com.monami.collection.Collection;

import com.monami.collection.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee ee=new Employee(13,"Pallavi","Jajpur");
        Employee ee1=new Employee(1,"Siva","Jajpur");
        Employee ee2=new Employee(2,"Pallavi","Jajpur");
        System.out.println(ee.getClass()+" "+ee.getId()+" "+ee.getName()+" "+ee.getAddress());
        System.out.println(ee1.getClass()+" "+ee1.getId()+" "+ee1.getName()+" "+ee1.getAddress());
        System.out.println(ee2.getClass()+" "+ee2.getId()+" "+ee2.getName()+" "+ee2.getAddress());
    }
}
