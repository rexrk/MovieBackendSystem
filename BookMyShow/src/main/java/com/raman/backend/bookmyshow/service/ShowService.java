package com.raman.backend.bookmyshow.service;

import com.raman.backend.bookmyshow.model.Show;
import com.raman.backend.bookmyshow.repository.ShowRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    private final ShowRepository showRepository;

    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public List<Show> getShowsByMovieId(Long movieId) {
        return showRepository.findByMovieId(movieId);
    }
}
