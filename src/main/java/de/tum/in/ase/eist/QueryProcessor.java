package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        Pattern integerPattern = Pattern.compile("-?\\d+");
        Matcher matcher = integerPattern.matcher(query);

        List<String> integerList = new ArrayList<>();
        while (matcher.find()) {
            integerList.add(matcher.group());
        }
        int[] numbers = new int[integerList];
        int i = 0;
        for (String s : integerList) {
            number[i++] = Integer.parseInt(s);
        }

        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Tam";
        } else if (query.contains("multiplied")) {
            return numbers[0] * numbers[1];
        } else if (query.contains("add")) {
            return numbers[0] + numbers[1];
        } else if (query.contains("largest")) {
            Collections.sort(numbers);
            Collections.reverse(numbers);
            return numbers[0];
        } else if (query.contains("banana")) {
            return "yellow";
        } else if (query.contains("Prime Minister")) {
            return 2002;
        }

    }
}


