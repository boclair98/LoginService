package com.example.Heeseung.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Entity
@Slf4j
@Getter@Setter
@AllArgsConstructor
public class Member {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String userid;
    private String password;
    private int age;
    private String address;
    private String phonenumber;

    @OneToMany(mappedBy = "member")
    private List<Board> board = new ArrayList<>();
    public Member(){
    }

}
