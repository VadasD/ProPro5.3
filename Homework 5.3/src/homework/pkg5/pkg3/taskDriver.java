/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg5.pkg3;

/**
 *
 * @author Paul
 */
public class taskDriver
{
   public static void main(String args[])
   {
      Task task1 = new Task("Work");
      task1.setPriority(Priority.MED_PRIORITY);
      Task task2 = new Task("Eat");
      task2.setPriority(Priority.MIN_PRIORITY);
      Task task3 = new Task("Pay Taxes");
      task3.setPriority(Priority.MAX_PRIORITY);
      Task task4 = new Task("Die");
      task4.setPriority(3);

      System.out.println("  To Do List:");
      System.out.println(task1.getName() + " is priority: " + task1.getPriority());
      System.out.println(task2.getName() + " is priority: " + task2.getPriority());
      System.out.println(task3.getName() + " is priority: " + task3.getPriority());
      System.out.println(task4.getName() + " is priority: " + task4.getPriority());

   }
}
