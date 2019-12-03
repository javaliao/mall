package com.javaliao.backstage.vo;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.net.InetAddress;


/**
 * 实现 FastDFS 文件管理
 *      文件上传
 *      文件删除
 *      文件下载
 *      文件信息互殴去
 *      storage 信息获取
 *      tracker 信息获取
 */
public class FastDFSUtil {
    /**
     * 初始化连接 tracker 链接信息
     */
    static {
        try {
            // new ClassPathResource("fdfs_client.conf").getPath(); 获取classPath目录下的文件
            String path = new ClassPathResource("fdfs_client.conf").getPath();
            // 初始化连接 tracker 链接信息
            ClientGlobal.init(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件上传
     * @param fastDFSFile
     */
    public static String upload(FastDFSFile fastDFSFile) throws IOException, MyException {
        // new 一个客户端对象 TrackerClient，用于访问 TrackerServer
        TrackerClient trackerClient = new TrackerClient();
        // 通过 TrackerClient 获取连接，得到 TrackerServer 对象
        TrackerServer trackerServer = trackerClient.getConnection();
        // 通过 trackerClient 的链接信息可以获取 StorageServer 的链接信息
        StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
        // new 一个Storage客户端访问对象 StorageClient，通过 trackerServer、storageServer 对象
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);

        // 第一个参数是：上传文件的字节数组
        // 第二个参数是：文件的扩展名
        // 第三个参数是；附加信息 NameValuePair[]
        // 假设虚拟附加参数
        NameValuePair[] list = new NameValuePair[1];
        NameValuePair nameValuePair = new NameValuePair("address", "上海");
        list[0] =  nameValuePair;

        // 通过 StorageClient 访问 storage ，实现文件上传，并且获取文件上传后的存储信息
        String[] rsp = storageClient.upload_file(fastDFSFile.getContent(), fastDFSFile.getExt(), list);
        // 文件服务器
        String ipPort = "http://192.168.134.100";
        // rsp[0] 分组信息
        // rsp[1] 分组中的具体存储地址
        String url = rsp[0] + rsp[1];
        return ipPort + url;
    }

    /**
     * 获取文件信息
     * @param groupName
     * @param remoteFileName
     * @return
     * @throws IOException
     * @throws MyException
     */
    public static FileInfo getFileInfo(String groupName, String remoteFileName) throws IOException, MyException {
        // new 一个客户端对象 TrackerClient，用于访问 TrackerServer
        TrackerClient trackerClient = new TrackerClient();
        // 通过 TrackerClient 获取连接，得到 TrackerServer 对象
        TrackerServer trackerServer = trackerClient.getConnection();
        // 通过 trackerClient 的链接信息可以获取 StorageServer 的链接信息
        StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
        // new 一个Storage客户端访问对象 StorageClient，通过 trackerServer、storageServer 对象
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        FileInfo fileInfo = storageClient.get_file_info(groupName, remoteFileName);
        return fileInfo;
    }

    /**
     * 下载文件
     * @param groupName
     * @param remoteFileName
     * @return
     * @throws IOException
     * @throws MyException
     */
    public static byte[] download(String groupName, String remoteFileName) throws IOException, MyException {
        //
        TrackerClient trackerClient = new TrackerClient();
        //
        TrackerServer trackerServer = trackerClient.getConnection();
        //
        StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
        //
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);

        byte[] bytes = storageClient.download_file(groupName, remoteFileName);

        return bytes;
    }

    /**
     * 删除文件
     * @param groupName
     * @param remoteFileName
     * @return
     * @throws IOException
     * @throws MyException
     */
    public static int delete(String groupName, String remoteFileName) throws IOException, MyException {
        //
        TrackerClient trackerClient = new TrackerClient();
        //
        TrackerServer trackerServer = trackerClient.getConnection();
        //
        StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
        //
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);

        int result = storageClient.delete_file(groupName, remoteFileName);
        return result;
    }

    /**
     * 获取 storage 信息
     * @return
     * @throws IOException
     */
    public static String getStorage() throws IOException {
        //
        TrackerClient trackerClient = new TrackerClient();
        //
        TrackerServer trackerServer = trackerClient.getConnection();
        //
        StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);

        // 获取 storage
        int storePathIndex = storageServer.getStorePathIndex();
        InetAddress address = storageServer.getInetSocketAddress().getAddress();
        String hostName = storageServer.getInetSocketAddress().getHostName();
        String hostString = storageServer.getInetSocketAddress().getHostString();
        int port = storageServer.getInetSocketAddress().getPort();
        StringBuilder sb = new StringBuilder();
        sb.append("storePathIndex is ").append(storePathIndex).append("; ")
                .append("address is ").append(address).append("; ")
                .append("hostName is ").append(hostName).append("; ")
                .append("hostString is ").append(hostString).append("; ")
                .append("port is ").append(port).append("; ");

        return sb.toString();
    }

    /**
     * 获取 storage 组的 ip 和端口
     * @param groupName
     * @param remoteFileName
     * @return
     * @throws IOException
     */
    public static ServerInfo[] getStorageGroupInfo(String groupName, String remoteFileName) throws IOException {
        //
        TrackerClient trackerClient = new TrackerClient();
        //
        TrackerServer trackerServer = trackerClient.getConnection();

        ServerInfo[] fetchStorage = trackerClient.getFetchStorages(trackerServer, groupName, remoteFileName);
        return fetchStorage;
    }

    /**
     * 获取 tracker 地址
     * @return
     * @throws IOException
     */
    public static String getTrackerInfo() throws IOException {
        //
        TrackerClient trackerClient = new TrackerClient();
        //
        TrackerServer trackerServer = trackerClient.getConnection();

        String hostString = trackerServer.getInetSocketAddress().getHostString();
        return hostString;
    }
}
