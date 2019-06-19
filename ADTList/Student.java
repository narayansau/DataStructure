package com.june13_2019.ds.ADTList;

public class Student implements Person{
    String ID;
    String Name;
    int Age;

    Student(String s, String nm, int ag) {
        ID=s;
        Name=nm;
        Age=ag;
    }

    @Override
    public boolean equalTo(Person other) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return Name;
    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return Age;
    }

    public String toString() {
        return "Student ( ID : " + ID + ", Name : " + Name
                + " , Age : " + Age + " ) ";
    }

}
