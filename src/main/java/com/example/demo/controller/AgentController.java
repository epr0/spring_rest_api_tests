package com.example.demo.controller;

import com.example.demo.model.Agent;
import com.example.demo.service.AgentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/agents")
@Slf4j
@AllArgsConstructor
public class AgentController {

    private final AgentService agentService;

    @GetMapping("/") // localhost:1111/api/agent/
    public List<Agent> getAgents() {
        log.info("Fetching agents from database...");
        return agentService.getAgents();
    }

    @GetMapping("/{id}")
    public Agent getAgentById(@PathVariable Long id) {
        log.info("Fetching agent by give id " + id);
        return agentService.getAgentById(id);
    }
}
