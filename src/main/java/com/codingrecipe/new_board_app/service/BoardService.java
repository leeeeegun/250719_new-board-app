package com.codingrecipe.new_board_app.service;

import com.codingrecipe.new_board_app.dto.BoardDTO;
import com.codingrecipe.new_board_app.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }
}
