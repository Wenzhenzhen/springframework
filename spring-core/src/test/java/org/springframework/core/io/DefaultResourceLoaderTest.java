package org.springframework.core.io;

import org.junit.Test;

/**
 * @title: DefaultResourceLoaderTest
 * @Author wenzhenzhen
 * @Date: 2020/8/13 5:37 下午
 */
public class DefaultResourceLoaderTest {
	@Test
	public void test(){
		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource("/Users/wenzhenzhen1/Downloads/滴滴电子发票.pdf");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("DefaultResourceLoaderTest.java");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/Users/wenzhenzhen1/Downloads/滴滴电子发票.pdf");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));

		FileSystemResourceLoader fileSystemResourceLoader = new FileSystemResourceLoader();
		Resource fileResource3 = fileSystemResourceLoader.getResource("/Users/wenzhenzhen1/Downloads/滴滴电子发票.pdf");
		System.out.println("fileResource3 is FileSystemResource:" + (fileResource3 instanceof FileSystemResource));
	}
}
