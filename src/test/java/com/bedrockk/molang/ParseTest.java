package com.bedrockk.molang;

import com.bedrockk.molang.utils.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;

@DisplayName("Parse Tests")
public class ParseTest {

    @Test
    @DisplayName("Parse File 1")
    public void parse1() throws IOException {
        Assertions.assertDoesNotThrow(() -> MoLang.parse(getClass().getClassLoader().getResourceAsStream("expr1.txt")));
    }

    @Test
    @DisplayName("Parse File ")
    public void parse2() throws IOException {
        Assertions.assertDoesNotThrow(() -> MoLang.parse(getClass().getClassLoader().getResourceAsStream("expr2.txt")));
    }

    @Test
    @DisplayName("Parse File 3")
    public void parse3() throws IOException {
        Assertions.assertDoesNotThrow(() -> MoLang.parse(getClass().getClassLoader().getResourceAsStream("expr3.txt")));
    }

    @Test
    @DisplayName("Parse File 4")
    public void parse4() throws IOException {
        Assertions.assertDoesNotThrow(() -> MoLang.parse(getClass().getClassLoader().getResourceAsStream("expr4.txt")));
    }

    @Test
    @DisplayName("Parse Member Test")
    public void parseMemberExpr() throws IOException {
        List<Expression> parse = MoLang.parse(getClass().getClassLoader().getResourceAsStream("member.txt"));
        System.out.println(parse);
    }
    @Test
    @DisplayName("Syntax Error Test")
    public void syntaxError() throws IOException {
        String s = FileUtils.readFile(getClass().getClassLoader().getResourceAsStream("syntaxError.txt"));

        for (String expr : s.split("\n")) {
            try {
                MoLang.parse(expr);
                System.out.println("success: " + expr);
            } catch (Exception e) {
                System.err.println( e.getMessage());
            }
        }
    }
}
