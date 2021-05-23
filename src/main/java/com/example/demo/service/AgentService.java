package com.example.demo.service;

import com.example.demo.model.Agent;
import com.example.demo.repository.AgentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AgentService {

    private final AgentRepository agentRepository;

    public List<Agent> getAgents() {
        return agentRepository.findAll();
    }

    public Agent getAgentById(Long id) {
        return agentRepository.findById(id).get();
    }
}
