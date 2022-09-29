package itsjava.services;

import itsjava.domain.Client;
import itsjava.domain.Knowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService{
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Knowledge> knowList = new ArrayList<>();
        knowList.add(new Knowledge("медицина"));
        knowList.add(new Knowledge("образование"));
        knowList.add(new Knowledge("кулинария"));

        KnowledgeService knowledgeService = new KnowledgeServiceImpl(knowList);

        ClientService clientService = new ClientServiceImpl(client, scanner, knowledgeService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();
    }
}
