package io.imint.demo.nba.teams.hystrixBreaker;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.imint.demo.nba.teams.dao.Player;
import io.imint.demo.nba.teams.feignRest.PlayersClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 07/06/2016.
 */
//@Component
//@EnableFeignClients
public class PlayersBreaker {
/*    @Autowired
    private PlayersClient playersClient;

    @HystrixCommand(fallbackMethod = "defaultPlayers")
    public List<Player> getTeamPlayers(String id) {
        return playersClient.getTeamPlayers(id);
    }

    public List<Player> defaultPlayers(String id) {
        return new ArrayList<Player>();
    }*/
}
