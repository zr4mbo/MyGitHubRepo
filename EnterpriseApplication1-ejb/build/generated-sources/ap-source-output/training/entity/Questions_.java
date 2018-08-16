package training.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import training.entity.Answer;
import training.entity.Category;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-15T18:51:43")
@StaticMetamodel(Questions.class)
public class Questions_ { 

    public static volatile SingularAttribute<Questions, Integer> questionsId;
    public static volatile SingularAttribute<Questions, String> question;
    public static volatile CollectionAttribute<Questions, Answer> answerCollection;
    public static volatile SingularAttribute<Questions, String> questiontype;
    public static volatile SingularAttribute<Questions, Category> categoryId;

}