package com.stevens.rxjava;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import org.junit.Test;


public class RxJavaTest {

    @Test
    public void deferTest() {
        String[] monthArray = {
                "Jan", "Feb", "Mar", "Apl", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec"
        };

        Function

        Observable.defer(() -> {
            return Observable.fromArray(monthArray);
        }).subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Emission completed"));
    }
}
