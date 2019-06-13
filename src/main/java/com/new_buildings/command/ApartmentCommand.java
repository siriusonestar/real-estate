package com.new_buildings.command;


import com.new_buildings.entities.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
@NoArgsConstructor
public class ApartmentCommand {

    private Long id;
    private AddressCommand address;
    private Byte[] image;
    private int floor;
    private int numberOfApartment;
    private int numberOfRooms;
    private double square;
    private int pricePerSquare;
    private int fullPrice;
    private Status status;

    @Override
    public String toString() {
        return "ApartmentCommand{" +
                "id=" + id +
                ", address=" + address +
                ", image=" + Arrays.toString(image) +
                ", floor=" + floor +
                ", numberOfApartment=" + numberOfApartment +
                ", numberOfRooms=" + numberOfRooms +
                ", square=" + square +
                ", pricePerSquare=" + pricePerSquare +
                ", fullPrice=" + fullPrice +
                ", status=" + status +
                '}';
    }
}