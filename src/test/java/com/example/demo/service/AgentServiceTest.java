package com.example.demo.service;

import com.example.demo.model.Agent;
import com.example.demo.repository.AgentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class AgentServiceTest {

    @InjectMocks
    private AgentService agentService;

    @Mock
    private AgentRepository agentRepository;

    @Test
    public void testGetAllAgents() {
        List<Agent> agents = Arrays.asList(createAgent());
        when(agentRepository.findAll()).thenReturn(agents);
        List<Agent> fetchedAgents = agentService.getAgents();
        assertThat(fetchedAgents.get(0).getName(), is(agents.get(0).getName()));
        assertThat(fetchedAgents.get(0).getSalary(), is(agents.get(0).getSalary()));
        assertThat(fetchedAgents.get(0).getExperience(), is(agents.get(0).getExperience()));
    }

    @Test
    public void testGetAgentById() {
        Agent expectedAgent = createAgent();
        when(agentRepository.findById(1L)).thenReturn(Optional.of(expectedAgent));
        Agent fetchedAgent = agentService.getAgentById(1L);
        assertThat(fetchedAgent.getId(), is(fetchedAgent.getId()));
        assertThat(fetchedAgent.getExperience(), is(fetchedAgent.getExperience()));
        assertThat(fetchedAgent.getSalary(), is(fetchedAgent.getSalary()));
        assertThat(fetchedAgent.getName(), is(fetchedAgent.getName()));
    }

    private Agent createAgent() {
        Agent expectedAgent = new Agent("Tom", 100, 5);
        expectedAgent.setId(1L);
        return expectedAgent;
    }
}