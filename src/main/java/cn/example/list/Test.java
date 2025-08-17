package cn.example.list;

import java.util.Arrays;
import java.util.List;

/**
 * @author July
 * @description List操作的一些常见问题
 * @create 2025-08-17 10:26
 */
public class Test {

    public static void main(String[] args) {
        // Arrays.asList()
        int[] nums = new int[]{1,2,3};
        // Arrays.asList()转换基本数据类型的的数组，转换结果不正确
        // 不能把基本类型的数组装箱为包装类型的数组
        List<int[]> list = Arrays.asList(nums);

        System.out.println(Arrays.toString(list.toArray())
        );
    }
}
