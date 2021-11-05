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
@Table(name = "address", schema = "sakila")
public class AddressEntity {
    @Id
    @Column(name = "address_id", nullable = false)
    private Integer addressId;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Column(name = "address2", nullable = true, length = 50)
    private String address2;

    @Column(name = "district", nullable = false, length = 20)
    private String district;

    @Column(name = "postal_code", nullable = true, length = 10)
    private String postalzCode;

    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Column(name = "location", nullable = false)
    private Object location;

    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;

}
