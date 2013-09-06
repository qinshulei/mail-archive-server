package org.apache.sling.mailarchiveserver.impl;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.sling.mailarchiveserver.impl.Mime4jMboxParserImpl.Mime4jParserIterator;
import org.junit.Test;

/**
 * In this class there is a test that parses big file. It will take a while to execute.
 */
public class Mime4jMboxParserImplStreamingTest {

	private Mime4jMboxParserImpl parser = new Mime4jMboxParserImpl();

	private static final String TEST_FILES_FOLDER = Mime4jMboxParserImplTest.TEST_FILES_FOLDER;
	private static final double TEST_FILE_RATIO = 1.2;

	@Test
	public void testParseIsStreaming() throws IOException {
		File tempf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File fileToSample = new File(TEST_FILES_FOLDER + "mbox/tomcat-dev-201204.mbox");
			long maxMem = Runtime.getRuntime().maxMemory();
			int cnt = (int) (maxMem * TEST_FILE_RATIO / fileToSample.length()) + 1;

			fis = new FileInputStream(fileToSample);
			byte[] sample = new byte[(int) fileToSample.length()];
			if (fis.read(sample) != fileToSample.length()) 
				throw new RuntimeException();

			tempf = File.createTempFile("MAS_", ".mbox");
			fos = new FileOutputStream(tempf);
			for (int i = 0; i < cnt; i++) {
				fos.write(sample);
			}
			fos.flush();
			fos.close();
			fos = null;

			parser.parse(new FileInputStream(tempf));

		} catch(OutOfMemoryError e) {
			fail("Parser is not streaming");
		} finally {
			if (tempf != null) {
				tempf.delete();
			}
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}

	@Test
	public void testTempFileIsDeleted() throws IOException {
		File testFile = new File(TEST_FILES_FOLDER + "mbox/tomcat-dev-201204.mbox");
		Mime4jParserIterator iter = (Mime4jParserIterator) parser.parse(new FileInputStream(testFile));
		if (new File(iter.tempFileAbsPath).exists())
			fail("Temp file was not deleted");
	}	

}