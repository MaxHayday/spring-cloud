package com.maxhayday.game_of_throns;

import org.springframework.stereotype.Service;

@Service
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean willSurvive(String name) {
        return !name.toLowerCase().contains("stark");
    }
}
