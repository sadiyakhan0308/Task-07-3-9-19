package com.wp.MultiThreading;
public class EmpThread extends Thread {
int eno;
int salary;
String ename;

public EmpThread(int eno, int salary, String ename) {
this.eno = eno;
this.salary = salary;
this.ename = ename;
}

public void calculateSalary(int salary) {

int hra = (int) (0.1 * salary);

int da = (int) (0.2 * salary);
int ca = (int) (0.1 * salary);
System.out.println(currentThread().getName() + " " + "having enumber" + "  " + eno + "  " + "and having name "
+ ename + " " + " " + "has hra :" + hra + " da :" + da + " " + "ca:" + " " + ca + "....");
}

@Override
public void run() {
calculateSalary(salary);

}

public static void main(String args[]) {

EmpThread empthread1 = new EmpThread(100, 20000, "Sadiya");
empthread1.setName("Employee1");
EmpThread empthread2 = new EmpThread(101, 40000, "Ashi");
empthread2.setName("Employee2");
EmpThread empthread3 = new EmpThread(102, 900, "Anjali");
empthread3.setName("Employee3");
EmpThread empthread4 = new EmpThread(1004, 7000, "Faizan");
empthread4.setName("Employee4");
empthread1.start();
empthread2.start();
empthread3.start();
empthread4.start();


}

}


