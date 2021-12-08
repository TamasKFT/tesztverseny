package hu.testathon.model.domain;

public class TestResult {

    private final String id;
    private final String answers;

    public TestResult(String id, String answer) {
        this.id = id;
        this.answers = answer;
    }

    public String getId() {
        return id;
    }

    public String getAnswer() {
        return answers;
    }
}
