package app;

import generics.GenericMethod;
import generics.MinComparator;

public class App {
    public static void main(String[] args) throws Exception {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.showItem("Hello World");

        Integer t[] = {1,2,3,4,5};
        genericMethod.showArrayItem(t);

        System.out.println(MinComparator.calculateMin(3, 5));
    }
}