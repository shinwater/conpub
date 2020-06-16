package com.pubble.conpub.repository;

import com.pubble.conpub.domain.Cart;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class CartRepository {
    @PersistenceContext
    private EntityManager em;

    @PersistenceUnit
    private EntityManagerFactory emf;

    public void save(Cart cart){
        em.persist(cart);
    }
}
