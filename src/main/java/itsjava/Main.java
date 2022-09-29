package itsjava;

import itsjava.services.StoreService;
import itsjava.services.StoreServiceImpl;

public class Main {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();

        storeService.start();
    }
}
