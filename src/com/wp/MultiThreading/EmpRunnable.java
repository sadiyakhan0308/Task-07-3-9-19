package com.wp.MultiThreading;
public class EmpRunnable implements Runnable {
int eno;
int salary;
String ename;

public EmpRunnable(int eno, int salary, String ename) {
this.eno = eno;
this.salary = salary;
this.ename = ename;
}

public void calculateSalary(int salary) {

int hra = (int) (0.1 * salary);

int da = (int) (0.2 * salary);
int ca = (int) (0.1 * salary);
System.out.println(Thread.currentThread().getName()+" " + "having enumber" + "  " + eno + "  " + "and having name :" + ename + " " + " "
+ "has hra :" + hra + " da :" + da + " " + "ca:" + " " + ca + "....");
}

@Override
public void run() {
calculateSalary(salary);

}

public static void main(String args[]) {
Thread t1 = new Thread(new EmpRunnable(100, 20000, "Sadiya"));
t1.setName("Employee1");
Thread t2 = new Thread(new EmpRunnable(101, 500, "Amit"));
t2.setName("Employee2");
Thread t3 = new Thread(new EmpRunnable(103, 80000, "Hari"));
t3.setName("Employee3");
Thread t4 = new Thread(new EmpRunnable(104, 90000, "Adi"));
t4.setName("Employee4");
t1.start();
t2.start();
t3.start();
t4.start();
}

}
