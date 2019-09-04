package com.wp.jdbc.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterTable {

public static void main(String[] args) {
Connection con=Connectionjdbc.Conn();
Scanner sc=new Scanner(System.in);
String qr="Create table dept(deptno INTEGER not NULL,Dname varchar(40),PRIMARY KEY(deptno))";

try {
PreparedStatement ps = con.prepareStatement(qr);
ps.executeUpdate();
System.out.println("Dept table Created successfully........");

} catch (Exception e) {
e.printStackTrace();
}
      System.out.println("Press 1 if you want to alter an existing table");
     if(sc.nextInt()==1)
    {
   	boolean t_exist = false;
   	System.out.println("Enter name of table you want to alter");
   	String table=sc.next();
   	try(ResultSet rs=con.getMetaData().getTables(null,null, table, null)){
   	while(rs.next()) {
   	String t_name=rs.getString("TABLE_NAME");
   	if(t_name!=null && table.equals(table))
   	t_exist = true;
   	if(t_exist)
   	System.out.println("table exist");
   	else
   	System.out.println("Table not exist");
   	System.out.println("which column you want to change");
   	String column=sc.next();
   	System.out.println("Enter the new name");
   	String newcol=sc.next();
   	String query="Alter table "+t_name+" CHANGE "+column +" "+newcol+""+" INT NOT NULL";
   	System.out.println(query);
   	PreparedStatement ps = con.prepareStatement(query);
   	ps.executeUpdate();
   	System.out.println("Altered successfully........");
   	
   	break;
   	}
   	} catch (SQLException e) {

e.printStackTrace();
}
   	finally{
   	sc.close();
   	}
   	
    }
   	 
}


}



