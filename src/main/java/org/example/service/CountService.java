package org.example.service;

import org.example.model.CountEntity;
import org.example.repository.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountService {

    @Autowired
    private CountRepository countRepository;

    public void incrementRequestCount() {
        CountEntity entity = new CountEntity();
        entity.setRequestCount((int) (countRepository.count() + 1));
        countRepository.save(entity);
    }
}