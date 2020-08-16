package com.vens.todolist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//Tip: To make lombok to work
//Settings > Build, execution, deployment > Compiler > Annotation Processors > Enable annotation processing
//Install lombok plugin
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="ACTIVITY")
public class ActivityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String description;
}
