package org.example;

import rx.Observable;

public class Main {
    public static void main(String[] args) {
        Observable<String>observable=Observable.create(emitter->{
            emitter.onNext("Click no 1");
            emitter.onNext("Click no 2");
            emitter.onNext("Click no 3");
            emitter.onCompleted();
        });
        observable.subscribe(item->{
            System.out.println(item);
        }, throwable -> {
            System.out.println(throwable.getMessage());
        },()->{
            System.out.println("On Complete");
        });
    }
}