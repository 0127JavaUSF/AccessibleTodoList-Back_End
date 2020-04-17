package com.revature.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class S3DaoTest {
	S3Access dao = new S3Access();
	
	@Before
	public void setUp() throws Exception {
		  
	}

	 @Test 
	 public void setFileInS3Test () { assertTrue(dao.setFileInS3("AustralianCattleDog_JimHutchins.jpg")==1); }
	 
	@Test
	public void getFileFromS3Test() {assertTrue(dao.getFileFromS3("AustralianCattleDog_JimHutchins.jpg")==1);}	
	 
	@Test
	public void getPresignedURLTest() {assertNotEquals(dao.getPresignedURL("AustralianCattleDog_JimHutchins.jpg"),null);}
	
}
