package entity;

import java.time.OffsetDateTime;

public class Dwarf {
    private long id;
    private String name;
    private Position position;
    private int healthStatus;
    private Position homeAddress;
    private Position workAddress;
    private OffsetDateTime updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Position getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Position homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Position getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Position workAddress) {
        this.workAddress = workAddress;
    }

    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
