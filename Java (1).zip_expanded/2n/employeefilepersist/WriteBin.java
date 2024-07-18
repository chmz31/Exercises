package cat.proven.employeefilepersist;

import cat.proven.employeefilepersist.model.Employee;
import cat.proven.employeefilepersist.model.Staff;
import cat.proven.employeefilepersist.model.persist.EmployeeBinFilePersist;
import cat.proven.employeefilepersist.model.persist.PersistInterface;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class WriteBin {

    public static void main(String[] args) {
        String filename = ""; 
        if (args.length > 0) {
            filename = args[0];
        } else if (args.length <= 0) {
            System.out.println("Usage: WriteBin filename");
        }
        Staff model = new Staff();
        List<Employee> data = model.generateTestData();
        //TODO treat all errors.
        PersistInterface persister = new EmployeeBinFilePersist();
        int written = persister.writeList(filename, data);
        System.out.format("%d employees written\n", written);
    }

}
