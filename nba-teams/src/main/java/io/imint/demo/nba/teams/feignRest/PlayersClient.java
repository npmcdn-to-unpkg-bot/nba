package io.imint.demo.nba.teams.feignRest;

import io.imint.demo.nba.teams.dao.Player;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by ivan on 01/06/2016.
 */
@FeignClient("players")
public interface PlayersClient {
    @RequestMapping(method = RequestMethod.GET, value = "/teams/{id}")
    List<Player> getTeamPlayers(@PathVariable("id") String id);
}

