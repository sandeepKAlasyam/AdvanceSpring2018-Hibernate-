package com.bellinfo.spring.project.pa.Repository;

import com.bellinfo.spring.project.pa.Model.ApartmentRentals;

import java.util.List;

public interface BasicCollections {

    void addApartmentRentals(ApartmentRentals apartmentRentals);
    void updateApartmentRentals(ApartmentRentals apartmentRentals);
    List<ApartmentRentals> getApartmentRentals();
    ApartmentRentals getApartmentRentals(int id);

    void DeleteApartmentRentals(int id);








}
