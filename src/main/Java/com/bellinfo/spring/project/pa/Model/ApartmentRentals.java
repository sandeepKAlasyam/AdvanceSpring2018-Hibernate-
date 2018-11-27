package com.bellinfo.spring.project.pa.Model;

import javax.persistence.*;

@Entity
public class ApartmentRentals {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
String Id;

@Column
String name;
@Column
String location;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ApartmentRentals{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
