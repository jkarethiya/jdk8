/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 11-Jul-2015 9:05:01 pm
 */
package com.jk.jdk.j2se.core.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonProblemExample {

    public static void main(String[] args) {
          Singleton obj = Singleton.getInstance();
          System.out.println("After NEW Object creation : " + obj);

          obj.i = 5;
          System.out.println("Object modified");
          System.out.println("After Object 1st Modification : " + obj);

          serializeMe();
          System.out.println("Serialized successfully with object state : " + obj);

          obj.i = 10;
          System.out.println("Object modified again");
          System.out.println("After Object 2nd Modification : " + obj);

          Singleton st = (Singleton)deSerializeMe();
          System.out.println("Deserialized successfully");

          System.out.println("After Deserialization : " + st);
    }

    public static void serializeMe() {
          FileOutputStream fos;
          ObjectOutputStream oos = null;

          try {
             oos = new ObjectOutputStream(new FileOutputStream("d:\\SingletonData.txt"));
             oos.writeObject(Singleton.getInstance());
          } catch (FileNotFoundException e) {  
             e.printStackTrace();  
          } catch (IOException e) {  
             e.printStackTrace();  
          } 
       }

       public static Object deSerializeMe() {
          ObjectInputStream oin = null;
          Object obj = null;

          try {
             oin = new ObjectInputStream(new FileInputStream("d:\\SingletonData.txt"));
             obj = oin.readObject();
          } catch (FileNotFoundException e) {  
             e.printStackTrace();  
          } catch (IOException e) {  
             e.printStackTrace();  
          } catch (ClassNotFoundException e) {  
             e.printStackTrace();  
          } 

          return obj;
       }

}

class Singleton implements Serializable {
   private static final long serialVersionUID = 8484652342104816333L;

   int i;
   
   private static Singleton obj = null;

   private Singleton() {
      System.out.println("Executing constructor");
      i=1;
   }

   public static synchronized Singleton getInstance() {
      if(obj == null) {
         obj = new Singleton();
      }
      System.out.println("An instance is returned");
      return obj;
   }

   private void writeObject(ObjectOutputStream oos) {
   try {
       oos.writeInt(i);
   } catch (Exception e) {
       e.printStackTrace();
   }
   }

   private void readObject(ObjectInputStream ois) {
   try {
       i = ois.readInt();
   } catch (Exception e) {
       e.printStackTrace();
   }
   }

   public Object readResolve() {
      System.out.println("Executing readResolve");
      return obj;
   }

   @Override
   public String toString() {
      return "Singleton [i=" + i + "]";
   }
}