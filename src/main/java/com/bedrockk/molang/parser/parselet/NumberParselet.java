package com.bedrockk.molang.parser.parselet;

import com.bedrockk.molang.parser.Expression;
import com.bedrockk.molang.parser.MoLangParser;
import com.bedrockk.molang.parser.PrefixParselet;
import com.bedrockk.molang.parser.expression.NumberExpression;
import com.bedrockk.molang.parser.tokenizer.Token;

public class NumberParselet implements PrefixParselet {

    @Override
    public Expression parse(MoLangParser parser, Token token) {
        return new NumberExpression(Double.parseDouble(token.getText()));
    }
}
