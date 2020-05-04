package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Status status;
    @ManyToOne(targetEntity = User.class)
    private User user;
    private Long creationTime;

    public Cart(Status status, User user, Long creationTime) {
        this.status = status;
        this.user = user;
        this.creationTime = creationTime;
    }
}
