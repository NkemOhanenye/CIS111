package Labs.Lab7;

/**
 *Author: Nkem Ohanenye
 *Date: 03/30/17
 *Purpose: Create a program
 *that displays an employee
 *ID and asks the user to enter
 *the employee's hours and payrate
 *then prints the gross pay
 */
 
public class PayRoll{
    /**
     * creates a static int that cant be changed but 
     * can be used around the class
     */
    private static final int size = 7;
    /**
     * the array variables for the file
     */
    int[] employeeID = {5658845, 4520125, 7895122,
                8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[size];
    private double[] payRate = new double[size];
    private double[] wages = new double[size];

    /**
     * sets the ID array
     * @param index adds the index to the array
     * @param ID changes the name 
     */
    public void setID(int index, int ID){
        employeeID[index] = ID;
    }

    /**
     * sets the Hr array
     * @param index adds the index to the array
     * @param hr changes the name
     */
    public void setHr(int index, int hr){
        hours[index] = hr;
    }

    /**
     * sets the Pay array
     * @param index adds the index to the array
     * @param pay changes the name
     */
    public void setPay(int index, double pay){
        payRate[index] = pay;
    }

    /**
     * sets the wage array
     * @param index adds the index to the array
     * @param wage changes the name
     */
    public void setWage(int index, double wage){
        wages[index] = wage;
    }

    /**
     * creates a getter for the ID
     * @param index makes the index be used 
     * @return employee index
     */
    public int getID(int index){
        return employeeID[index];
    }

    /**
     * creates a getter for the Hr
     * @param index makes the index be used
     * @return hours index
     */
    public int getHr(int index){
        return hours[index];
    }

    /**
     * creates a getter for the Pay
     * @param index makes the index be used
     * @return payRate index
     */
    public double getPay(int index){
        return payRate[index];
    }

    /**
     * creates a getter for the Wage
     * @param index makes the index be used
     * @return wages index
     */
    public double getWage(int index){
        return wages[index];
    }

    /**
     * grabs the index (7) and uses it to use the index variable
     * with the size and multiplies the hours and payrate for the 
     * gross pay
     */
    public void GrossPay(){
        for (int index = 0; index < employeeID.length; index++){
            wages[index] = hours[index] * payRate[index];
        }
    }
}    
