import java.util.ArrayList;
import persistence.entities.Role;
import persistence.entities.RoleDAO;
import persistence.entities.User;
import persistence.entities.UserDAO;

public class TestarPersistence {
 
    public static void main(String[] args) {
        try {
            //createUsers();            
            //showAllUser();
            //createRoles();
            //showAllRoles();                        
            adicionarRole(1, 2);               
        } catch (Exception ex) {
            System.out.println("Ocorreu algum erro: " + ex.getMessage());
        }
        
    }
    
    private static void createUsers() throws Exception {
        System.out.println("Criando usuários...");
        UserDAO dao = new UserDAO();
        User admin = (User) dao.getNewInstance();
        admin.setName("Administrador155");

        User guest = (User) dao.getNewInstance();
        guest.setName("Convidado155");
        
        User user = (User) dao.getNewInstance();
        user.setName("Ayrton Senna155");

        dao.create(admin);
        dao.create(guest);
        dao.create(user);

        System.out.print(" OK!");

    } 
    
    private static void createRoles() throws Exception {
        System.out.println("Criando Regras...");
        RoleDAO dao = new RoleDAO();
        Role role1 = (Role) dao.getNewInstance();
        role1.setName("Super Usuário");

        Role role2 = (Role) dao.getNewInstance();
        role2.setName("Administrador");
        
        Role role3 = (Role) dao.getNewInstance();
        role3.setName("Representante");

        dao.create(role1);
        dao.create(role2);
        dao.create(role3);

        System.out.print(" OK!");

    } 
    
    private static void showAllUser() throws Exception {         
        UserDAO dao = new UserDAO();        
        ArrayList users = (ArrayList) dao.findAll();
        User o;
        
        System.out.println("Listando Usuários...");
        
        for (int i=0; i<users.size(); i++) {
            o = (User) users.get(i);
            System.out.println("Id: " + o.getId() + " - " +  "Nome: " + o.getName());
        }                
        
        User admin = (User) dao.getNewInstance();       
        
    }    

     private static void showAllRoles() throws Exception {         
        RoleDAO dao = new RoleDAO();        
        ArrayList users = (ArrayList) dao.findAll();
        Role o;
        
        System.out.println("Listando Regras...");
        
        for (int i=0; i<users.size(); i++) {
            o = (Role) users.get(i);
            System.out.println("Id: " + o.getId() + " - " +  "Regra: " + o.getName());
        }                
        
        Role admin = (Role) dao.getNewInstance();       
        
    }
     
     private static void adicionarRole(int user, int role) throws Exception {
        System.out.println("Adicionando Regras"); 
        UserDAO daou = new UserDAO();
        RoleDAO daor = new RoleDAO();
        User userObj = (User) daou.findById(user); 
        Role roleObj = (Role) daor.findById(role); 
        userObj.addRole(roleObj);        
    }    
}
