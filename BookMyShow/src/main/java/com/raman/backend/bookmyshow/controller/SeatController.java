package com.raman.backend.bookmyshow.controller;

import com.raman.backend.bookmyshow.model.Seat;
import com.raman.backend.bookmyshow.service.SeatService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/show/{showId}")
    public List<Seat> getSeatsByShowId(@PathVariable Long showId) {
        return seatService.getSeatsByShowId(showId);
    }
}
