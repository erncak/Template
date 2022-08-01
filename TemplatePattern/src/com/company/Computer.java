package com.company;

public abstract class Computer {
   public abstract void memory();
   public abstract void cpu();
   public abstract void storege();
   public abstract void connect();
   public final void set(){
       memory();
       cpu();
       storege();
       connect();
       
   }

}
