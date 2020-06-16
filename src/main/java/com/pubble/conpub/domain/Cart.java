package com.pubble.conpub.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "CART_SEQ_GEN",
        sequenceName = "CART_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Cart {

    @Id
    @Column(name = "cart_no")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "CART_SEQ_GEN"
    )
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    private Member cartMember;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "selected_no")
    private SelectedOption SelectedOption;

    private String cartMemo;
}