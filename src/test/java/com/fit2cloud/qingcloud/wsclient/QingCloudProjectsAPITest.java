package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudProject;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeProjectsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeProjectsResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class QingCloudProjectsAPITest {

	private static IQingCloudWSClient qingCloudWSClient;
	private static String accessKey;
	private static String secretKey;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File("/opt/.qingcloud/credential.txt")));
		accessKey = properties.getProperty("AccessKeyID");
		secretKey = properties.getProperty("SecretKey");
		qingCloudWSClient = new QingCloudWSClient(accessKey, secretKey);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDescribeProjects() throws Exception {
		DescribeProjectsRequest request = new DescribeProjectsRequest();
		request.setLimit(20);
		request.setOffset(0);
		DescribeProjectsResponse response = qingCloudWSClient.describeProjects(request);
		assertTrue(response!=null);
		System.out.println("DescribeProjectsResponse.getRet_code()=" + response.getRet_code()+", getTotal_count() = "+response.getTotal_count());

		List<QingCloudProject> projects = response.getProject_set();
		for(QingCloudProject project : projects) {
			System.out.println("project :: "+project);
		}
	}
}
