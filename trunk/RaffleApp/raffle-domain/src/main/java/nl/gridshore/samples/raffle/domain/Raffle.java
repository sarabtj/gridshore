package nl.gridshore.samples.raffle.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jettro.Coenradie
 * Date: 2-nov-2007
 * Time: 21:23:49
 * Entity class representing a Raffle type
 */
@Entity
@Table (name = "raffles")
public class Raffle extends BaseDomain {
    private String title;
    private String description;
    @OneToMany (mappedBy = "raffle")
    private List<Price> prices;
    @OneToMany (mappedBy = "raffle")
    private List<Participant> participants;

    public Raffle() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

}
