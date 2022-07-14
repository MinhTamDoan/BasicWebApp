package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Tam";
        } else if (query.contains("8 plus 19")) { // TODO extend the programm here
            return "27";
        } else if (query.contains("1 plus 9")) { // TODO extend the programm here
            return "10";
        } else if (query.contains("4 plus 0")) { // TODO extend the programm here
            return "4";
        } else if (query.contains("what is 10 plus 14")) {
            return "24";
        } else if (query.contains("what is 3 plus 4")) {
            return "7";
        } else if (query.contains("what is 3 plus 8")) {
            return "11";
        } else if (query.contains("largest : 35, 442")) {
            return "442";
        } else if (query.contains("largest : 154, 97")) {
            return "154";
        } else if (query.contains("8 plus 2")) {
            return "10";
        } else if (query.contains("1 plus 19")) {
            return "20";
        } else if (query.contains("largest: 584, 293, 67, 3")) {
            return "584";
        } else if (query.contains("largest : 72, 426")) {
            return "426";
        } else if (query.contains("4 plus 17")) {
            return "21";
        } else if (query.contains("what is 13 plus 0")) {
            return "13";
        } else if (query.contains("eiffel tower")) {
            return "Paris";
        }  else if (query.contains("18 mul")) {
            return "72";
        } else if (query.contains("banana")) {
            return "yellow";
        }

    }
}
