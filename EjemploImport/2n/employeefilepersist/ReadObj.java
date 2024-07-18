
package cat.proven.employeefilepersist;

import cat.proven.employeefilepersist.model.Employee;
import cat.proven.employeefilepersist.model.persist.EmployeeObjFilePersist;
import cat.proven.employeefilepersist.model.persist.PersistInterface;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class ReadObj {

    public static void main(String[] args) {
        String filename = "mystaff.txt"; //TODO read this from arguments
        //TODO treat all errors.
        PersistInterface persister = new EmployeeObjFilePersist();
        List<Employee> data = persister.readList(filename);
        System.out.format("TODO: Show data"); //TODO
    }
    
     
}
