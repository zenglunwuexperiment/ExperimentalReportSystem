package com.nanwulife.service;

import com.nanwulife.common.ServerResponse;

public interface IExperimentService {

    public ServerResponse openExp(Integer expId);

    public ServerResponse closeExp(Integer expId);

    public ServerResponse getExpStatus(Integer expId);

}