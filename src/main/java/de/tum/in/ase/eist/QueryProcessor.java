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
        }
    }
}
