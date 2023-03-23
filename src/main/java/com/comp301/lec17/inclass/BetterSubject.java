package com.comp301.lec17.inclass;

public interface BetterSubject extends SimpleSubject {
    void addObserver(SubjectObserver o, int index);
    void moveObserverToFront(SubjectObserver o);
    void moveObserverToBack(SubjectObserver o);
    void removeObserver(int index);
    SubjectObserver getObserver(int index);
    int getObserverCount();
}
