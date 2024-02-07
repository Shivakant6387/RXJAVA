package org.example;

import rx.Observable;
import rx.Observer;

public class ObservableFactory {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Item 1", "Item 2");
        Observer<String> observer=new Observer<String>() {
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
