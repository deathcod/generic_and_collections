package app;

import generics.GenericMethod;

public class App {
    public static void main(String[] args) throws Exception {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.showItem("Hello World");

        Integer t[] = {1,2,3,4,5};
        genericMethod.showArrayItem(t);
    }
}