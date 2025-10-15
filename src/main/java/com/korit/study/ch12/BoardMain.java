package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {
        // Board배열 - boards -> 게시글 2개

        // Board - id(정수), title(문자열), contents(문자열), writer(Writer), comments(Comment[])

        // Writer - id(정수), name(문자열)

        // Comment - id(정수), contents(문자열), writer(Writer)

        // 1. Board배열 2개의 공간 생성
        // 2. Writer 3명 생성
        // 3. Comment 4개 생성
        // 4. Board 2개 생성 -> 게시글 작성자와 댓글 작성자는 원하는 작성자를 주입한다.

        Writer[] writers = new Writer[3];
        writers[0] = new Writer(101, "백석");
        writers[1] = new Writer(102, "이육사");
        writers[2] = new Writer(103, "윤동주");

        Comment[][] comments = new Comment[2][];
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];

        comments[0][0] = new Comment(1, "안녕하세요.", writers[0]);
        comments[0][1] = new Comment(2, "네 안녕하세요.", writers[1]);
        comments[0][2] = new Comment(3, "반갑습니다.", writers[2]);
        comments[1][0] = new Comment(4, "안녕히 가세요.", writers[2]);
        comments[1][1] = new Comment(5, "조심히 가세요.", writers[1]);
        comments[1][2] = new Comment(6, "네 즐거웠습니다..", writers[0]);

        Board[] boards = new Board[2];
        boards[0] = new Board(1, "인사", "인사합시다.", writers[0], comments[0]);
        boards[1] = new Board(2, "작별", "작별을 고합시다..", writers[2], comments[1]);

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printBoardAll(boards);

    }
}
