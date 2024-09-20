package com.raman.backend.bookmyshow.service;

import com.raman.backend.bookmyshow.model.Seat;
import com.raman.backend.bookmyshow.repository.SeatRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    private final SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> getSeatsByShowId(Long showId) {
        return seatRepository.findByShowId(showId);
    }
}

