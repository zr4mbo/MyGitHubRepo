package training.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import training.entity.Userpoints;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-15T18:51:43")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Userpoints> userpointsCollection;
    public static volatile SingularAttribute<Users, Integer> usersId;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> username;

}