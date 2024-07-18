package cat.proven.employeefilepersist;

import cat.proven.employeefilepersist.model.Employee;
import cat.proven.employeefilepersist.model.persist.EmployeeBinFilePersist;
import cat.proven.employeefilepersist.model.persist.PersistInterface;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class ReadBin {

    public static void main(String[] args) {
        String filename = "";
        if (args.length == 1) {
            filename = args[0];
        } else {
            System.out.println("Usage: ReadObj filename");
        }

        //We don't need to check for Exceptions here, persister class does it already
        PersistInterface persister = new EmployeeBinFilePersist();
        List<Employee> data = persister.readList(filename);
        //Show data
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }

    }

}
