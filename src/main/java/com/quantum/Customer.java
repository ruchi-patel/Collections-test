package com.quantum;

/**
 * 21. Create a customer class with details like name, age, ssn, address, city, zipcode.
 * Write test for this class to test the values of customer object if they match the values when the object was created.
 * 22. For same customer class add exception AgeCanNotBeNegativeException.
 * when the we try to set the age as negative number throw the exception with message "Age Can not be negative number".
 * Write unit test case to test this exception and message.
 */

public class Customer implements Comparable<Customer> {
    String name;
    int age;
    int ssn;
    String address;
    String city;
    int zipcode;

    public Customer(String name, int age, int ssn, String address, String city, int zipcode) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;

        if (this.age < 0) {
            throw new NegativeAgeException("Age Can not be negative number");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", ssn=" + ssn +
            ", address='" + address + '\'' +
            ", city='" + city + '\'' +
            ", zipcode=" + zipcode +
            '}';
    }

    @Override
    public int compareTo(Customer o) {

        return this.age - o.getAge();
    }
}

