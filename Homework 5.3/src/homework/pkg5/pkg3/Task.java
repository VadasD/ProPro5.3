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
public class Task implements Priority

{
   private int priority;
   String name;


   public Task(String taskName)
   {
      name = taskName;
      priority = MED_PRIORITY;
   }

   String getName()
   {
      return name;
   }

   
   public void setPriority(int value)
   {
      priority = value;
   }

   
   public int getPriority()
   {
      return priority;
   }
}


