package cn.example.cow.al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author July
 * @description 并发迭代器问题演示
 * @create 2025-08-17 8:14
 */
public class JulyConcurrentIteratorTest {

//    private static List<String> list = new ArrayList<>();
    private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        list.add("qqq");
        list.add("dffq");
        list.add("qqfegt");
        list.add("vdfgvd");
        list.add("dewdf");

        // 开启线程池，提交10个线程用于在list尾部添加5个元素123
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                for (int j = 0; j < 5; j++) {
                    list.add("123");
                }
            });
        }

        // 使用迭代器遍历
        Iterator<String> iterator = list.iterator();
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        service.shutdown();
    }

}
