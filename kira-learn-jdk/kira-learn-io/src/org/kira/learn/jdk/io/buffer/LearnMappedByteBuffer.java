package org.kira.learn.jdk.io.buffer;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/28 0:05
 */
public class LearnMappedByteBuffer {

    private final static String CONTENT = "Zero copy implemented by MappedByteBuffer";
    private final static String FILE_NAME = "mmap.txt";
    private final static String CHARSET = "UTF-8";

    /**
     * <a href="https://pdai.tech/md/java/io/java-io-nio-zerocopy.html">...</a>
     */
    public static void main(String[] args) {
        Path path = Paths.get("E:\\code\\kira-learn\\kira-learn-jdk\\kira-learn-io\\file\\mmap.txt");
        byte[] bytes = CONTENT.getBytes(Charset.forName(CHARSET));
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ,
                StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, bytes.length);
            if (mappedByteBuffer != null) {
                mappedByteBuffer.put(bytes);
                mappedByteBuffer.force();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}