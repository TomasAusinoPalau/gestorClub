package com.example.clubapi.services;

import com.example.clubapi.models.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.clubapi.repositories.Seat.SeatRepo;

@Service
public class SeatService {
    @Autowired
    private SeatRepo seatService;

    public Boolean isBusy(String idSeat) {
        return seatService.isBusy(idSeat);
    }

    public Iterable<Seat> findByIsBusy() {
        return seatService.getAllAvailableSeats();
    }

    public Boolean updateSeatStatus(String idSeat) {
        return seatService.updateStatus(idSeat);
    }

}
