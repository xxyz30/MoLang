package com.bedrockk.molang.ast;

import com.bedrockk.molang.Expression;
import com.bedrockk.molang.runtime.MoLangEnvironment;
import com.bedrockk.molang.runtime.MoScope;
import com.bedrockk.molang.runtime.value.MoValue;
import lombok.Value;

import java.util.Map;

@Value
public class MemberExpression implements Expression {
    Expression object;
    Expression member;

    @Override
    public MoValue evaluate(MoScope scope, MoLangEnvironment environment) {
        return null;
    }

    @Override
    public void assign(MoScope scope, MoLangEnvironment environment, MoValue value) {
        MoValue objectValue = object.evaluate(scope, environment);
//        if (member instanceof NameExpression) {
//            environment.setValue();
//        }
    }
}
