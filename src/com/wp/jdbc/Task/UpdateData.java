package com.wp.jdbc.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

public static void main(String[] args) {
System.out.println("Please Enter employee details to update: ");
   System.out.println("Enter Employee Number which you want to update ");
   Scanner sc=new Scanner(System.in);
   int eno=sc.nextInt();
   System.out.println("Please Enter employee details: ");
   System.out.println("Enter Employee Name");
   String ename=sc.next();
   System.out.println("Enter Employee salary");
   int sal=sc.nextInt();
   System.out.println("Enter Employee Department");
   String dept=sc.next();
   System.out.println("Enter Employee Designation");
   String desig=sc.next();
   Connection con=Connectionjdbc.Conn();
String qr="Update emp set Ename='"+ename+"',Salary='"+sal+"',Department='"+dept+"',Designation='"+desig+"'where Eno="+eno;
try {
PreparedStatement ps = con.prepareStatement(qr);
ps.executeUpdate();
System.out.println("Updated successfully........");

} catch (SQLException e) {
e.printStackTrace();
}

}

}


