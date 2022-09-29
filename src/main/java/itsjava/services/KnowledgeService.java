package itsjava.services;

import itsjava.domain.Knowledge;

import java.util.ArrayList;
import java.util.List;

public interface KnowledgeService {
    Knowledge takeKnowledgeByName(String name);
    void putKnowledge(Knowledge knowledge);
    boolean hasKnowledge(String name);
    void printKnowledges();
    List<Knowledge> getKnowledgelst();
}
