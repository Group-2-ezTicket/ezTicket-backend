package com.ezticket.mapper;

import com.ezticket.dto.CinemaRequest;
import com.ezticket.dto.CinemaResponse;
import com.ezticket.model.Cinema;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CinemaMapper {
    public CinemaResponse toResponse(Cinema cinema) {
        CinemaResponse cinemaResponse = new CinemaResponse();
        BeanUtils.copyProperties(cinema, cinemaResponse);
        return cinemaResponse;
    }

    public List<CinemaResponse> toResponse(List<Cinema> cinema) {
        return cinema.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
