package com.example.Heeseung.Service;

import com.example.Heeseung.Entity.Board;
import com.example.Heeseung.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired private BoardRepository boardRepository;
    public void save(Board board){
        boardRepository.save(board);
    }
}
