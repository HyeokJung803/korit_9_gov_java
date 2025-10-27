package com.korit.study.ch24_1;

import java.util.ArrayList;
import java.util.List;


public class BoardMain2 {
    public static void main(String[] args) {
        List<Board> boards = new ArrayList<>();
        boards.add(new Board());
        boards.get(0).setTitle("게시판 제목1");
        boards.get(0).setWriter(new Writer("김준일", 32));
        boards.get(0).setContent("게시판 내용1");
        boards.get(0).setComments(new ArrayList<>());
        boards.get(0).getComments().add(new Comment(new Writer("김준이", 31), "댓글 내용1"));
        boards.get(0).getComments().add(new Comment(new Writer("김준삼", 31), "댓글 내용2"));

        Board board = new Board();
        board.setTitle("게시판 제목2");
        board.setWriter(new Writer("김준사", 34));
        board.setContent("게시판 내용2");
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(new Writer("김준오", 35), "댓글내용1"));
        comments.add(new Comment(new Writer("김준육", 36), "댓글내용2"));
        board.setComments(comments);
        boards.add(board);

        /// ////////////////////////////////////////////////////////////
        List<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment(new Writer("김준오", 35), "댓글내용1"));
        comments2.add(new Comment(new Writer("김준육", 36), "댓글내용2"));

        Board board2 = new Board("게시판 제목2",
                new Writer("김준사", 34),
                "게시판 내용2",
                comments2);

        boards.add(board2);

        System.out.println(boards);
    }
}
