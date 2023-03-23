package com.comp301.lec17.inclass;

import java.util.ArrayList;
import java.util.List;

public class BetterSubjectImpl implements BetterSubject, SubjectObserver {
    private SimpleSubject og_subject;
    private List<SubjectObserver> observers;

    public BetterSubjectImpl(SimpleSubject og_subject) {

        this.og_subject = og_subject;
        this.observers = new ArrayList<SubjectObserver>();
        og_subject.addObserver(this);
    }


    @Override
    public void addObserver(SubjectObserver o, int index) {
        observers.add(index, o);
    }

    @Override
    public void moveObserverToFront(SubjectObserver o) {
        observers.remove(o);
        observers.add(0, o);
    }

    @Override
    public void moveObserverToBack(SubjectObserver o) {
        observers.remove(o);
        observers.add(o);
    }

    @Override
    public void removeObserver(int index) {
        observers.remove(index);
    }

    @Override
    public SubjectObserver getObserver(int index) {
        return observers.get(index);
    }

    @Override
    public int getObserverCount() {
        return observers.size();
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
        og_subject.doSomething();
    }

    @Override
    public void handleEvent() {
        for (SubjectObserver o : observers) {
            o.handleEvent();
        }
    }
}
