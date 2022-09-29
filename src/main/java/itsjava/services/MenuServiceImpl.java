package itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true){
            printMenu();
            System.out.println("Введите номер меню:");
            int menuNum = scanner.nextInt();

            if (menuNum == 1){
                System.out.println("берешь знание");
                clientService.buyKnowledge();
            } else if (menuNum == 2){
                System.out.println("кладешь знание");
                clientService.putKnowledge();
            } else if (menuNum == 3) {
                System.out.println("доступные знания");
                clientService.printKnowledges();
            } else {
                System.out.println("пока");
                break;
            }
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1 - взять знание; 2 - отдать знание; 3 - посмотреть доступные знания; остальное - выход");
    }
}
