package org.kira.learn.jdk.blockingQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/13 17:15
 */
public class LearnBlockingQueue<E> implements BlockingQueue<E> {


    /**
     * <a href="https://blog.csdn.net/csfun1/article/details/122524692">...</a>
     * <a href="https://note.youdao.com/s/9NidRQLq">...</a>
     */
    public static void main(String[] args) {

        //数组实现
        BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(8);
        //链表实现
        BlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(8);
        //
        BlockingQueue<Integer> synchronousQueue = new SynchronousQueue<>();
        BlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>(8);


    }


    /**
     *
     * @param e element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void put(E e) throws InterruptedException {

    }

    @Override
    public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public E take() throws InterruptedException {
        return null;
    }

    @Override
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return null;
    }

    @Override
    public int remainingCapacity() {
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public int drainTo(Collection<? super E> c) {
        return 0;
    }

    @Override
    public int drainTo(Collection<? super E> c, int maxElements) {
        return 0;
    }


}