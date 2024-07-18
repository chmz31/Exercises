
package cat.proven.employeefilepersist;

import cat.proven.employeefilepersist.model.Employee;
import cat.proven.employeefilepersist.model.Staff;
import cat.proven.employeefilepersist.model.persist.EmployeeObjFilePersist;
import cat.proven.employeefilepersist.model.persist.PersistInterface;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class WriteObj {

    public static void main(String[] args) {
        String filename = "mystaff.txt"; //TODO read this from arguments
        Staff model = new Staff();
        List<Employee> data = model.generateTestData();
        //TODO treat all errors.
        PersistInterface persister = new EmployeeObjFilePersist();
        int written = persister.writeList(filename, data);
        System.out.format("%d employees written\n", written);
    }

}
