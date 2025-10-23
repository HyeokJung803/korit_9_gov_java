package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        /**
         * [
         *      {
         *          "title": "게시판 제목1",
         *          "writer": {
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [
         *              {
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */
        ArrayList<Writer> writers = new ArrayList<>();
        writers.add(new Writer("김준일", 32));
        writers.add(new Writer("김준이", 30));
        writers.add(new Writer("김준삼", 31));
        writers.add(new Writer("김준사", 33));
        writers.add(new Writer("김준오", 34));
        writers.add(new Writer("김준육", 35));

        ArrayList<Comment> comments1 = new ArrayList<>();
        comments1.add(new Comment(writers.get(1), "댓글내용1"));
        comments1.add(new Comment(writers.get(2), "댓글내용2"));

        ArrayList<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment(writers.get(4), "댓글내용11"));
        comments2.add(new Comment(writers.get(5), "댓글내용22"));

        ArrayList<Board> boards = new ArrayList<>();
        boards.add(new Board("게시판 제목1", writers.get(0), "게시판내용1", comments1));
        boards.add(new Board("게시판 제목2", writers.get(3), "게시판내용2", comments2));

        System.out.println(boards.get(0));
        System.out.println(boards.get(1));
    }
}
