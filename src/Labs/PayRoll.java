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
     *
     */
    private static final int size = 7;
    /**
     *
     */
    int[] employeeID = {5658845, 4520125, 7895122,
                8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[size];
    private double[] payRate = new double[size];
    private double[] wages = new double[size];

    /**
     *
     * @param index
     * @param ID
     */
    public void setID(int index, int ID){
        employeeID[index] = ID;
    }

    /**
     *
     * @param index
     * @param hr
     */
    public void setHr(int index, int hr){
        hours[index] = hr;
    }

    /**
     *
     * @param index
     * @param pay
     */
    public void setPay(int index, double pay){
        payRate[index] = pay;
    }

    /**
     *
     * @param index
     * @param wage
     */
    public void setWage(int index, double wage){
        wages[index] = wage;
    }

    /**
     *
     * @param index
     * @return
     */
    public int getID(int index){
        return employeeID[index];
    }

    /**
     *
     * @param index
     * @return
     */
    public int getHr(int index){
        return hours[index];
    }

    /**
     *
     * @param index
     * @return
     */
    public double getPay(int index){
        return payRate[index];
    }

    /**
     *
     * @param index
     * @return
     */
    public double getWage(int index){
        return wages[index];
    }

    /**
     *
     */
    public void GrossPay(){
        for (int index = 0; index < employeeID.length; index++){
            wages[index] = hours[index] * payRate[index];
        }
    }
}    
