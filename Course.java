import java.text.*;

public class Course
{
  public static void main(String[] args)
  {
    System.out.format("%-13s %-9s %-8s", "\t   Course","Teacher","Room#");
    System.out.format("%-13s %-9s %-10s %-7s", "\nPeriod 1","MCR3U3","Mr. Wu","333");
    System.out.format("%-13s %-8s %-11s %-5s", "\nPeriod 2","ICS3U1","MS. Navabi","362");
    System.out.format("%-14s %-7s", "\nPeriod 3","Lunch");
    System.out.format("%-12s %-8s %-11s %-5s", "\nPeriod 4","COOPPM-34","Mr.Schafer","110");
    System.out.format("%-12s %-8s %-11s %-5s", "\nPeriod 5","COOPPM-34","Mr.Schafer","141");
  }
}