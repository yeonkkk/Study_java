import java.util.*;

import static java.util.Collections.*;

public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        // 오른쪽으로 2칸씩 이동
        rotate(list, 2);
        System.out.println(list);

        // 첫 번째와 세 번째 교환
        swap(list, 0, 2);
        System.out.println(list);

        // 저장된 요소의 위치를 임의로 변경
        shuffle(list);
        System.out.println(list);

        // 역순 정렬
        sort(list, reverseOrder());
        System.out.println(list);

        // 정렬
        sort(list);
        System.out.println(list);

        // 3이 저장된 위치를 반환
        int idx = binarySearch(list, 3);
        System.out.println("idx = " + idx);

        System.out.println("max(list) = " + max(list));
        System.out.println("min(list) = " + min(list));
        System.out.println("max(list, reverseOrder()) = " + max(list, reverseOrder()));

        // 리스트를 9로 채운다.
        fill(list, 9);
        System.out.println("list = " + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다.
        // 결과 변경 불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        // 공통 요소가 없으면 true
        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

        replaceAll(list, 2, 1);
        System.out.println("list = " + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2 = " + list2);
    }
}
