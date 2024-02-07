package org.example;

import rx.Observable;
import rx.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableFactory {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Item 1", "Item 2");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        Observable<Integer> observable2 = Observable.from(numbers);
        Observer<Integer> observer2 = new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("On Complete called!");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println(integer);
            }
        };
        observable2.subscribe(observer2);
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("On Complete called!");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        };
        observable.subscribe(observer);
    }
}
