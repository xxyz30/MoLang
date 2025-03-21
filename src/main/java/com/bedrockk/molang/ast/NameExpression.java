package com.bedrockk.molang.ast;

import com.bedrockk.molang.Expression;
import com.bedrockk.molang.runtime.MoLangEnvironment;
import com.bedrockk.molang.runtime.MoScope;
import com.bedrockk.molang.runtime.value.MoValue;
import lombok.Value;

import java.util.regex.Pattern;

@Value
public class NameExpression implements Expression {

    String name;
    Pattern pattern = Pattern.compile("(math|query|q|variable|v)\\.[\\w_.]+");

    public NameExpression(final String name) {
        assert name != null;
        if (!pattern.matcher(name).matches()) {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        this.name = name;
    }


    @Override
    public MoValue evaluate(MoScope scope, MoLangEnvironment environment) {
        return environment.getValue(name);
    }

    @Override
    public void assign(MoScope scope, MoLangEnvironment environment, MoValue value) {
        environment.setValue(name, value);
    }
}
