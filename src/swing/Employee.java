/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JOptionPane;

/**
 *
 * @author t0ni
 */
public class Employee {
    private int id ;
    private String name ;
    private String address ;
    private int rank ;
    private int HoursWorked ;
    private int OvertimeHours ;
    private int salary ;
    
    public Employee(int id, String name, String address, int rank, int HoursWorked, int OvertimeHours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rank = rank;
        this.HoursWorked = HoursWorked;
        this.OvertimeHours = OvertimeHours;
        calcPayment(rank);
    }
    public void calcPayment(int rank){
        try {
            switch(this.rank){
            //1 hour =10$ 1 over =14$ for rank 1
            case 1:salary=(int) ((10*this.HoursWorked)+(14*this.OvertimeHours));break;
            //1 hour =8$ 1 over =10$ for rank 2
            case 2:salary=(int) ((8*this.HoursWorked)+(10*this.OvertimeHours));break;
            //1 hour =5$ 1 over =7$ for rank 3
            case 3:salary=(int) ((5*this.HoursWorked)+(7*this.OvertimeHours));break;
            
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRank() {
        return rank;
    }

    public int getHoursWorked() {
        return HoursWorked;
    }

    public int getOvertimeHours() {
        return OvertimeHours;
    }
    public int getSalary(){
        return salary;
    }
    
}   
