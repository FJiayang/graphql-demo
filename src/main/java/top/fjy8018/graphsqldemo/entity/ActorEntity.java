package top.fjy8018.graphsqldemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * TODO:
 *
 * @author F嘉阳
 * @date 2021/11/5 10:34
 */
@Data
@Entity
@Table(name = "actor", schema = "sakila")
public class ActorEntity {
    @Id
    @Column(name = "actor_id", nullable = false)
    private Integer actorId;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;

}
