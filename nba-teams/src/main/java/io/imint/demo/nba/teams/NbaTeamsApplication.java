package io.imint.demo.nba.teams;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.imint.demo.nba.teams.dao.Team;

/**
 * 
 * <p>Team Service</p>
 * 
 * @author: idong
 * @date: May 9, 2016 4:11:08 PM
 * @version: V1.0
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class NbaTeamsApplication
        implements CommandLineRunner {

    private static List<Team> teams = new ArrayList<Team>();

    public static void main(String[] args) {
        SpringApplication.run(NbaTeamsApplication.class, args);
    }

    /**
     * Init data
     */
    @Override
    public void run(String... args)
            throws Exception {
        teams.add(new Team("SAS", "San Antonio Spurs", "WEST", "Southwest", "San Antonio"));
        teams.add(new Team("CEL", "Boston Celtics", "EAST", "Atlantic", "Boston"));
        teams.add(new Team("OKC", "Oklahoma City Thunder", "WEST", "Northwest", "Oklahoma City"));
    }

    /**
     * Get Team Service
     * 
     * @return team list
     */
    @RequestMapping("/")
    public List<Team> getTeams() {
        return teams;
    }
}
