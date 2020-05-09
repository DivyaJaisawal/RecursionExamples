package com.divya.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AmazonProblem {

    public static class CustomInput {
        public String id;
        public String last;

        public CustomInput(String id, String last) {
            this.id = id;
            this.last = last;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public List<String> sort(List<String> input) {
        List<CustomInput> customInputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();
        for (String s : input) {
            String[] split = s.split(" ", 2);
            CustomInput customInput = new CustomInput(split[0], split[1]);
            customInputList.add(customInput);
        }
        Collections.sort(customInputList, new Comparator<CustomInput>() {
            @Override
            public int compare(CustomInput o1, CustomInput o2) {
                boolean o1Flag = isDigit(o1.last);
                boolean o2Flag = isDigit(o2.last);
                if (o1Flag && !o2Flag) return 1;
                if (o2Flag && !o1Flag) return -1;
                if (o1.last.equals(o2.last)) {
                    return o1.id.compareTo(o2.id);
                }
                return o1.last.compareTo(o2.last);
            }

            private boolean isDigit(String last) {
                char[] chars = last.toCharArray();
                return (Character.isDigit(chars[0]));
            }
        });

        for (CustomInput c : customInputList) {
            outputList.add(c.id + " " + c.last);
            System.out.println(c.id + " " + c.last);
        }
        return outputList;
    }
}
