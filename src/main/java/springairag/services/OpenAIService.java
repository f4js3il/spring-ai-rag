package springairag.services;


import springairag.model.Answer;
import springairag.model.Question;

public interface OpenAIService {

    Answer getAnswer(Question question);

}
