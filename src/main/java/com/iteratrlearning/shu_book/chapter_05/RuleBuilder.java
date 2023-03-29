package com.iteratrlearning.shu_book.chapter_05;

public class RuleBuilder {
    private Condition condition;
    private String name;
    private String description;

    private RuleBuilder(Condition condition) {
        this.condition = condition;
    }

    public static RuleBuilder when(Condition condition) {
        return new RuleBuilder(condition);
    }

    public RuleBuilder named(String name) {
        this.name = name;
        return this;
    }

    public RuleBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public Rule then(Action action) {
        return new Rule(name, description, condition, action);
    }
}
