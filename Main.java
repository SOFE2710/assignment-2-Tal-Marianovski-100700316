package com.company;

public class Main {
    public String name;
    // constructors
   public void person(String initialName)
        {
            this.name = initialName;
        }
        public void setName(String fullName)
        {
            this.name = fullName;
        }
        //fill in constructors
        public String getName()
        {
            return this.getName();
        }

        public String toString()
        {
            return "The name: " + this.name;
        }
    }

