package com.comp301.lec17.inclass;

public class MainAfter {

    public static void main(String[] args) {
        SubjectObserver amari = () -> {
            System.out.println("This is Amari");
        };

        SubjectObserver bob = () -> {
            System.out.println("This is Bob");
        };

        SubjectObserver carlos = () -> {
            System.out.println("This is Carlos");
        };

        SubjectObserver darshan = () -> {
            System.out.println("This is Darshan");
        };

        BetterSubject s =
                new BetterSubjectImpl(new SimpleSubjectImpl());

        s.addObserver(amari);
        s.addObserver(bob);
        s.addObserver(carlos);
        s.addObserver(darshan);

        s.doSomething();

        s.moveObserverToFront(darshan);
        s.moveObserverToBack(bob);

        s.doSomething();
    }
}
