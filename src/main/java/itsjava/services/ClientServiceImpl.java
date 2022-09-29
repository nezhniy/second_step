package itsjava.services;

import itsjava.domain.Client;
import itsjava.domain.Knowledge;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final Client client;
    private final Scanner scanner;
    private final KnowledgeService knowledgeService;

    @Override
    public void buyKnowledge() {
        System.out.println("Введите знание:");
        String knowName = scanner.next();
        if (knowledgeService.hasKnowledge(knowName)){
            knowledgeService.takeKnowledgeByName(knowName);
            System.out.println("Взяли знание.");
        }
    }

    @Override
    public void putKnowledge() {
        System.out.println("Введите знание");
        String name = scanner.next();
        Knowledge knowledge = new Knowledge(name);
        knowledgeService.putKnowledge(knowledge);
    }

    @Override
    public void printKnowledges() {
        System.out.println("Дорогой " + client.getName());
        System.out.println("Наши знания:");
        knowledgeService.printKnowledges();
    }
}
