package cat.proven.employeefilepersist.model.persist;

import cat.proven.employeefilepersist.model.Employee;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProvenSoft
 */
public class EmployeeObjFilePersist implements PersistInterface {

    @Override
    public int writeList(String filename, List<Employee> data) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(data);
            fos.close();
            ous.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("I/O Error: " + ex.getMessage());
        }
        return data.size();
    }

    @Override
    public List<Employee> readList(String filename) {
        List<Employee> aux = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            aux = (List<Employee>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.err.println("Error");
        }

        return aux;
    }

}
