package com.codingrecipe.new_board_app.controller;

import com.codingrecipe.new_board_app.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
}
