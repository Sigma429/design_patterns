import org.junit.Test;

import java.util.ArrayList;

/**
 * ClassName:DemoTest
 * Package:PACKAGE_NAME
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/10 - 13:28
 * @Version:v1.0
 */
public class DemoTest {
    @Test
    public void test() {
        ListNode node = reverse(new ListNode(1, new ListNode(2, null)));
    }

    private ListNode reverse(ListNode o1) {
        ListNode n1 = null;
        while (o1 != null) {
            ListNode o2 = o1.next;
            o1.next = n1;
            n1 = o1;
            o1 = o2;
        }
        return n1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
