package com.shaik.messageintegration.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="100k")
public class GetAllMessagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int id;

    @Column(name = "name")
    public String name;

    @Column(name = "gender")
    String gender;

    @Column(name = "age")
    public int age;

    @Column(name = "addressstate")
    public String 	addressState;

    @Column(name = "addresscity")
    public String 	addressCity;

    public GetAllMessagesEntity(int id, String name, String gender, int age, String addressState, String addressCity) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.addressState = addressState;
        this.addressCity = addressCity;
    }

    public GetAllMessagesEntity() {
        super();
    }

    @Override
    public String toString() {
        return "GetAllMessagesEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", addressState='" + addressState + '\'' +
                ", addressCity='" + addressCity + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddressState() {
        return addressState;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }
}
