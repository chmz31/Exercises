package cat.proven.employeefilepersist.model.persist;

import cat.proven.employeefilepersist.model.Address;
import cat.proven.employeefilepersist.model.Employee;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
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
 * File persistence implementationn for lists of employees in binary format
 *
 * @author ProvenSoft
 */
public class EmployeeBinFilePersist implements PersistInterface {

    /**
     * writes a list of employees to a file in binary format
     */
    @Override
    public int writeList(String filename, List<Employee> data) {
        int counter = 0;
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            DataOutputStream dos = new DataOutputStream(fos);
            for (Employee employee : data) {
                dos.writeUTF(employee.getPhone());
                dos.writeUTF(employee.getName());
                dos.writeInt(employee.getAge());
                dos.writeBoolean(employee.isSenior());
                dos.writeDouble(employee.getSalary());
                counter++; //we add to the counter each employee we add to the file
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex.getMessage());
        }

        return counter;
    }

    /**
     * reads a list of employees from a file in binary format
     */
    @Override
    public List<Employee> readList(String filename) {
        ArrayList<Employee> aux = new ArrayList<Employee>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(fis);
            while (dis.available() > 0) {
                //We add all the employees to the List
                aux.add(new Employee(dis.readUTF(), dis.readUTF(), dis.readInt(), dis.readBoolean(), dis.readDouble()));
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex.getMessage());
        }
        return aux; //We return the list full of employees
    }
}
