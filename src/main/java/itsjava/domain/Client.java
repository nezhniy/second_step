package itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
public class Client {
    private final String name;
    private final List<Knowledge> knowledges;
}
