package com.tarmac.janteloo.challenge;

import com.google.gson.Gson;
import com.tarmac.janteloo.challenge.model.Worker;
import com.tarmac.janteloo.challenge.repository.WorkerRepository;
import com.tarmac.janteloo.challenge.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader {

    @Autowired
    WorkerRepository workerRepository;

    private static final String WORKERS_URL = "https://gist.githubusercontent.com/ricardoul/c25bd1ade4d0977ab9bf660fae8dcc81/raw/feaa8243af1b324a995e9a0b3c047b2a79d6cd83/tarmac-team.json";

    public void loadWorkerData() {
        String jsonResponse = HttpUtil.performGet(WORKERS_URL);
        Gson gson = new Gson();
        List<Worker> workers = Arrays.asList(gson.fromJson(jsonResponse, Worker[].class));
        workerRepository.saveAll(workers);
    }
}
