package laicode;

import java.util.*;

public class goldman {
    public int findrank(List<List<Integer>> matrix, int rank) {
        int[] person = new int[matrix.size()];
        int i = 0;
        Arrays.fill(person, 0);
        for (List<Integer> list : matrix) {
            for (Integer num : list) {
                person[i] += num;
                System.out.println(person[i]);
            }
            i++;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < person.length; j++) {
            map.put(person[j],j);
        }
//        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(rank, new Comparator<Map.Entry<Integer,Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> t1) {
//                return o1.getKey().compareTo(t1.getValue());
//            }
//        });
        Arrays.sort(person);
        return map.get(person[person.length - rank]);

    }
        public static void main (String[]args){
            List<List<Integer>> matrix = new ArrayList<>();
            List<Integer> list1 = new ArrayList<>();
            list1.add(100);
            list1.add(20);
            List<Integer> list2 = new ArrayList<>();
            list2.add(10);
            list2.add(21);
            List<Integer> list3 = new ArrayList<>();
            list3.add(19);
            list3.add(20);
            List<Integer> list4 = new ArrayList<>();
            list4.add(30);
            list4.add(110);
            matrix.add(list1);
            matrix.add(list2);
            matrix.add(list3);
            matrix.add(list4);
            goldman g = new goldman();
            System.out.println(g.findrank(matrix, 2));

        }
    }
