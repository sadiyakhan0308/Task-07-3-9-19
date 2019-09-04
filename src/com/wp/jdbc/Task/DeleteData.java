package com.wp.jdbc.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

public static void main(String[] args) {
   System.out.println("Enter Employee Number of employee you want to delete");
   Scanner sc=new Scanner(System.in);
   int eid=sc.nextInt();
   Connection con=Connectionjdbc.Conn();
String qr="Delete from emp where Eno="+eid;

try {
PreparedStatement ps = con.prepareStatement(qr);
ps.executeUpdate();
System.out.println("Deleted successfully........");

} catch (SQLException e) {
e.printStackTrace();
}

}

}




