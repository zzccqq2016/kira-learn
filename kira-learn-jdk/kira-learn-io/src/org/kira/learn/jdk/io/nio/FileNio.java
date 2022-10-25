package org.kira.learn.jdk.io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Objects;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/25 22:51
 */
public class FileNio {


    public static final String SRC = "E:\\code\\kira-learn\\kira-learn-jdk\\kira-learn-io\\file\\src.docx";
    public static final String TARGET = "E:\\code\\kira-learn\\kira-learn-jdk\\kira-learn-io\\file\\target.docx";

    public static void main(String[] args) throws IOException {
        FileNio fileNio = new FileNio();
        fileNio.copy(SRC, TARGET);
    }


    public void copy(String src, String target) {

        FileInputStream srcIn = null;
        FileOutputStream targetOut = null;
        FileChannel srcChannel;
        FileChannel targetChannel;
        try {
            File srcFile = new File(src);
            if (!srcFile.exists()) {
                throw new RuntimeException("src文件[" + src + "]不存在;");
            }
            //源文件输入流
            srcIn = new FileInputStream(srcFile);
            //获取源文件通道
            srcChannel = srcIn.getChannel();

            File targetFile = new File(target);

            if (targetFile.exists()) {
                if (!targetFile.delete()) {
                    throw new RuntimeException("target文件[" + target + "]已经存在;");
                }
            }

            if (!targetFile.createNewFile()) {
                throw new RuntimeException("创建target文件[" + target + "]失败;");
            }

            //目标文件输入流
            targetOut = new FileOutputStream(targetFile);
            //获取目标文件通过
            targetChannel = targetOut.getChannel();
            //缓冲区
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            while (true) {
                //从输入通道读取数据到缓冲区
                int read = srcChannel.read(allocate);
                if (read == -1) {
                    break;
                }
                allocate.flip();
                //将缓冲区的数据写入目标文件
                targetChannel.write(allocate);
                allocate.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (Objects.nonNull(srcIn)) {
                try {
                    srcIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (Objects.nonNull(targetOut)) {
                try {
                    targetOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}