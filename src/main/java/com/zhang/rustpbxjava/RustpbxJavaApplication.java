package com.zhang.rustpbxjava;

import org.springframework.ai.autoconfigure.vectorstore.pinecone.PineconeVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 如果需要使用 Pinecone 向量存储, 请移除 exclude 中的 PineconeVectorStoreAutoConfiguration
@SpringBootApplication(exclude = PineconeVectorStoreAutoConfiguration.class)
public class RustpbxJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RustpbxJavaApplication.class, args);
    }

}
