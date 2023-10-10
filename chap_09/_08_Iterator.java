package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터(반복자) : 컬렉션(Collection) 또는 데이터 구조(data structure)와 같은 자료구조에서 요소(element)들을 순차적으로 접근하고 반복(iterate)할 때 사용하는 인터페이스.
        // -> 이터레이터를 사용하면 컬렉션 내의 요소들을 순회하면서 각 요소에 접근할 수 있습니다.
        List<String> list = new ArrayList<>(); // "List" 인터페이스를 참조한 "ArrayList" 클래스에서 "String" 타입인 "list" 객체를 생성.
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------");

        Iterator<String> it = list.iterator();
        // list.iterator(); -> 반환형을 가진 메소드에 마우스를 올리고 "Ctrl + Alt + V"를 누르면 위에 코드처럼 자동완성이 된다.
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("------------------------");
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // "it"리스트 에서 다음에 가져올 반복문이 있으면 True
            System.out.println(it.next());
        }
        System.out.println("------------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) { // 이터레이터를 사용하여 순회
            System.out.println(itSet.next());
        }
        System.out.println("------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() // key 와 Value 때문에 map에서는 이터레이터가 제공되지 않음 사용하려면 key 따로 Value 따로 사용해야함.
        Iterator<String> itMapKey = map.keySet().iterator(); // map.keySet().iterator() 입력 후 -> ctrl + Alt + V
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("------------------------");

        Iterator<Integer> itMapValue = map.values().iterator(); // map.Values().iterator() 입력 후 -> ctrl + Alt + V
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("------------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator(); // map.entrySet.iterator() 입력 후 -> ctrl + Alt + V
        // "Iterator"를 참조한 "map.entrySet().iterator()"에서 "Map.Entry<String, Integer>" 타입인 "itMap" 객체를 만든다.
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
