package com.comp301.lec17.inclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubjectImpl implements SimpleSubject {

    List<SubjectObserver> observers;

    public SimpleSubjectImpl() {

        observers = new ArrayList<SubjectObserver>();
    }

    @Override
    public void addObserver(SubjectObserver o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(SubjectObserver o) {

        observers.remove(o);
    }

    @Override
    public void doSomething() {
        notifyObservers();
    }

    private void notifyObservers() {
        for (SubjectObserver o : observers) {
            o.handleEvent();
        }
    }
}
