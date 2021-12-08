package hu.testathon.model.service;

import hu.testathon.model.DataParser;
import hu.testathon.model.domain.TestValidator;

import java.util.List;

public class DataApi {

    private final DataParser dataParser;
    private final List<String> lines;

    public DataApi(String filename, FileReader filereader, DataParser dataParser, List<String> lines) {
        this.dataParser = dataParser;
        this.lines = fileReader.read(filename);
    }

    public TestValidator createValidator() {
        return new TestValidator(dataParser.getAnswers())
    }
}
