package itsjava.collections.lists;

import itsjava.domain.Knowledge;
import itsjava.services.KnowledgeService;
import itsjava.services.KnowledgeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

@DisplayName("Класс KnowledgeService должен: ")
public class KnowledgeServiceTest {

    public static final List<Knowledge> DEFAULT_LIST =
            Arrays.asList(new Knowledge("медицина"),new Knowledge("образование"),new Knowledge("кулинария"));
    public static final List<Knowledge> DEFAULT_LIST_1 =
            Arrays.asList(new Knowledge("образование"),new Knowledge("кулинария"));
    public static final Knowledge DEFAULT_NAME = new Knowledge("медицина");
    public static final String DEFAULT_NAME_1 = "медицина";

    @DisplayName("иметь корректный конструктор")
    @Test
    public void shouldHaveCorrectConstructor(){
        KnowledgeService knowledgeService = new KnowledgeServiceImpl(DEFAULT_LIST);

        Assertions.assertEquals(DEFAULT_LIST, knowledgeService.getKnowledgelst());
    }

    @DisplayName("корректно удалять элемент списка")
    @Test
    public void shouldHaveCorrectTakeByName(){
        KnowledgeService knowledgeService = new KnowledgeServiceImpl(DEFAULT_LIST);
        knowledgeService.takeKnowledgeByName(DEFAULT_NAME_1);
        Assertions.assertEquals(DEFAULT_LIST_1, knowledgeService.getKnowledgelst());
    }

    @DisplayName("корректно добавлять элемент")
    @Test
    public void shouldHaveCorrectPutKnowledge(){
        KnowledgeService knowledgeService = new KnowledgeServiceImpl(DEFAULT_LIST);

        Assertions.assertEquals();
    }
}
