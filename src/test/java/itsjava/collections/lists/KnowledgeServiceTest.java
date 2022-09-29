package itsjava.collections.lists;

import itsjava.domain.Knowledge;
import itsjava.services.KnowledgeService;
import itsjava.services.KnowledgeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Класс KnowledgeService должен: ")
public class KnowledgeServiceTest {

    public static final List<Knowledge> knowledgeList = new ArrayList<>();
    public static final List<Knowledge> DEFAULT_LIST_1 =
            Arrays.asList(new Knowledge("образование"),new Knowledge("кулинария"));
    public static final List<Knowledge> DEFAULT_LIST_2 =
            Arrays.asList(new Knowledge("медицина"),new Knowledge("образование"),
                    new Knowledge("кулинария"),new Knowledge("промышленность"));

    public void addKnows(){
        knowledgeList.add(new Knowledge("медицина"));
        knowledgeList.add(new Knowledge("образование"));
        knowledgeList.add(new Knowledge("кулинария"));
    }

    @DisplayName("иметь корректный конструктор")
    @Test
    public void shouldHaveCorrectConstructor(){
        KnowledgeService knowledgeService = new KnowledgeServiceImpl(knowledgeList);
        addKnows();

        Assertions.assertEquals(knowledgeList, knowledgeService.getKnowledgelst());
    }

    @DisplayName("корректно удалять элемент списка")
    @Test
    public void shouldHaveCorrectTakeByName(){
        KnowledgeService knowledgeService = new KnowledgeServiceImpl(knowledgeList);
        addKnows();
        knowledgeService.takeKnowledgeByName("медицина");

        Assertions.assertEquals(DEFAULT_LIST_1, knowledgeService.getKnowledgelst());
    }

    @DisplayName("корректно добавлять элемент")
    @Test
    public void shouldHaveCorrectPutKnowledge(){
        KnowledgeService knowledgeService = new KnowledgeServiceImpl(knowledgeList);
        addKnows();
        knowledgeService.putKnowledge(new Knowledge("промышленность"));

        Assertions.assertEquals(DEFAULT_LIST_2, knowledgeService.getKnowledgelst());
    }
}
