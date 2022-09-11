package hw09;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class MainEmployeeMap {
    public static void main(String[] args) throws IOException {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Tom");
        employeeMap.put(2, "Jerry");
        employeeMap.put(3, "Ava");
        employeeMap.put(4, "Lisa");
        employeeMap.put(5, "David");
        employeeMap.put(6, "Lisa");
        employeeMap.put(7, "Amy");
        System.out.println("employeeMap: " + employeeMap);

        MainEmployeeMap obj = new MainEmployeeMap();

        System.out.print("Enter ID (1-" + employeeMap.size() + "): ");
        int enterID = new Scanner(System.in).nextInt();

        System.out.print("Enter the employee's name : ");
        String enterNameEmployee = new Scanner(System.in).nextLine();
        enterNameEmployee = enterNameEmployee.substring(0, 1).toUpperCase()
                + enterNameEmployee.substring(1).toLowerCase();

        System.out.println(obj.findEmployeeID(employeeMap, enterID) + "\n"
                + obj.findEmployeeName(employeeMap, enterNameEmployee));
    }

    public String findEmployeeID(Map<Integer, String> _employeeMap, int _enterID) {
        String answerEmployeeID;
        if (_employeeMap.containsKey(_enterID)) {
            answerEmployeeID = "You entered ID: " + _enterID
                    + ", the name of the employee: " + _employeeMap.get(_enterID) + ".";
        } else {
            answerEmployeeID = "No employee was found for this ID: " + _enterID;
        }
        return answerEmployeeID;
    }

    public String findEmployeeName(Map<Integer, String> _employeeMap, String _enterNameEmployee) {
        String answerEmployeeName = null;
        if (_employeeMap.containsValue(_enterNameEmployee)) {
            for (Map.Entry<Integer, String> mapEmployee : _employeeMap.entrySet()) {
                if (mapEmployee.getValue().equals(_enterNameEmployee)) {
                    answerEmployeeName = "Employee name: " + mapEmployee.getValue() + ", ID: " + mapEmployee.getKey();
                }
            }
        } else {
            answerEmployeeName = "No employee was found for this name: " + _enterNameEmployee;
        }
        return answerEmployeeName;
    }
}
