package itsjava.services;

import itsjava.domain.Knowledge;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class KnowledgeServiceImpl implements KnowledgeService {
    private final List<Knowledge> knowledgesFromStore;

    @Override
    public Knowledge takeKnowledgeByName(String name) {
        Knowledge resKnowledge = null;
        for (Knowledge knowledge : knowledgesFromStore) {
            if (knowledge.getName().equals(name)) {
                resKnowledge = knowledge;
            }
        }
        if (resKnowledge != null) {
            knowledgesFromStore.remove(resKnowledge);
            return resKnowledge;
        }
        return null;
    }

    @Override
    public void putKnowledge(Knowledge knowledge) {
        knowledgesFromStore.add(knowledge);
    }

    @Override
    public boolean hasKnowledge(String name) {
        for (Knowledge knowledge: knowledgesFromStore){
            if (knowledge.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void printKnowledges() {
        for (Knowledge knowledge: knowledgesFromStore){
            System.out.println(knowledge.getName() + " ");
        }
    }

    @Override
    public List<Knowledge> getKnowledgelst() {
        return knowledgesFromStore;
    }
}
