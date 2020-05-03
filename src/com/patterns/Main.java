package com.patterns;

import com.patterns.run.Pattern;

import static com.patterns.run.PatternRunnerFactory.createPatternRunner;

public class Main {

    public static void main(String[] args) {
        createPatternRunner(Pattern.ADAPTER).run();
    }

}
