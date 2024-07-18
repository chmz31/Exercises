package cat.proven.employeefilepersist.model.persist;

import cat.proven.employeefilepersist.model.Employee;
import java.util.List;

/**
 *
 * @author ProvenSoft
 * 
 */
public interface PersistInterface {
    /**
     * writes a list to a file
     * @param filename the path to file to write list
     * @param data the list to write to file
     * @return number of elements written
     */
    public int writeList(String filename, List<Employee> data);
    /**
     * reads a list from a file
     * @param filename the path to file to read from
     * @return list with read data
     */
    public List<Employee> readList(String filename);
}
