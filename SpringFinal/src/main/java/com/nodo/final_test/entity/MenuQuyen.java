package com.nodo.final_test.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "quyen_menu")
public class MenuQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "quyen_id")
    private Quyen nhom_quyen;

    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menu_item;

    @JoinColumn(name = "right_id")
    @ManyToMany
    private List<Right> right_id;
}
