package com.iteratrlearning.shu_book.chapter_05;

public class Rule {

    private String name;
    private String description;
    private Condition condition;
    private Action action;

    public Rule(String name, String description, Condition condition, Action action) {
        this.name = name;
        this.description = description;
        this.condition = condition;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void perform(Facts facts) {
        if(condition.evaluate(facts)){
            action.execute(facts);
        }
    }
}

