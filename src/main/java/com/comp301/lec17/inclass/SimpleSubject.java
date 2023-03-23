package com.comp301.lec17.inclass;

public interface SimpleSubject {

    void addObserver(SubjectObserver o);
    void removeObserver(SubjectObserver o);
    void doSomething();
}
