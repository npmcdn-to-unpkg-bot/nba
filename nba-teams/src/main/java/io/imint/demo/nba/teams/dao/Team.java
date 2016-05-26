package io.imint.demo.nba.teams.dao;

/**
 * 
 * <p>Desc</p>
 * 
 * @author: idong
 * @date: May 9, 2016 4:10:10 PM
 * @version: V1.0
 */
public class Team {
    private String id;
    private String name;
    private String zone;
    private String division;
    private String city;

    public Team(String id, String name, String zone, String division, String city) {
        super();
        this.id = id;
        this.name = name;
        this.zone = zone;
        this.division = division;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
