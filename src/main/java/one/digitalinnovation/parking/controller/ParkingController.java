package one.digitalinnovation.parking.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.parking.model.Parking;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll() {
        var parking = new Parking();
        parking.setColor("Preto");
        parking.setLicense("mss-1111");
        parking.setModel("VW - Gol");
        parking.setState("PB");

        return Arrays.asList(parking, parking);
    }

}