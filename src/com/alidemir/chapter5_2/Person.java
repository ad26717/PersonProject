package com.alidemir.chapter5_2;

public class Person {

    private String personName;
    private int personAge;

    /**
     * Creates a Person object with Name: Ali and Age: 19 initialized values
     */
    public Person(){
        personName = "Ali";
        personAge = 19;
    }

    /**
     * Create a Person object according to parameters
     * @param personName
     * @param personAge
     */
    public Person(String personName, int personAge){
        this.personName = personName;
        this.personAge = personAge;
    }

    /**
     *  Get the age of a person
     * @return personAge
     */
    public int getPersonAge() {
        return personAge;
    }

    /**
     * Get the name of a person
     * @return personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Set the age of a person according to parameter
     * @param personAge
     */
    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }
    /**
     * Set the name of a person according to parameter
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Prints the attributes of a person
     * @return whole result
     */
    public String toString() {
        return "Name: " + this.personName + " Age: " + this.personAge;
    }
}
