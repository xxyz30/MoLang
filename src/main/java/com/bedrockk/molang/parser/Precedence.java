package com.bedrockk.molang.parser;

public enum Precedence {
    ANYTHING,
    SCOPE,

    ASSIGNMENT,
    CONDITIONAL,
    ARRAY_ACCESS,
    MEMBER,

    COALESCE,

    AND,
    OR,

    COMPARE,

    SUM,
    PRODUCT,
    PREFIX,
    ARROW
}
