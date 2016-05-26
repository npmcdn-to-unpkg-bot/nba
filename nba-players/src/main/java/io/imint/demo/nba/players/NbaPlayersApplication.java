package io.imint.demo.nba.players;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.imint.demo.nba.players.dao.Player;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class NbaPlayersApplication
        implements CommandLineRunner {

    private static List<Player> players = new ArrayList<Player>();

    public static void main(String[] args) {
        SpringApplication.run(NbaPlayersApplication.class, args);
    }

    /**
     * init data
     */
    @Override
    public void run(String... args)
            throws Exception {
        players.add(new Player("001", "LaMarcus", "Aldridge", "PF", "2.11", "108.9", "SAS"));
        players.add(new Player("002", "Kevin", "Durant", "SF", "2.06", "108.9", "OKC"));
    }

    /**
     * Get Players List
     * 
     * @return
     */
    @RequestMapping("/")
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Get Players for Team
     * 
     * @param id
     * @return
     */
    @RequestMapping("/teams/{id}")
    public List<Player> getTeamPlayers(@PathVariable String id) {
        return players.stream().filter(py -> py.getTeam().equalsIgnoreCase(id)).collect(Collectors.toList());
    }
}
