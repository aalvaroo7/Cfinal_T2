package main;

public class Main {
    public static void main(String[] args) {
        Person staff = new Staff();
        Person boss = new Boss();
        Person visitor = new Visitor();

        System.out.println(staff.identify());
        System.out.println(boss.identify());
        System.out.println(visitor.identify());
    }
}