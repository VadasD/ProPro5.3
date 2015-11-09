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
      Task task1 = new Task("Write another Java program");
      task1.setPriority(7);
      Task task2 = new Task("Eat");
      task2.setPriority(Priority.MIN_PRIORITY);
      Task task3 = new Task("Attend class");
      task3.setPriority(Priority.MAX_PRIORITY);
      Task task4 = new Task("Sleep");
      task4.setPriority(4);

      System.out.println("  TO-DO\n------------");
      System.out.println(task1.getName() + " \tpriority: " + task1.getPriority());
      System.out.println(task2.getName() + " \tpriority: " + task2.getPriority());
      System.out.println(task3.getName() + " \tpriority: " + task3.getPriority());
      System.out.println(task4.getName() + " \tpriority: " + task4.getPriority());

   }
}
