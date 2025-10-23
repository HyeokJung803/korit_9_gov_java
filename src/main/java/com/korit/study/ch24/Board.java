package com.korit.study.ch24;

import java.util.ArrayList;

public class Board {
    String title;
    Writer writer;
    String content;
    ArrayList comment;

    @Override
    public String toString() {
        return "Board\n" +
                "타이틀 : " + title + "\n" +
                "작성자 : " + writer + "\n" +
                "게시판내용 : " + content + "\n" +
                "댓글 : " + comment + "\n";
    }

    public Board(String title, Writer writer, String content, ArrayList comment) {
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.comment = comment;
    }
}
