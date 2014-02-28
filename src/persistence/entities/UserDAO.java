package persistence.entities;

/**
 *
 * @author Fabrício Ronchi
 * 
 */
public class UserDAO extends GenericDAO {

    @Override
    protected String getNamedQueryToFindAll() {
        return "user.find.all";
    }
    
    @Override
    protected String getNamedQueryToFindById() {
        return "user.id.equals";
    }

    @Override
    protected String getNamedQueryToFindByName() {
        return "user.name.equals";
    }    
 
    @Override
    protected String getNamedQueryToCountAll() {
        return "user.count.all";
    }     

    @Override
    protected String getNamedQueryToRemoveAll() {
        return "user.remove.all";
    }     

    @Override
    protected String getNamedQueryToFindByRange() {
        return "user.find.range";
    }     

    @Override
    public Object getNewInstance() {
        return new User();
    }   
    
}