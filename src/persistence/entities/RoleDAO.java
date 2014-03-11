package persistence.entities;

/**
 *
 * @author Fabrício Ronchi
 * 
 */
public class RoleDAO extends GenericDAO {

    @Override
    protected String getNamedQueryToFindAll() {
        return "ROLES.find.all";
    }
    
    @Override
    protected String getNamedQueryToFindById() {
        return "ROLES.id.equals";
    }

    @Override
    protected String getNamedQueryToFindByName() {
        return "ROLES.name.equals";
    }    
 
    @Override
    protected String getNamedQueryToCountAll() {
        return "ROLES.count.all";
    }     

    @Override
    protected String getNamedQueryToRemoveAll() {
        return "ROLES.remove.all";
    }     

    @Override
    protected String getNamedQueryToFindByRange() {
        return "ROLES.find.range";
    }     

    @Override
    public Object getNewInstance() {
        return new Role();
    }   
    
}