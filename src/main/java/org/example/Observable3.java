package org.example;

import rx.Completable;
import rx.Observable;
import rx.functions.Action;
import rx.functions.Action2;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Observable3 {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.range(2, 5);
        observable.subscribe(item -> {
//            System.out.println(item);
        });
        Observable<Long> intervalObservable = Observable.interval(1, TimeUnit.SECONDS);
        intervalObservable.subscribe(item -> {
//            System.out.println(item);
        });
        Observable<Long>timerObservable=Observable.timer(5,TimeUnit.SECONDS);
        timerObservable.subscribe(item->{
            System.out.println("5 Seconds passed");
        });
        new Scanner(System.in).nextLine();
    }
}
