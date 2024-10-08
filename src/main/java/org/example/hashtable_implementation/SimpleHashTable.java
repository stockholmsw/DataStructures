package org.example.hashtable_implementation;

import org.example.Employee;

import java.util.Hashtable;

public class SimpleHashTable {
    private Employee[] hashtable;
    public SimpleHashTable(){
        hashtable = new Employee[10];

    }
    private int hashKey(String key){
         return key.length()% hashtable.length;
    }
    public void put(String key , Employee employee){
        int hashedKey = hashKey(key); // it is for index
        if(hashtable[hashedKey]!=null){
            System.out.println("there's already an employee at this position");
        }else{
            hashtable[hashedKey] = employee;
        }

    }
    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }
    public void printHashTable(){
        for(int i = 0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }
}
