package top.fjy8018.graphsqldemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * TODO:
 *
 * @author F嘉阳
 * @date 2021/11/5 10:35
 */
@Data
@Entity
@Table(name = "city", schema = "sakila")
public class CityEntity {
    @Id
    @Column(name = "city_id", nullable = false)
    private Integer cityId;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;
}
