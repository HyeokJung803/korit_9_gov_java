package com.korit.study.ch12;

public class BoardPrintService {
    void printBoardAll(Board[] boards) {
        System.out.println("게시글 정보 전체 출력");
        for (Board board : boards) {
            System.out.println("게시글 번호: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);
            System.out.println("게시글 작성자 이름: " + board.writer.name);
            System.out.println();

            for (Comment comment : board.comments) {
                System.out.println("댓글 ID : " + comment.id);
                System.out.println("댓글 내용 : " + comment.contents);
                System.out.println("댓글 작성자 ID : " + comment.writer.id);
                System.out.println("댓글 작성자 이름 :  " + comment.writer.name);
            }
            System.out.println();
        }
    }
//    void printBoard(Board board) {
//        printContentOfBoard(board);
//        System.out.println();
//        printCommentsOfBoard(board);
//        System.out.println("================================================");
//    }
//    void printContentOfBoard(Board board) {
//        System.out.println("제목: " + board.title);
//        System.out.println("게시판번호 : " + board.id);
//        System.out.println("작성자 : ("+ board.writer.id + ") " +board.writer.name);
//        System.out.println("내용: " + board.contents);
//    }
//    void printCommentsOfBoard(Board board) {
//        System.out.println("(댓글)");
//        for (int i = 0; i < board.comments.length; i++) {
//            System.out.println("(" + board.comments[i].writer.id +") "+ board.comments[i].writer.name);
//            System.out.println(board.comments[i].contents);
//        }
//    }
}
