package com.tactfactory.dp.singleton.first;

public class FirstSingleton {

    // La plus simple (on instancie un objet qui ne sera peut-être jamais utilise).
//    private static FirstSingleton instance = new FirstSingleton();

    private static volatile FirstSingleton instance;

    private FirstSingleton() {
        super();
    }

    // Solution possible pour le multi-thread mais peut provoquer des attentes inutiles.
//    public static synchronized FirstSingleton getInstance() {
    public static FirstSingleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new FirstSingleton();
                }
            }
        }

        return instance;
    }
}
