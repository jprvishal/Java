package com.sharma.algorithm.hackerrank.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        //String expression = "{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))[";
        ArrayList<String> expressions = new ArrayList<>();
        expressions.add("()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}");
        expressions.add("{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))[");
        expressions.add("[)](][[([]))[)");
        expressions.add("]}]){[{{){");
        expressions.add("{[(}{)]]){(}}(][{{)]{[(((}{}{)}[({[}[}((}{()}[]})]}]]))((]][[{{}[(}})[){()}}{(}{{({{}[[]})]{((]{[){[");
        expressions.add("()}}[(}])][{]{()([}[}{}[{[]{]](]][[))(()[}(}{[{}[[]([{](]{}{[){()[{[{}}{[{()(()({}([[}[}[{(]})");
        expressions.add("){[])[](){[)}[)]}]]){](]()]({{)(]])(]{(}(}{)}])){[{}((){[({(()[[}](]})]}({)}{)]{{{");
        expressions.add("[(})])}{}}]{({[]]]))]})]");
        expressions.add("[{");
        expressions.add("{}([{()[]{{}}}])({})");
        expressions.add("{({}{[({({})([[]])}({}))({})]})}");
        expressions.add("()[]");
        expressions.add("{)[])}]){){]}[(({[)[{{[((]{()[]}][([(]}{](])()(}{(]}{})[)))[](){({)][}()((");
        expressions.add("[][(([{}])){}]{}[()]{([[{[()]({}[])()()}[{}][]]])}");
        expressions.add("(}]}");
        expressions.add("(([{()}]))[({[{}{}[]]{}})]{((){}{()}){{}}}{}{{[{[][]([])}[()({}())()({[]}{{[[]]([])}})()]]}}");
        expressions.add("[(([){[](}){){]]}{}([](([[)}[)})[(()[]){})}}]][({[}])}{(({}}{{{{])({]]}[[{{(}}][{)([)]}}");
        expressions.add("()()[()([{[()][]{}(){()({[]}[(((){(())}))]()){}}}])]");
        expressions.add("({)}]}[}]{({))}{)]()(](])})][(]{}{({{}[]{][)){}{}))]()}((][{]{]{][{}[)}}{)()][{[{{[[");
        expressions.add(")}(()[])(}]{{{}[)([})]()}()]}(][}{){}}})}({](){([()({{(){{");
        expressions.add("}([]]][[){}}[[)}[(}(}]{(}[{}][{}](}]}))]{][[}(({(]}[]{[{){{(}}[){[][{[]{[}}[)]}}]{}}(}");

        for (String expression : expressions) {
            String result = checkForBalancedBrackets(expression);
            System.out.println(result);
        }
    }

    private static String checkForBalancedBrackets(String expression) {
        String result = "YES";

        if (expression == null) {
            return result;
        }

        if (expression.length() % 2 > 0) {
            return "NO";
        }

        HashMap<Character, Character> openCloseBracketsMap = new HashMap<>();
        openCloseBracketsMap.put('}', '{');
        openCloseBracketsMap.put(')', '(');
        openCloseBracketsMap.put(']', '[');

        Stack<Character> bracketsStack = new Stack<>();
        char[] brackets = expression.toCharArray();
        for (Character bracket : brackets) {
            if (bracket == '}' || bracket == ')' || bracket == ']') {
                if (!bracketsStack.empty()) {
                    char bracketInStack = bracketsStack.pop();
                    if (bracketInStack != openCloseBracketsMap.get(bracket)) {
                        result = "NO";
                        break;
                    }
                } else {
                    result = "NO";
                    break;
                }
            } else {
                bracketsStack.push(bracket);
            }
        }

        if (!bracketsStack.empty()) {
            result = "NO";
        }

        return result;
    }
}
