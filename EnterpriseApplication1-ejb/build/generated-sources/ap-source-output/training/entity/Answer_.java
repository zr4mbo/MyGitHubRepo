package training.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import training.entity.Questions;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-15T18:51:43")
@StaticMetamodel(Answer.class)
public class Answer_ { 

    public static volatile SingularAttribute<Answer, Integer> answerId;
    public static volatile SingularAttribute<Answer, Questions> questionsId;
    public static volatile SingularAttribute<Answer, Boolean> correct;
    public static volatile SingularAttribute<Answer, String> answerText;

}