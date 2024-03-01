package com.linkedin.javacodechallenges;

public class Person {
  String first_name;
  String last_name;

  // get set method
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // constructor
  public Person(String first_name, String last_name) {
    this.first_name = first_name;
    this.last_name = last_name;
  }

  // method for introduction of a person
  public void introduction() {
    System.out.println(
        "My name is " + this.first_name + " " + this.last_name + ". " + "I am " + this.getAge() + " years old.");
  }

}